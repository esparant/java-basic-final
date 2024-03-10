package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        // 이런 경우에는 가독성이 좋아지나 결국 잘못지우면
        // 그사람 인생도 끝남
        String[] studunts = {"학생1", "학생2", "안녕"};
        int[] age = {15, 16, 20};
        int[] grade = {90, 80, 30};

        for (int i = 0; i < age.length; i++) {
            System.out.println("이름: " + studunts[i] + ", 나이: " + age[i] + ", 성적: " + grade[i]);
        }
    }
}
