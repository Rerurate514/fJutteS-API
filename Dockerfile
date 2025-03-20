## ベースイメージ
#FROM openjdk:17-jdk-slim
#
## 作業ディレクトリを指定
#WORKDIR /app
#
## 必要なファイルをコンテナ内にコピー
#COPY . /app
#
## 実行権限を付与（gradlew）
#RUN chmod +x ./gradlew
#
## ポート番号の公開
#EXPOSE 8080
#
## アプリケーションの起動コマンド
#CMD ["./gradlew", "bootRun"]

# --- マルチステージビルド：ビルドステージ ---
# Amazon Corretto 17 をベースイメージとして使用 (Render.com で推奨されることが多い)
FROM amazoncorretto:17 AS build

# 作業ディレクトリを設定
WORKDIR /home/app

# ソースコードをコピー (効率のため .dockerignore を活用)
COPY . .

# Gradle Wrapper に実行権限を付与
RUN chmod +x ./gradlew

# キャッシュを活用しつつ、依存関係を解決し、アプリケーションをビルド
# --no-daemon: デーモンを使わないことで、CI/CD環境での問題を避ける
# --build-cache: 以前のビルド結果を再利用し、ビルド時間を短縮
RUN ./gradlew build --no-daemon --build-cache

# --- マルチステージビルド：実行ステージ ---
# 軽量な Alpine Linux ベースの Amazon Corretto 17 を使用
FROM amazoncorretto:17-alpine

# ARG で JAR ファイル名を指定可能に (柔軟性向上)
ARG JAR_FILE=build/libs/*.jar

# ビルドステージから JAR ファイルをコピー
COPY --from=build /home/app/$JAR_FILE /usr/local/lib/app.jar

# ポートを公開
EXPOSE 8080

# アプリケーションを起動 (ENTRYPOINT で java -jar を使用)
# -Dfile.encoding=UTF-8: 文字化け対策
# -Dspring.profiles.active=production (または適切なプロファイル): 環境変数で上書き可能
ENTRYPOINT ["java", "-jar", "-Dfile.encoding=UTF-8", "-Dspring.profiles.active=production", "/usr/local/lib/app.jar"]