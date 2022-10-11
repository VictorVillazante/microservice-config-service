FROM openjdk:11.0.16-slim
COPY target/ms-customer-0.0.1.jar ms-customer-0.0.1.jar
RUN mkdir -p /opt/arqui_software/logs
VOLUME /opt/arqui_software/logs

ENV SERVER_PORT 8930
ENV EUREKA_URI "http://localhost:8761/eureka"
ENV HOSTNAME "ms-customer"


ENTRYPOINT ["java","-jar","/ms-customer-0.0.1.jar"]



