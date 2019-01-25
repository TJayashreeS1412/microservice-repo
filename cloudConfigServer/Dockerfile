FROM openjdk:11.0-jdk

ADD ./target/cloudConfigServer-0.0.1-SNAPSHOT.jar /config-server/app/cloudConfigServer-0.0.1-SNAPSHOT.jar

WORKDIR config-server/app

ENTRYPOINT ["java","-jar","cloudConfigServer-0.0.1-SNAPSHOT.jar"]

EXPOSE 8088

