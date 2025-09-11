FROM openjdk:17-jdk-slim
ADD target/spring-devops.jar spring-devops.jar
CMD ["java","-jar","/spring-devops.jar"]
EXPOSE 8080
