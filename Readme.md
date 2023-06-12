Create Dockerfile
#####################################################################
FROM openjdk:17-alpine
#Firm name
MAINTAINER aerdem.com
#Add application's jar to the container
COPY target/DockerizedChat-0.0.1-SNAPSHOT.jar DockerizedChat-0.0.1-SNAPSHOT.jar
#Execute the application
ENTRYPOINT ["java","-jar","/DockerizedChat-0.0.1-SNAPSHOT.jar"]
#########################################################################


mvn clean install
docker build . -t ahmeterdem/dockerizedchat

ahmeterdem:username
dockerizedchat: image name

docker images


docker run - p 8082:8082 ahmeterdem/dockerizedchat