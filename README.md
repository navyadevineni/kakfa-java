# kakfa-java

Commands I used to complete this assignment are:

- Started Zookeeper server:
```
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
- Started Kafka server:
```
.\bin\windows\kafka-server-start.bat .\config\server.properties
```
- Created a topic using the below command:
```
.\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --create --topic producerconsumer-message
```
- Build a jar file using the following command:
```
mvn clean compile assembly:single
```
- Ran the consumer class using the below command:
```
java -cp target/kafka-java-1.0-SNAPSHOT-jar-with-dependencies.jar com.nwmissouri.navyadevineni.Consumer producerconsumer-message group1
```
- Ran the producer class:
```
java -cp target/kafka-java-1.0-SNAPSHOT-jar-with-dependencies.jar com.nwmissouri.navyadevineni.Producer producerconsumer-message
```
