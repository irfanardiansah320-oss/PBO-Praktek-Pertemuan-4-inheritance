public class TestSquare {
    public static void main(String[] args) {
        Square s = new Square(5.0);
        System.out.println("awal : " + s);
        System.out.println("area : " + s.getArea());
        s.setWidth(8.0);
        System.out.println("sesudah setWidth(8): " + s);

        s.setLength(3.0);                                           
        System.out.println("sesudah setLength(3): " + s);           
        System.out.println("area sekarang : " + s.getArea());       
        System.out.println("perimeter sekarang : " + s.getPerimeter());  
    }
}