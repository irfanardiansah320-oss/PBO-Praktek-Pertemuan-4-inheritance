public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5);
        Circle c3 = new Circle(3.0, "blue", false);

        System.out.println("c1 area      = " + c1.getArea());
        System.out.println("c1 perimeter = " + c1.getPerimeter());
        System.out.println("c1 color     = " + c1.getColor());
        System.out.println("c1 filled    = " + c1.isFilled());
        System.out.println(c1);
        System.out.println();

        System.out.println("c2 area      = " + c2.getArea());
        System.out.println("c2 perimeter = " + c2.getPerimeter());
        System.out.println("c2 color     = " + c2.getColor());
        System.out.println("c2 filled    = " + c2.isFilled());
        System.out.println(c2);
        System.out.println();

        System.out.println("c3 area      = " + c3.getArea());
        System.out.println("c3 perimeter = " + c3.getPerimeter());
        System.out.println("c3 color     = " + c3.getColor());
        System.out.println("c3 filled    = " + c3.isFilled());
        System.out.println(c3);
    }
}