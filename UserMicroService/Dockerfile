
FROM openjdk:11.0-jdk

ADD ./target/MuzixApplication-0.0.1-SNAPSHOT.jar /users-service/app/MuzixApplication-0.0.1-SNAPSHOT.jar

WORKDIR users-service/app

ENTRYPOINT ["java","-jar","MuzixApplication-0.0.1-SNAPSHOT.jar"]

EXPOSE 8089


