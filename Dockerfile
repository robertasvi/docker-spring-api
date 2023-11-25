FROM openjdk:11
WORKDIR target
COPY . target
RUN ls -la
ADD target/api-0.0.1-SNAPSHOT.jar docker-spring-api.jar
ENV JAVA_OPTS=""
EXPOSE 9080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /docker-spring-api.jar" ]
