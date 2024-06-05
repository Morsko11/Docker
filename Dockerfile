FROM openjdk:19-alpine3.14
WORKDIR /app
COPY src/main/java/Main.java .
RUN javac Main.java
CMD ["java","Main"]

