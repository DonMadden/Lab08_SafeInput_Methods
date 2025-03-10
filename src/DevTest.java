import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test each method one by one
        System.out.println("Testing getNonZeroLenString: " + SafeInput.getNonZeroLenString(in, "Enter a non-empty string"));
        System.out.println("Testing getInt: " + SafeInput.getInt(in, "Enter an integer"));
        System.out.println("Testing getDouble: " + SafeInput.getDouble(in, "Enter a double"));
        System.out.println("Testing getRangedInt: " + SafeInput.getRangedInt(in, "Enter an integer between 1 and 10", 1, 10));
        System.out.println("Testing getRangedDouble: " + SafeInput.getRangedDouble(in, "Enter a double between 0.5 and 9.5", 0.5, 9.5));
        System.out.println("Testing getYNConfirm: " + SafeInput.getYNConfirm(in, "Do you want to continue?"));
        System.out.println("Testing getRegExString (SSN format): " + SafeInput.getRegExString(in, "Enter SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$"));

        // Testing Pretty Header
        SafeInput.prettyHeader("Welcome to Java");

        in.close();
    }
}
