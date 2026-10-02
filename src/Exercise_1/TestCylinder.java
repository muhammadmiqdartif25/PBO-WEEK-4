package Exercise_1;

public class TestCylinder { // save as "TestCylinder.java"
    public static void main (String[] args) {
// Declare and allocate a new instance of cylinder
// with default color, radius, and height
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(10.0);
        Cylinder c3 = new Cylinder(2.0, 10.0);

        printCylinder("c1", c1);
        printCylinder("c2", c2);
        printCylinder("c3", c3);
    }

    private static void printCylinder(String name, Cylinder c) {
        System.out.println(name);
        System.out.println("Cylinder:"
                + " radius=" + c.getRadius()
                + " height=" + c.getHeight()
                + " base area=" + c.getArea()
                + " volume=" + c.getVolume());
        System.out.println(c);
        System.out.println();
    }
}