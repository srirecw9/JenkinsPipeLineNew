FROM openjdk:21
COPY target/spring-devops.jar spring-devops.jar
ENTRYPOINT ["java","-jar","/spring-devops.jar"]
