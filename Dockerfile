FROM openjdk:21
VOLUME /tmp
EXPOSE 8003
ARG JAR_FILE=target/services-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]