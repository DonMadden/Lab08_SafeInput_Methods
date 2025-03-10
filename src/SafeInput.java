import java.util.Scanner;

public class SafeInput {

    /**
     * Gets a non-zero length string from the user
     * @param pipe Scanner instance
     * @param prompt Message prompt
     * @return Non-empty string
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    /**
     * Gets an integer from the user with input validation
     * @param pipe Scanner instance
     * @param prompt Message prompt
     * @return Valid integer
     */
    public static int getInt(Scanner pipe, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine(); // Clear buffer
                return value;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.nextLine(); // Clear buffer
            }
        }
    }

    /**
     * Gets a double from the user with input validation
     * @param pipe Scanner instance
     * @param prompt Message prompt
     * @return Valid double
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine(); // Clear buffer
                return value;
            } else {
                System.out.println("Invalid input. Please enter a decimal number.");
                pipe.nextLine(); // Clear buffer
            }
        }
    }

    /**
     * Gets an integer within a range from the user
     * @param pipe Scanner instance
     * @param prompt Message prompt
     * @param low Lower bound (inclusive)
     * @param high Upper bound (inclusive)
     * @return Valid integer within range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value;
        do {
            System.out.printf("%s [%d-%d]: ", prompt, low, high);
            while (!pipe.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.nextLine();
            }
            value = pipe.nextInt();
            pipe.nextLine();
        } while (value < low || value > high);
        return value;
    }

    /**
     * Gets a double within a range from the user
     * @param pipe Scanner instance
     * @param prompt Message prompt
     * @param low Lower bound (inclusive)
     * @param high Upper bound (inclusive)
     * @return Valid double within range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double value;
        do {
            System.out.printf("%s [%.2f-%.2f]: ", prompt, low, high);
            while (!pipe.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a decimal number.");
                pipe.nextLine();
            }
            value = pipe.nextDouble();
            pipe.nextLine();
        } while (value < low || value > high);
        return value;
    }

    /**
     * Gets a yes/no confirmation from the user
     * @param pipe Scanner instance
     * @param prompt Message prompt
     * @return True for yes, False for no
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        while (true) {
            System.out.print(prompt + " [Y/N]: ");
            response = pipe.nextLine().trim().toUpperCase();
            if (response.equals("Y")) return true;
            if (response.equals("N")) return false;
            System.out.println("Invalid input. Please enter Y or N.");
        }
    }

    /**
     * Gets a string that matches a given regex pattern
     * @param pipe Scanner instance
     * @param prompt Message prompt
     * @param regEx Regular expression pattern
     * @return Valid string matching pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        do {
            System.out.print(prompt + ": ");
            input = pipe.nextLine();
            if (!input.matches(regEx)) {
                System.out.println("Invalid input. Please match the required format.");
            }
        } while (!input.matches(regEx));
        return input;
    }

    /**
     * Displays a centered header with a message
     * @param msg Message to center
     */
    public static void prettyHeader(String msg) {
        final int WIDTH = 60;
        int messagePadding = (WIDTH - msg.length() - 6) / 2;

        System.out.println("*".repeat(WIDTH));
        System.out.println("***" + " ".repeat(messagePadding) + msg + " ".repeat(messagePadding) + "***");
        System.out.println("*".repeat(WIDTH));
    }
}