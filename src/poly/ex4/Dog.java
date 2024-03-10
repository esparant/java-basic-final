package poly.ex4;

public class Dog implements InterfaceAnimal{
    // 인터페이스는 implements == 구현이라는뜻
    // 클래스는 extends

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
