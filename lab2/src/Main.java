public class Main {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        shapes[0] = new Circle(2.3);
        shapes[1] = new Square(4.3);
        shapes[2] = new Triangle(10, 2.4);
        for (int i = 0; i < shapes.length; i++){
            System.out.println(shapes[i].area());
        }
    }
}