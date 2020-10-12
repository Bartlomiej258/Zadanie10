public class Test {
    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Square square = new Square(4);
        double squareArea = shapeCalculator.squareArea(square);
        System.out.println("Square Area " + squareArea);

        Circle circle = new Circle(5);
        double circleArea = shapeCalculator.circleArea(circle);
        System.out.println("Circle Area : " + circleArea);

        Triangle triangle = new Triangle(3, 6, 6);
        double trianglePerimeter = shapeCalculator.trianglePerimeter(triangle);
        System.out.println("Triangle Perimeter " + trianglePerimeter);

        Rectangle rec = new Rectangle(3, 6);
        double rectPerimeter = shapeCalculator.rectPerimeter(rec);
        System.out.println("Rectangle permiter: " + rectPerimeter);
    }
}
