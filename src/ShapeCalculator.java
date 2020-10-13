public class ShapeCalculator {


    double squareArea(Square square) {
        return square.getA() * square.getA();
    }
    double squarePerimeter(Square square){
        return 4 * square.getA();
    }

    double circleArea(Circle circle){
        return Math.PI * Math.pow(circle.getR(),2);
    }
    double circlePerimeter(Circle circle){
        return 2 * Math.PI * circle.getR();
    }

    double rectPerimeter(Rectangle rectangle){
        return 2 * ( rectangle.getA() + rectangle.getB());
    }
    double rectArea(Rectangle rectangle){
        return rectangle.getA() * rectangle.getB();
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.getA() + triangle.getB() + triangle.getC();
    }
    double triangleArea(Triangle triangle){
        return  (triangle.getA() * triangle.getB()) / 2;
    }
}
