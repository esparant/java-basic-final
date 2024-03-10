package class1.oop1;

public class ValueData {
    int value;

    void add() { // 스태틱이 없는이유
        // 메서드는 객체를 생성해야 호출할수 있지만
        // static 을 쓰면 객체를 생성안해도 호출이 가능함
        // 오류 발생인가?
        value ++;
        System.out.println("현재 value = " + value);
    }
}
