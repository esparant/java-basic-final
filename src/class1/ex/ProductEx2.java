package class1.ex;

import javax.swing.plaf.basic.BasicBorders;
import java.util.Scanner;

public class ProductEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductOrder[] orders;
        System.out.printf("등록하고 싶은 상품 개수를 입력해주세요 : ");
        int value = sc.nextInt();
        sc.nextLine();
        orders = new ProductOrder[value];
        for(int i = 0; i < value; i ++) {
            System.out.printf("%d 번째 상품의 이름을 입력해주세요 : ", i + 1);
            String name = sc.nextLine();
            System.out.printf("%d 번째 상품의 가격을 입력해주세요 : ", i + 1);
            int price = sc.nextInt();
            System.out.printf("%d 번째 상품의 개수를 입력해주세요 : ", i + 1);
            int quantity = sc.nextInt();
            orders[i] = createOrder(name, price, quantity);
            sc.nextLine();
        }
        printOrder(orders);
        sumOrder(orders);


    }
    static ProductOrder createOrder(String proName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = proName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.printf("제품명: %s, 제품가격: %d, 제품개수: %d\n", order.price, order.price, order.quantity);
        }
    }
    static void sumOrder(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        System.out.println("총가격: " + sum + "원");
    }
}
