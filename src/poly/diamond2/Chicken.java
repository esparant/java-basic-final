package poly.diamond2;

public class Chicken extends AbstractAnimal3 implements Fly{

    @Override
    public void fly() {
        System.out.println("닭이 납니다.");
    }

    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }

}
