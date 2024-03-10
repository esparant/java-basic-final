package memory.static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("user1");
        System.out.println("data1.count = " + data1.count);
        Data1 data2 = new Data1("user2");
        System.out.println("data2.count = " + data2.count);
        Data1 data3 = new Data1("user2");
        System.out.println("data3.count = " + data3.count);
        // 당연히 전부 1이 나온다.
        // 메모리가 따로 할당되기 때문에!!
        // 니 방금 햇갈릴번했다잉?
    }
}
