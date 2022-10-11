FROM openjdk:11.0.16-slim
COPY target/ms-discovery-0.0.1.jar ms-discovery-0.0.1.jar
RUN mkdir -p /opt/arqui_software/logs
VOLUME /opt/arqui_software/logs

ENV SERVER_PORT 8761
ENV HOSTNAME "ms-discovery"


ENTRYPOINT ["java","-jar","/ms-discovery-0.0.1.jar"]



