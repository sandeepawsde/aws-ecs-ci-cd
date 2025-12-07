FROM amazoncorretto:21
LABEL authors="sandeep ileni"

WORKDIR /usr/local/apps/app1

COPY ./build/libs/employee-service.jar ./employee-service.jar

EXPOSE 2020

ENTRYPOINT ["java", "-jar", "employee-service.jar"]