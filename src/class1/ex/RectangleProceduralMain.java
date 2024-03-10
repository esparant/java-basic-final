package class1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.height = 3;
        rectangle1.width = 2;
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        rectangle1.isSquare();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.height = 10;
        rectangle2.width = 10;
        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();
        rectangle2.isSquare();

    }
}
