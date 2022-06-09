FROM adoptopenjdk/openjdk11:alpine
EXPOSE 8080
COPY target/*.jar postgre-elastic-sync.jar
ENTRYPOINT ["java","-jar","/postgre-elastic-sync.jar"]