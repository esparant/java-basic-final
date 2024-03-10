package extends1.overriding;

public class ElectricCar extends Car {

    @Override // 에노테이션
    // 오버라이드
    // 없어도 되는데 만약 오타가 났을 경우
    // 애노테이션에 빨간 줄이뜸!! 컴파일 오류! 확인가능!
    // 메소드 오버라이드, 메소드 재정의 모두 사용한다잉.
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
