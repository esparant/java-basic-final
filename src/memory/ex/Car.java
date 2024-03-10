package memory.ex;

public class Car {
    private String carName;
    private static int carCount;

    public Car(String carName) {
        this.carName = carName;
        carCount++;
        System.out.println("차량 구입, 이름 : " + carName);
    }

    public static void showTotalCars() {
        if (carCount == 0) {
            System.out.println("구매한 차량이 없습니다.");
            return;
        }
        System.out.println("구매 한 차량 개수 : " + carCount);
    }

}
