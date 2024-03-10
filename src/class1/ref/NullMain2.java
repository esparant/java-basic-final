package class1.ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException 예외 발생
        // 참조값이 Null 이므로 오류 발생
        System.out.println("data.value = " + data.value);
    }
}
