class name {
    // Static variables to hold name and age
    static String name;
    static int age;

    // Static method to set the name and age
    static void setDetails(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    // Static method to display name and age
    static void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Calling static method to set the details
        Person.setDetails("John Doe", 25);

        // Calling static method to display the details
        Person.displayDetails();
    }
}



 