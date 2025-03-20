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

FROM amazoncorretto:17 AS build
COPY ./ /home/app
RUN cd /home/app && ./gradlew build

FROM amazoncorretto:17-alpine
COPY --from=build /home/app/build/libs/spring-render-deploy-0.0.1-SNAPSHOT.jar /usr/local/lib/spring-render-deploy.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","-Dfile.encoding=UTF-8","/usr/local/lib/spring-render-deploy.jar"]