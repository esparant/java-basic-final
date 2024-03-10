package test;

public class MyCalculatorExO {
    public static void main(String[] args) {
        Calculator cal = new MyCalculatorO(); // 업캐스팅
        System.out.println(cal.exec(1, 3));
    }
}
