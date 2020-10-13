public class Test {
    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("------------------------------------");

        Square square = new Square(4);
        double squareArea = shapeCalculator.squareArea(square);
        System.out.println("Square Area " + squareArea);
        double squarePerimeter = shapeCalculator.squarePerimeter(square);
        System.out.println("Square Perimeter : " + squarePerimeter);
        System.out.println("-------------------------------------");

        Circle circle = new Circle(5);
        double circleArea = shapeCalculator.circleArea(circle);
        System.out.println("Circle Area : " + circleArea);
        double circlePerimeter = shapeCalculator.circlePerimeter(circle);
        System.out.println("Circle Perimeter: " + circlePerimeter);
        System.out.println("-------------------------------------");

        Triangle triangle = new Triangle(3, 3, 3);
        double trianglePerimeter = shapeCalculator.trianglePerimeter(triangle);
        System.out.println("Triangle Perimeter " + trianglePerimeter);
        double triangleArea = shapeCalculator.triangleArea(triangle);
        System.out.println("Triangle Area " + triangleArea);
        System.out.println("-------------------------------------");


        Rectangle rec = new Rectangle(3, 6);
        double rectPerimeter = shapeCalculator.rectPerimeter(rec);
        System.out.println("Rectangle Permiter: " + rectPerimeter);
        double rectArea = shapeCalculator.rectArea(rec);
        System.out.println("Rectangle Area: " + rectArea);
        System.out.println("--------------------------------------");

    }
}
