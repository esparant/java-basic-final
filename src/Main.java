import class1.access.BankAccount;
import class1.access.ex.Item;
import poly.basic.Parent3;
import poly.diamond2.AbstractAnimal3;

public class Main {
    public static void main(String[] args) {
        Main a = new Main();
        a.print();
        Object ab = 1.3;
        boolean A = false;
        System.out.println(A);
        if (ab instanceof Object) {
            A = true;
        }
        System.out.println(A);
    }

    void print() {
        System.out.println("안녕");
    }
}