package class1.access;

public class SpeakerMain {
    public static void main(String[] args) {
        // 지역변수에는 접근제어자 불가
        // 이유 : 해도 어처피 쓸 곳이 없다.
        Speaker speaker = new Speaker(10);
        speaker.upVolume();
        speaker.upVolume();
        speaker.showVolume();
        speaker.upVolume();
        speaker.downVolume();
        speaker.downVolume();

        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200000;
        // 접근 제어자가 필요한 이유
        speaker.showVolume();
    }
}
