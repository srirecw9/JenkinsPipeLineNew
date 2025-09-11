FROM openjdk:17-jdk-alpine
COPY target/spring-devops.jar spring-devops.jar
CMD ["java","-jar","/spring-devops.jar"]
EXPOSE 8080
