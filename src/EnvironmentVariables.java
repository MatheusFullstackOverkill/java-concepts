import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

// There are a few aways to use environment variables in Java,
// this is one of them, another way is the one explained here:
// https://docs.oracle.com/javase/tutorial/essential/environment/env.html
// More reference: https://dev.to/vonagedev/working-with-environment-variables-in-java-1n8o
public class EnvironmentVariables {
    public static Properties setEnvironmentVariables() {
        Properties props = new Properties();

        var envFile = Paths.get(".env");
        try(var inputStream = Files.newInputStream(envFile)) {
            props.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        };

        return props;
    }
}
