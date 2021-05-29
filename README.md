This example demonstrates how to collect code coverage by integration tests, tests are located in a separate Java Maven module.
SonarQube aggregates code coverage by unit tests and integration tests to compute an overall code coverage.

Prerequisites
=============
* Maven 3+

Usage
=====
build: mvn clean install -Dmaven.test.skip=true
unittest: mvn clean install org.jacoco:jacoco-maven-plugin:prepare-agent -Dsonar.java.coveragePlugin=jacoco

# sonar_test
