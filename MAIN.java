package QUES3;

import java.util.Scanner;

class Travel {
    private int kilometers;  // Stores distance traveled
    private int hours;       // Stores time taken

    // Default constructor initializes values to 0
    public Travel() {
        this.kilometers = 0;
        this.hours = 0;
    }

    // Function to take input from user
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kilometers traveled: ");
        this.kilometers = sc.nextInt();
        System.out.print("Enter hours taken: ");
        this.hours = sc.nextInt();
    }

    // Function to display values
    public void display() {
        System.out.println("Kilometers traveled: " + kilometers);
        System.out.println("Hours taken: " + hours);
    }

    // Function to add another Travel object and return a new Travel object
    public Travel add(Travel t) {
        Travel temp = new Travel();  // Creating a new Travel object
        temp.kilometers = this.kilometers + t.kilometers;  // Add kilometers
        temp.hours = this.hours + t.hours;  // Add hours
        return temp;  // Return new Travel object
    }
}

// Main class
public class MAIN {
    public static void main(String[] args) {
        // Creating first travel object and taking input
        Travel t1 = new Travel();
        System.out.println("Enter details for first travel:");
        t1.input();
        t1.display();

        // Creating second travel object and taking input
        Travel t2 = new Travel();
        System.out.println("\nEnter details for second travel:");
        t2.input();
        t2.display();

        // Adding t1 and t2 to get a new object
        Travel t3 = t1.add(t2);
        System.out.println("\nAfter adding first and second travel details:");

        // Display the new object's values
        t3.display();
    }
}

