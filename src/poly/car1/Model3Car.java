package poly.car1;

import java.nio.charset.IllegalCharsetNameException;

public class Model3Car implements Car{

    private static final String carName = "Model3";

    @Override
    public void startEngine() {
        System.out.println("Model3Car.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("Model3Car.offEngine");
    }

    @Override
    public String getCarName() {
        return carName;
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car.pressAccelerator");
    }
}
