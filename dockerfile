FROM --platform=linux/amd64 amazoncorretto:17-alpine
VOLUME /tmp 
COPY target/aws1_loan_ms-0.0.1-SNAPSHOT.jar loan-ms.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/loan-ms.jar"]
