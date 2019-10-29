FROM amazoncorretto:11
EXPOSE 8080
COPY . /app
RUN /app/ci/build.sh

CMD java -jar app.jar
