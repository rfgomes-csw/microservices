#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"

pushd "${DIR}/.."
  ./mvnw package -Dmaven.test.skip=true
popd

cp /app/target/*.jar app.jar
