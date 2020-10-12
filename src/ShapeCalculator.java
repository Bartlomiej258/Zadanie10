public class ShapeCalculator {


    double squareArea(Square square){
        return square.a * square.a;
    }

    double circleArea(Circle circle){
        return Math.PI * Math.pow(circle.r,2);
    }

    double rectPerimeter(Rectangle rectangle){
        return 2 * ( rectangle.a + rectangle.b);
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }
}
