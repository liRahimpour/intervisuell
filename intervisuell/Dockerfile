FROM eclipse-temurin:17-jdk-alpine

COPY target/intervisuell-*.jar /opt/app/app.jar

WORKDIR /opt/app

ENTRYPOINT ["java", "-jar", "app.jar"]