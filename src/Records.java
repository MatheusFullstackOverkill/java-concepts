// Records are basically classes used only to store values,
// they cannot be changed. They are most used for DTOs,
// classes used for transfer information.
// Records also comes with methods that help us interact with those values,
// other then a getter for all it's attributes, it has the methods:
// equals() - Returns true if the object passed as a parameter it's equal the current object;
// hashCode() - Return an int representation of the object, you can it to compare it with other objects;
// toString() - Returns a string representantion of the object's data
// All theses methods can be overwritten to aplly our own logic.

// DTO - Data transfer objects
// POJOs - plain old java 

// The sintax for records is a bit diferent
record CreateUserPayload(String name, String email, String password) {} 

// An example of an overwritten record
record OverwrittenRecord(String email) {
    @Override
    public final boolean equals(Object object) {
        // My logic
        return true;
    }
}

public class Records {
    public static void main() {
        CreateUserPayload createUserPayload = new CreateUserPayload("Matheus", "matheus@gmail.com", "012345678");
        CreateUserPayload createUserPayload2 = new CreateUserPayload("Matheus 2", "matheus2@gmail.com", "012345678");
        CreateUserPayload createUserPayload3 = new CreateUserPayload("Matheus", "matheus@gmail.com", "012345678");

        System.out.println(createUserPayload.name());
        System.out.println(createUserPayload.email());
        System.out.println(createUserPayload.password());
        System.out.println(createUserPayload.toString());
        System.out.println(createUserPayload.hashCode());
        System.out.println(createUserPayload.equals(createUserPayload2));
        System.out.println(createUserPayload.equals(createUserPayload3));
    }
}