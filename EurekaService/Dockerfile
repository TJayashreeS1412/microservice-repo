FROM openjdk:11.0-jdk

ADD ./target/EurekaService-0.0.1-SNAPSHOT.jar /eureka-service/app/EurekaService-0.0.1-SNAPSHOT.jar

WORKDIR eureka-service/app

ENTRYPOINT ["java","-jar","EurekaService-0.0.1-SNAPSHOT.jar"]

EXPOSE 8761
