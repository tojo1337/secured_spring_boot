FROM openjdk:22-oracle
WORKDIR /app
COPY target/sample-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","/app/sample-0.0.1-SNAPSHOT.jar"]
EXPOSE 8443
