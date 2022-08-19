FROM openjdk:17-jdk-slim-buster
COPY target/*.jar k8s-demo.jar
ENTRYPOINT ["java","-jar","/k8s-demo.jar"]
