
FROM openjdk:11.0-jdk

ADD ./target/zuulservice-0.0.1-SNAPSHOT.jar /zuul-service/app/zuulservice-0.0.1-SNAPSHOT.jar

WORKDIR zuul-service/app

ENTRYPOINT ["java","-jar","zuulservice-0.0.1-SNAPSHOT.jar"]

EXPOSE 8086
