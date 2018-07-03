FROM openjdk:8
ADD target/feignenabled-client.jar feignenabled-client.jar
EXPOSE 8200
ENTRYPOINT ["java","-jar","feignenabled-client.jar"]