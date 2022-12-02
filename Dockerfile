FROM openjdk:17-jdk-slim
ENV APP_HOME=/home/amir/IdeaProjects/microservice-user-management
WORKDIR $APP_HOME
COPY build/lib/*.jar app.jar
EXPOSE 8080
CMD ["fileToRun", "param1", "param2"]