FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/*.jar

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# expose port of docker
EXPOSE 8080

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]