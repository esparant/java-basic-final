package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1 = new Student(); // 배열, 스캔선언이랑 동일한 방식.
        student1.name = "김철수";
        student1.age = 18;
        student1.grade = 10;

        Student student2 = new Student();
        student2.name = "이유리";
        student2.age = 16;
        student2.grade = 20;

        Student student3 = new Student();

        Student[] students = new Student[3]; // 배열형식으로 생성
        students[0] = student1; // 배열안에 참조값을 대입한다.
        students[1] = student2;
        students[2] = student3;

        System.out.println("student1 의 주소 : " + student1);
        System.out.println("student[0] 의 주소 :" + students[0]);
        System.out.printf("이름: %s, 나이: %d, 성적: %d\n", students[0].name, students[0].age, students[0].grade);
        System.out.printf("이름: %s, 나이: %d, 성적: %d\n", students[1].name, students[1].age, students[1].grade);
        System.out.printf("이름: %s, 나이: %d, 성적: %d", students[2].name, students[2].age, students[2].grade);

    }
}
