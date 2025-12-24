public class Dependencies {
    public static void main() {
        // In Java you can use code from other projects,
        // like the PostgreSQL driver. For that you have to
        // download their code, usually it is in a .jar format,
        // it's like an zip with all the files of a project,
        // and then you have to make your JVM find it in your machine
        // so you can use it, generally you put desses files in an folder
        // only for them, in the case of this project, it's the /lib folder.
        // To make your JVM find your dependencies, you can do that in a couple of ways,
        // depending on how you're running your java project. Here a some them:

        // If you're running in VSCode:
        // In the settings.json file, add the configuration:
        // "java.project.referencedLibraries": [
        //     "lib/**/*.jar"
        // ]


        // If you're running in terminal, in the root of this project:

        // java -classpath "bin:lib/HikariCP-5.0.1.jar:lib/postgresql-42.7.8.jar:lib/slf4j-api-2.0.7.jar" App

        // classpath tells your JVM where are all the Java files used by your application, from your project and external dependencies, separated by a ":".


        // You can also create an environment variable called CLASSPATH.
        // In this example I'm creating an CLASSPATH with the path of my project's code, and the dependencies HikariCP and slf4j, that are used in this project:
        
        // export CLASSPATH=/java-studies/java-concepts/bin:/java-studies/java-concepts/lib/HikariCP-5.0.1.jar:/java-studies/java-concepts/lib/postgresql-42.7.8.jar:/java-studies/java-concepts/lib/slf4j-api-2.0.7.jar

        // then you can just run the following in the root of this project:

        // java App


        // But it's ideal to download your dependencies all by yourself, and add. then to github.
        // It's better to use a build tool like Gradlew or Maven, with then you can create a file
        // that lists all the dependencies that your program needs and run a command to download them,
        // like a package.json for a Node program. This way you don't have to upload all your dependencies
        // to github so other peaple can run your program, they can just clone it and download the dependencies
        // with the build tool that your program uses.
    }    
}
