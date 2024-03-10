package poly.diamond;


public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new ChildInterface();
        InterfaceB b = new ChildInterface();
        a.methodA();
//        a.methodB(); // 실행불가 인터페이스A에 메소드B라는 기능이 없기에
        a.methodCommon();
        b.methodB();
//        a.methodA(); // 실행불가 인터페이스B에 메소드A라는 기능이 없기에.
        b.methodCommon();
        System.out.println();
        System.out.println();

        ChildInterface c = new ChildInterface();
        // 이렇게 하면 전보 호출 가능.
        c.methodA();
        c.methodB();
        c.methodCommon();
    }
}
