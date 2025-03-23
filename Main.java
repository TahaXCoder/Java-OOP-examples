package point; // Package declaration

public class Main {
    public static void main(String[] args) {
        // Creating two point objects with given coordinates
        point p1 = new point(23, 45); // Point 1 at (23, 45)
        point p2 = new point(12, 34); // Point 2 at (12, 34)

        // Calculating the distance between p1 and p2 using find_dis method
        double distance = p1.find_dis(p2);

        // Printing the calculated distance
        System.out.println("Distance is " + distance);
    }
}
