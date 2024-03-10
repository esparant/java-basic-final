package class1.ref;

public class StudentEx2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        // Student 라는 클래스가 두개 있을 경우 옆에 있는 경로를 봐서 고를 것.
        initStudent(student1, "김철수", 20, 18); // 1번째 방법
        System.out.println("student1참조값 = " + student1);
        Student student2;
        initStudent(student2 = new Student(), "이유리", 19, 80);

        Student student3 = createStudent("이녀석", 25, 90); // 2번째방법
        printStudent(student1);
        printStudent(student2);
        printStudent(student3);

        Student[] students = {student1, student1, student3};

        syuusei(students[2], "안녕", 3, 50);

        printStudent(students[2]);

        String[] arr = {"ㅇㅇㅇ", "ㄴㄴㄴ"};

        syuuser2(arr, 0, "ooo");
        System.out.println(arr[0]);
    }

    // WOOOOOOOOOOOOOOOOOOOOW
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("student참조값 = " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void syuuser2(String[] arr, int idx, String name) {
        arr[idx] = name;
    }

    static void syuusei(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;

    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.printf("이름: %s, 나이: %d, 성적: %d\n", student.name, student.age, student.grade);
    }
}
