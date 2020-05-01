public class Driver {
    public static void main(String args[]){

        // shape
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        s1.setColor("Grey");
        s1.getColor();
        System.out.println(s1.toString());
        Shape s2 = new Shape("purple", false);
        System.out.println(s2.toString());

        // circle
        System.out.println("Circle");
        Circle c1 = new Circle();
        System.out.println(c1.toString());
        c1.setRadius(5);
        System.out.println(c1.toString());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        // rectangle
        System.out.println("Rectangle");
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        r1.setLength(4);
        r1.setWidth(2);
        System.out.println(r1.toString());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        // square
        System.out.println("Square");
        Square sq1 = new Square(10, "yellow", true);
        System.out.println(sq1.toString());
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Perimeter: " + sq1.getPerimeter());

    }

}
