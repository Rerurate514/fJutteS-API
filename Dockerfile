# ベースイメージ
FROM openjdk:17-jdk-slim

# 作業ディレクトリを指定
WORKDIR /app

# 必要なファイルをコンテナ内にコピー
COPY . /app

# 実行権限を付与（gradlew）
RUN chmod +x ./gradlew

# ポート番号の公開
EXPOSE 8080

# アプリケーションの起動コマンド
CMD ["./gradlew", "bootRun"]