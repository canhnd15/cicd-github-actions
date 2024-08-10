FROM openjdk:17-jdk

WORKDIR /app

COPY target/cicd-demo-*.jar /app/cicd-demo.jar

EXPOSE 8090

CMD ["java", "-jar", "cicd-demo.jar"]