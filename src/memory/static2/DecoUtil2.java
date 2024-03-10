package memory.static2;

public class DecoUtil2 {
    public String deco(String str) {
        return "*" + str + "*";
        // 단순히 기능만 제공하는 쓸모없는 메소드
        // 얘는 그냥 인스턴스 메소드
    }

    public static String decoStatic(String str) {
        // 정적 메서드.
        // 클래스 변수처럼 클래스에 직접 접근해서 호출 가능.
        // 클래스 메소드, 정적 메서드, 라고 불린다.
        // 정적 메소드는 static 이 붙은 변수, 메소드만 사용가능!!
        // 인스턴스 변수, 메소드는 사용못함!
        return "*" + str + "*";
    }
}
