public class Triangle extends Shape{
    private double height, base;
    public Triangle(double height, double base){
        this.base = base;
        this.height = height;
    }
    @Override
    public double area(){
        return .5 * base * height;
    }
}
