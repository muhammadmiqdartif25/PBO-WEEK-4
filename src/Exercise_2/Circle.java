package Exercise_2;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle extends Shape { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius, color and filled */
    public Circle() { // 1st (default) constructor
        super();
        radius = 1.0;
    }

    /** Constructs a Circle instance with the given radius and default color and filled */
    public Circle(double radius) { // 2nd constructor
        super();
        this.radius = radius;
    }

    /** Constructs a Circle instance with the given radius, color, and filled */
    public Circle(double radius, String color, boolean filled) { // 2nd constructor
        super(color, filled);
        this.radius = radius;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** set the radius of this Circle instance */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    /** Returns the perimeter of this Circle instance */
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    /** Return a self-descriptive string of this instance in the form of
     Circle[radius=?,color=?] */
    @Override public String toString() {
        return "Circle[" + super.toString() + ",radius=" + radius + "]";
    }
}
