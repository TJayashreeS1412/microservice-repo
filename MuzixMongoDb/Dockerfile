


FROM openjdk:11.0-jdk

ADD ./target/LombokDemo-0.0.1-SNAPSHOT.jar /tracks-service/app/LombokDemo-0.0.1-SNAPSHOT.jar

WORKDIR tracks-service/app

ENTRYPOINT ["java","-jar","LombokDemo-0.0.1-SNAPSHOT.jar"]

EXPOSE 8081
