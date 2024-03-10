package poly.ex3;

public class Dog extends AbstractAnimal2 {
    @Override
    public void sound() {
        System.out.println("멍멍왈왈잘잘");
    }

    @Override
    public void move() {
        System.out.println("개이동");
    }
}

