package poly.ex3;


public class Cow extends AbstractAnimal2 {
    @Override
    public void sound() {
        System.out.println("음머음머헤헤");
    }

    @Override
    public void move() {
        System.out.println("소이동");
    }
}
