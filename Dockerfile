FROM maven:3.8.1-openjdk-11 as maven
COPY . /app
WORKDIR /app
RUN mvn clean -B package -DskipTests

FROM openjdk:11
COPY --from=maven /app/target/desa-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
