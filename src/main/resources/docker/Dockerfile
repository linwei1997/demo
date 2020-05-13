FROM java:8
VOLUME /tmp
ADD target/*.jar aio-staff-attendance.jar
EXPOSE 1001
ENTRYPOINT ["java","-jar","/aio-staff-attendance.jar"]
