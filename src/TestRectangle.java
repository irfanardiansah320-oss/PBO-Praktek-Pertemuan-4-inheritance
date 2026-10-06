public class TestRectangle {
    public static void main(String[] args) {
        printRect("r1 (default)", new Rectangle());
        printRect("r2 (width,length)", new Rectangle(3.0, 4.0));
        printRect("r3 (lengkap)", new Rectangle(3.0, 4.0, "yellow", true));
    }

    private static void printRect(String name, Rectangle r) {
        System.out.println(name);
        System.out.println("area      = " + r.getArea());
        System.out.println("perimeter = " + r.getPerimeter());
        System.out.println(r);
        System.out.println();
    }
}