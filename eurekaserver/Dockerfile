FROM amazoncorretto:11
EXPOSE 8761
COPY . /app
RUN /app/ci/build.sh

CMD java -jar app.jar
