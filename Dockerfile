FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /app
COPY target/multicontainer_dockercompose-0.0.1.jar /app
CMD ["java", "-jar", "multicontainer_dockercompose-0.0.1.jar"]
