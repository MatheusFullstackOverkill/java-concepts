import java.sql.*;
import java.util.ArrayList;

import com.zaxxer.hikari.HikariDataSource;

// To interact with a database in Java, we use
// JDBC - Java Database Connectivity.
// The flow com a database interact in consystis in the following:

// 1. Import the packages;
// 2. Load Database Driver -
//    To connect with a database, you need to add. the required dependency
//    to your project, in this it's the database driver.
//    If you want for example, connect to an PostgreSQL database,
//    you have to download their driver and add. it to the project's dependencies.
//    For that you can do it manually, in the site: https://jdbc.postgresql.org/download/
//    and add. to the project, or with an build tool like Maven or Graddlew.
//    When that's done, JDBC will automatically load the driver when you try to connect,
//    back in the day, you had to load the driver manually;
// 3. Connect with the database -
//    There as two ways to do it, using the DriverManager class or a DataSource.
//    Using the DriverManager way you create a new connecting from scratch every time
//    you use getConnection.
//    Using the DataSource way you prepare a connection to use reused throughout the application,
//    so it's less memory costly then DriverManager.
//    So DataSource it's the prefared way to use JDBC in large projects;
// 4. Execute an statament to the database -
//    If you have to use parameters in your query, you should first prepare the statement,
//    then pass the parameters, then execute the query. That's mainly to prevent SQL injection;
// 5. Process the results of the query;
// 6. Close connection.

record User(
    Integer userId,
    String firstName,
    String lastName,
    String email,
    String phone,
    String birthdate,
    String profilePicture,
    String password,
    String createdAt,
    String updatedAt,
    String deletedAt
) {}

public class DatabaseIntegrations {
    // Not recomended to large applications
    // The following methods it's configured to return an Connection type,
    // but it can return an SQLException.
    private static Connection driverManagerConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost/socialmedia?user=postgres&password=doctorwho3210";
        Connection conn = DriverManager.getConnection(url);

        return conn;
    }

    // Recomended to large applications
    private static HikariDataSource dataSourceConnection() {
        // We and an lib to create an connection pool,
        // there are many of them, of one of the most commom,
        // that SpringBoot uses under the hood, are HikariCP,
        // we will use it here.
        // Hikari uses the dependency SLF4J, that's why it's
        // all installed in the /lib folder.
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:postgresql://localhost/socialmedia");
        ds.setUsername("postgres");
        ds.setPassword("doctorwho3210");

        return ds;
    }

    public static void main() {
        // Java demands to wrap the connection in an try catch to prevent unhandled exception
        // when trying to the connect to the database.
        try {
            // Connection conn = driverManagerConnection();
            HikariDataSource ds = dataSourceConnection();
            Connection conn = ds.getConnection();
        
            // Check if the connection worked
            System.out.println(conn.isValid(0));

            // CRUD

            // select
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("""
                SELECT * FROM "user"
            """);

            ArrayList<User> users = new ArrayList<User>();

            while (result.next()) {
                // OffsetDateTime createdAtWithOffset = result.getObject("created_at", OffsetDateTime.class);
                // String createdAtUTC = createdAtWithOffset.withOffsetSameInstant(ZoneOffset.UTC).toString();
                // System.out.println(result.getString("created_at"));

                User user = new User(
                    result.getInt("user_id"),
                    result.getString("first_name"),
                    result.getString("last_name"),
                    result.getString("email"),
                    result.getString("phone"),
                    result.getString("birthdate"),
                    result.getString("profile_picture"),
                    result.getString("password"),
                    result.getString("created_at"),
                    result.getString("updated_at"),
                    result.getString("deleted_at")
                );

                users.add(user);
            };

            for (int i = 0; i < users.size(); i++) {
                System.out.println(users.get(i));
            };

            // If you want to pass parameters to your query,
            // you should use prepareStatement, to prevent SQL injection.
            PreparedStatement preparedStatement = conn.prepareStatement(
                """
                    SELECT * FROM "user" WHERE email = ?        
                """
            );
            // The index of the parameter on the SQL string, it starts with 1,
            // followed by the value of the parameter. 
            preparedStatement.setString(1, "matheus@gmail.com");

            ResultSet userResult = preparedStatement.executeQuery();
            User user = null;
            while (userResult.next()) {
                user = new User(
                    userResult.getInt("user_id"),
                    userResult.getString("first_name"),
                    userResult.getString("last_name"),
                    userResult.getString("email"),
                    userResult.getString("phone"),
                    userResult.getString("birthdate"),
                    userResult.getString("profile_picture"),
                    userResult.getString("password"),
                    userResult.getString("created_at"),
                    userResult.getString("updated_at"),
                    userResult.getString("deleted_at")
                );
            };

            System.out.println(user);

            // insert
            PreparedStatement insertPS = conn.prepareStatement(    
            """
                INSERT INTO "user" (first_name, last_name, email, phone, password)
                VALUES (?, ?, ?, ?, ?)
            """);
            insertPS.setString(1, "Matheus");
            insertPS.setString(2, "Marcus");
            insertPS.setString(3, "m.marcus@gmail.com");
            insertPS.setString(4, "5555-5555");
            insertPS.setString(5, "12345678");

            // In JDBC every interation with the database other then
            // SELECT counts as an update, so you use executeUpdate
            // for INSERT, UPDATE and DELETE.
            int insertCount = insertPS.executeUpdate();
            System.out.println("Inserted rows count: " + insertCount);

            // update
            PreparedStatement updatePS = conn.prepareStatement(    
            """
                UPDATE "user" SET first_name = ? WHERE user_id = ?
            """);
            updatePS.setString(1, "Math");
            updatePS.setInt(2, 1);

            int updateCount = updatePS.executeUpdate();
            System.out.println("Updated rows count: " + updateCount);
            
            // delete
            PreparedStatement deletePS = conn.prepareStatement(
                """
                    DELETE FROM "user" WHERE user_id = ?
                """
            );
            deletePS.setInt(1, 2);

            int deleteCount = deletePS.executeUpdate();
            System.out.println("Deleted rows count: " + deleteCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}