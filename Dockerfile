FROM eclipse-temurin:21-jdk
COPY DevOps/target/DevOps-1.0-SNAPSHOT.jar /tmp/DevOps-1.0-SNAPSHOT.jar
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "DevOps-1.0-SNAPSHOT.jar"]