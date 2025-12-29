#starts with a base image containing Java runtime
FROM openjdk:17.0.1-jdk-oracle

#Add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.01-SNAPSHOT.jar

#excute the application
ENTRYPOINT ["java", "-jar","accounts-0.01-SNAPSHOT.jar"]