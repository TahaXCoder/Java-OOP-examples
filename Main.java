package question3;
import java.sql.SQLOutput;
import java.util.Scanner;

class TollBooth{
    private int total_cars;
    private double total_money;

    public TollBooth() {
        this.total_cars = 0;
        this.total_money = 0.0;
    }

    // Function to count a paying car
    public void payingCar() {
        total_cars++;
        total_money += 0.50; // Adds 50 cents
    }


    public void nopayCar() {
        total_cars++;
    }


    public void display() {
        System.out.println("\nTotal Cars Passed: " + total_cars);
        System.out.println("Total Cash Collected: " + total_money);
    }
}

public class Main {
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);

TollBooth Bhoot=new TollBooth();

char choice;
        System.out.println(" Here is a ToLL Booth System");

 System.out.println(" Press 'P' for a Paying Car, \n'N' for a Non-Paying Car, \n'E' to Exit.\"");

        while (true) {
            System.out.print("Enter your choice: ");
            choice = sc.next().charAt(0);

            if (choice == 'P' || choice == 'p') {
                Bhoot.payingCar();
                System.out.println("Paying car counted!");
            } else if (choice == 'N' || choice == 'n') {
                Bhoot.nopayCar();
                System.out.println("Non-paying car counted!");
                // PRESS E TO EXIT BECAUSE Since IntelliJ's console does not support
                // real-time key detection for Esc.
                //In IntelliJ IDEA, the Esc key is usually mapped to switching focus
                // from the console to the editor instead of being detected as input
                // in the console. This is why your program does not exit when you press Esc.
            } else if (choice == 'E' || choice == 'e') {
                System.out.println("\nFinal Report:");
                Bhoot.display();
                System.out.println("Exiting...Ta Ta BY BY");
                break;
            } else {
                System.out.println("Invalid input. Please enter 'P', 'N', or 'E'.");
            }
        }


    }
}
