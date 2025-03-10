import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems = true;

        while (moreItems) {
            double price = SafeInput.getRangedDouble(in, "Enter item price", 0.50, 10.00);
            totalCost += price;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");
        }

        System.out.printf("\nTotal cost: $%.2f\n", totalCost);
    }
}
