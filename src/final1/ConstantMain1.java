package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);

    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 :" + currentUserCount);
        if (currentUserCount > 1000) {
            // 이런식으로 하면 1000이라는 숫자가 무슨 숫자인지
            // 궁금하게 된다 혼란이 생긴다
            // 매직넘버라고 한다. 놀래키는 숫자
            // 그리고 만약 최대값이 바꾸면 두번 수정해야 한ㄷ.
            System.out.println("대기자로 등록합니다.");
            return;
        }
        System.out.println("게임에 참여합니다.");
    }
}
