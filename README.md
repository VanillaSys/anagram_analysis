Anagram Analysis
===========

* Do you want to know if two words are anagrams?

If so, this is a tool for you, Anagram Analysis is a REST service that allow
you to compare two words in order to find out if they are anagrams!

### Requirements

* Java JDK 1.8
* Maven 4.0.0

### Set up REST service

```sh
 mvn clean package
```

 ```sh
 java -jar target/gs-consuming-rest-0.1.0.jar
```

### Consuming service

#### Command Line
 ```sh
 curl -X POST http://localhost:8080/anagramfinder --data "firstword=scare&secondword=cares"
```

#### Web Browser

http://localhost:8080/anagramfinder?firstword=scare&secondword=cares

