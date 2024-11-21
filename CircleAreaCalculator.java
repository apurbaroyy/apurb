// Class representing a Circle
class Circle {
    private double radius; // Private field for encapsulation

    // Constructor to initialize the radius
    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive. Defaulting to 1.");
            this.radius = 1.0;
        }
    }

    // Getter for the radius
    public double getRadius() {
        return radius;
    }

    // Setter for the radius
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid radius. Radius must be positive.");
        }
    }
}

// Class to calculate the area of a Circle
class CircleAreaCalculator {
    // Method to calculate the area of the circle
    public double calculateArea(Circle circle) {
        double radius = circle.getRadius();
        return Math.PI * radius * radius;
    }
}

// Main class to test the program
public class CircleDemo {
    public static void main(String[] args) {
        // Create a Circle object with an initial radius
        Circle circle = new Circle(5.0);

        // Create a CircleAreaCalculator object
        CircleAreaCalculator calculator = new CircleAreaCalculator();

        // Calculate and display the area of the circle
        System.out.println("Radius of the circle: " + circle.getRadius());
        System.out.println("Area of the circle: " + calculator.calculateArea(circle));

        // Modify the radius using the setter
        circle.setRadius(10.0);
        System.out.println("\nUpdated Radius of the circle: " + circle.getRadius());
        System.out.println("Updated Area of the circle: " + calculator.calculateArea(circle));

        // Try setting an invalid radius
        circle.setRadius(-3.0); // This will not update the radius
    }
}
