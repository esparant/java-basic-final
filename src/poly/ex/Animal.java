package poly.ex;

public abstract class Animal {

    protected abstract void sound();

    protected void testSound() {
        System.out.println("동물 소리 테스트 시작");
        sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
