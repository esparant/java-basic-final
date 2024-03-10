package final1;

public class FinalLocalMain {
    public static void main(String[] args) {

        // final 지역 면수
        final int data1 = 10; // 최초 한번만 할당가능

        // data1 = 500;
        // 변경불가!!


        method(10);
        // data 가 10으로 고정
    }

    static  void method(final int data) {
         // 컴파일 오류 data = 550000000
    }
}
