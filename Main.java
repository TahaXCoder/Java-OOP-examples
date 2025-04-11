// Base class Shape
class shape {

    // Method to calculate area (default = 0)
    public double area() {
        return 0.0;
    }

    // Display message for base shape
    public void displayshape() {
        System.out.println("This is a shape");
    }

    // Method to compare area of two shapes
    void compareArea(shape obj) {
        if (this.area() == obj.area()) {
            System.out.println("Area of reference variable is equal to obj variable");
            System.out.println("0");
        } else if (this.area() < obj.area()) {
            System.out.println("Area of reference variable is less than obj variable");
            System.out.println("-1");
        } else {
            System.out.println("Area of reference variable is greater than obj variable");
            System.out.println("1");
        }
    }
}

// Derived class Circle
class circle extends shape {
    double rad;

    // Default constructor
    circle() {}

    // Parameterized constructor
    circle(double rad) {
        this.rad = rad;
    }

    // Overriding area method for circle
    public double area() {
        return 3.14 * rad * rad;
    }

    // Specific display method
    public void diplayshape1() {
        System.out.println("This is a shape of circle");
    }
}

// Derived class Rectangle
class rectangle extends shape {
    public double width;
    public double height;

    // Default constructor
    public rectangle() {}

    // Parameterized constructor
    rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Overriding area method for rectangle
    public double area() {
        return width * height;
    }

    // Specific display method
    public void diplayshape2() {
        System.out.println("This is a rectangle shape");
    }
}

// Derived class Triangle
class triangle extends shape {
    protected double base;
    protected double height;

    // Default constructor
    public triangle() {}

    // Parameterized constructor
    triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding area method for triangle
    public double area() {
        return 0.5 * base * height;
    }

    // Specific display method
    public void diplayshape3() {
        System.out.println("This is a triangle shape");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating Circle object and displaying area
        circle c1 = new circle(45);
        double area = c1.area();
        System.out.println("Area of circle: " + area);
        c1.diplayshape1();

        // Creating Rectangle object and displaying area
        rectangle r1 = new rectangle(10, 20);
        area = r1.area();
        System.out.println("Area of rectangle: " + area);
        r1.diplayshape2();

        // Creating Triangle object and displaying area
        triangle t1 = new triangle(22, 12);
        area = t1.area();
        System.out.println("Area of triangle: " + area);
        t1.diplayshape3();

        // Comparing areas between different shapes
        c1.compareArea(r1);
        t1.compareArea(c1);
        r1.compareArea(t1);
    }
}
