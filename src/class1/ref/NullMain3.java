package class1.ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.count = " + bigData.data);


        System.out.println("bigData.data.value = " + bigData.data.value);


        // 즉 data 는 null 이기 때문에 NullPointerException 발생
        // 이게 진짜 개발자 많이 괴롭힌다.

    }
}
