package poly.car1;

public class NewCar implements Car {

    private static final String carName = "NewCar";

    @Override
    public void startEngine() {
        System.out.println("NewCar.startEngine");
        ;
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar.offEngine");
    }

    @Override
    public String getCarName() {
        return carName;
    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar.pressAccelerator");
    }
}
