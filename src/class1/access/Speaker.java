package class1.access;

public class Speaker {
    private int volume;
    // private 는 해당 클래스에서만 접근할수 있는 제어자.
    // 아무것도 안적으면 default !!

    Speaker(int volume) {
        this.volume = volume; // 초기 볼륨값 받기 생성자
    }

    void upVolume () {
        volume += 10;
        if(volume > 100) {
            System.out.println("최대 볼륨입니다. (100) ");
            volume = 100;
            return;
        }
        System.out.println("볼륨을 10 증가합니다. \n현재볼륨 : " + volume);

    }
    void downVolume () {
        volume -= 10;
        if(volume < 0) {
            System.out.println("최소 볼륨입니다. (0)");
            volume = 0;
            return;
        }
        System.out.println("볼륨을 10 감소합니다. \n현재볼륨 : " + volume);
    }

    void showVolume () {
        System.out.println("현재 볼룸 : " + volume);
    }
}
