FROM eclipse-temurin:17-jdk-alpine
COPY /*.jar barisan.jar
ENTRYPOINT ["java","-jar","/barisan.jar"]