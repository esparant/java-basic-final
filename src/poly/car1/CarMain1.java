package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        poly.car1.Driver driver = new Driver();
        Car car = new K3Car();
        driver.setCar(car);
        driver.drive();
        car = new Model3Car();
        driver.setCar(car);
        driver.drive();
        car = new NewCar();
        driver.setCar(car);
        driver.drive();

    }
}
