## About Project

The purpose of this project it's to learn all of Java's main concepts

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies
- `bin`: the folder output of the generated compiled files
- `migrations`: the folder to maintain te .sql files of the database
- `res`: the folder to maintain the resources, the files used by the program

## Run project steps
- Copy the `.env.example` file to an `.env` file and set the environment variables
- Run the following commands 

## Commands
### On the root folder:

Compile project - Required to run project
```console
javac -d bin -classpath src:lib/HikariCP-5.0.1.jar:lib/postgresql-42.7.8.jar:lib/slf4j-api-2.0.7.jar src/App.java
```

Run compiled project
```console
java -classpath bin:lib/HikariCP-5.0.1.jar:lib/postgresql-42.7.8.jar:lib/slf4j-api-2.0.7.jar App
```

## All the concepts aborded in this project

- Introduction of Java
- Classes
- Methods
- Variables
- StringBuilder
- UserInput
- Arrays
- Collections
- DataStructures
- ConditionalStatements
- ErrorHandling
- Generics
- Loops
- Maths
- Dates
- Enums
- Annotations
- DatabaseIntegrations
- Records
- Lambda
- Stream API
- Files
- OOP
    - Encapsulation
    - Abstrations
    - Inheritance
    - Polimorphism
- Garbage Collector
- Dependencies
- Compilate manually from terminal
- Run compilated code from terminal
- Environment Variables

## Other topics not included here but mapped for future studies

- HTTP Requests
- CompletableFuture
- I/O Streams to handle binary data (like images, audio, PDFs)

#### Almost all the contents of my files were writen by myself, I tried to explain the concepts in my own word to really understant them.