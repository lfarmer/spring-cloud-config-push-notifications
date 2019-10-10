FROM openjdk:8-jre-alpine
EXPOSE 8080
VOLUME /tmp
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
# Add the service itself
ADD target/*.jar /app.jar