FROM openjdk:8-jdk-alpine

COPY target/ssi-0.0.1-SNAPSHOT.jar .

CMD /usr/bin/java -Xmx400m -Xms400m -jar ssi-0.0.1-SNAPSHOT.jar

EXPOSE 8080
