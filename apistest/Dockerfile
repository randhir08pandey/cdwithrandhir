FROM openjdk
WORKDIR /opt
ENV Port 8080
EXPOSE 8080
COPY target/* .jar/opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
