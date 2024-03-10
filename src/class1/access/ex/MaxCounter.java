package class1.access.ex;

import org.w3c.dom.ls.LSOutput;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter (int max) {
        if(maxIsTrue(max)) {
            count = 0;
            this.max = max;
            return;
        }
        System.out.println("올바른 최대값을 입력하세요.");
    }

    public void increment() {
        if(countIsTrue()) {
            System.out.println("count 값을 증가시킵니다.");
            count++;
            getCount();
            return;
        }
        System.out.println("count 값이 최대이거나, max 값이 올바르지 않습니다.");
        getCount();
        getMax();
    }

    public void getMax() {
        System.out.println("입력한 max 값 : " + max);
    }

    public void getCount() {
        System.out.println("현재 count 값 : " + count);
    }

    // 사상검증
    private boolean countIsTrue() {
        return max > count;
    }

    private boolean maxIsTrue(int max) {
        return max > 0;
    }
}
