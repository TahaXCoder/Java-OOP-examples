package point; // Package declaration

// Class representing a point in a 2D coordinate system
public class point {
    private int x; // Private variable to store x-coordinate
    private int y; // Private variable to store y-coordinate

    // Default constructor (no parameters)
    public point() {
        // No initialization (default values for x and y will be 0)
    }

    // Parameterized constructor to initialize x and y
    public point(int x, int y) {
        this.x = x; // Assigning x value
        this.y = y; // Assigning y value
    }

    // Method to calculate the distance between two points
    public double find_dis(point P2) {
        // Applying the distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        double d = Math.sqrt(Math.pow((P2.x - this.x), 2) + Math.pow((P2.y - this.y), 2));
        return d; // Returning the calculated distance
    }
}
