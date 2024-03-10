package poly.ex3;


public class Cat extends AbstractAnimal2 {
    @Override
    public void sound() {
        System.out.println("냐오냐옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
