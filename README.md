## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Commands
Compile project - Required to run project
javac -d bin -sourcepath src src/App.java

Run compiled project
java -classpath bin App

The "-sourcepath" and "-classpath" params are required if you're not in the folder of the files which you want to access.
If you are on the /src folder, you can just run:
javac App.java

If you are on the /bin folder, you can just run:
java App

## All the concepts aborded in this project

Classes
Methods
Variables
Primitive Types
Non Primitive Types
Type Casting
User Input
Methods
Packages
Conditional Statements
Dates
Data Structures
Loop
Error Handling
Lambda
Database Integration
Compilate manually from terminal
Run compilated code from terminal