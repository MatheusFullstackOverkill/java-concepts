// An enum is an special class that holds a group of constants (variables that cannot be changed).
public class Enums {
    enum UserLevel {
        JUNIR,
        INTERMEDIATE,
        SENIOR
    }

    enum UserStatus {
        ACTIVE,
        INACTIVE
    }

    public static void runEnumStudies() {
        UserLevel userLevel = UserLevel.SENIOR;
        UserStatus userStatus = UserStatus.ACTIVE;

        System.out.println("User level is: " + userLevel);
        System.out.println("User status is: " + userStatus);

        switch(userLevel) {
            case JUNIR:
                System.out.println("Junior level");

            case INTERMEDIATE:
                System.out.println("Intermediate level");

            case SENIOR:
                System.out.println("Senior level");
        };
    }
}