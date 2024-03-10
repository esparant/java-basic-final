package class1.ex;

public class Rectangle {
    int width, height;

    void calculateArea() {
        System.out.println("넓이 : " + width * height);
    }

    void calculatePerimeter() {
        System.out.println("둘레 : " + (width + height) * 2);
    }

    void isSquare() {
        if(width == height) {
            System.out.println("정사각형입니다.");
            return;
        }
        System.out.println("직사각형입니다.");
    }
}
