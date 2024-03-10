package memory.static2;


public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 deco1 = new DecoUtil1();


        System.out.println("before : " + s);
        System.out.println("after : " + deco1.deco(s));
    }
}
