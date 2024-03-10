package class1.access.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter newCounter = new MaxCounter(7);
        newCounter.increment();
        newCounter.increment();
        newCounter.increment();
        newCounter.increment();
        newCounter.getMax();
        newCounter.getCount();
        newCounter.increment();
        newCounter.increment();
        newCounter.increment();
        newCounter.increment();
    }
}
