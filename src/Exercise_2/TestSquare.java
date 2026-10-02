package Exercise_2;

public class TestSquare {
    public static void main (String[] args) {
        Square s = new Square(5.0);
        System.out.println("awal : " + s);
        System.out.println("area : " + s.getArea());

        s.setWidth(8.0);
        System.out.println("sesudah setWidth(8): " + s);
    }
}
