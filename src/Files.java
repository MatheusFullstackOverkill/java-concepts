import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    private static void read() {
        File usersFile = new File("res/users.csv");

        // try-catch with scanner will automatically close when
        // the operations are completed.
        try (Scanner myReader = new Scanner(usersFile)) {
            while (myReader.hasNextLine()) {
                String rowString = myReader.nextLine();
                System.out.println(rowString);

                String[] row = rowString.split(";");

                System.out.println(row);
            };
        } catch (Exception e) {
            e.printStackTrace();
        };
    }

    private static void create() {
        try {
            File newUsersFile = new File("res/new_users.csv");

            // createNewFile returns a boolean telling if the file was
            // created or not.
            if (newUsersFile.createNewFile()) {
                System.out.println("File created: " + newUsersFile.getName());    
            } else {
                System.out.println("File already exists");
            };
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void write() {
        try {
            FileWriter myWriter = new FileWriter("res/new_users.csv");
            
            myWriter.write("Name;Email\n");
            myWriter.write("Stephen;stephen@gmail.com");
            myWriter.close();

            System.out.println("New user added to new_users.csv file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void delete() {
        File fileToDelete = new File("res/new_users.csv");

        // delete returns a boolean telling if the file was
        // deleted or not.
        if (fileToDelete.delete()) {
            System.out.println("Deleted the file: " + fileToDelete.getName());
        } else {
            System.out.println("Failed to delete the file.");
        };
    }

    public static void main() {
        read();
        create();
        write();
        delete();
    }
}