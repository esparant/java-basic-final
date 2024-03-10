package poly.diamond;

public class ChildInterface implements InterfaceA, InterfaceB {
    // 다중 상속 시작.
    @Override
    public void methodA() {
        System.out.println("ChildInterface.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("ChildInterface.methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("ChildInterface.methodCommon");
    }
}
