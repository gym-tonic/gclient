# Introduction
This project is a client which can send messages parsed from an input file to Graylog.

# Technologies
The following were used for tool implementation: 
* Java 17
* Maven
* Springboot.

# Usage
Building the project: 
    mvn clean install
In order to run the executable: 
    java -jar gclient-0.0.1-SNAPSHOT.jar
The tool knows the following commands:
* `help` (shows available commands)
* `load <pathToFile>` (sends file to Graylog)
* `exit` (shuts down tool) 