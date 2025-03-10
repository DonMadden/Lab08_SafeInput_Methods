import java.util.Scanner;

public class SafeInput {

    // Part A: getNonZeroLenString
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    // Part B: getInt
    public static int getInt(Scanner pipe, String prompt) {
        int retValue = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
            pipe.nextLine(); // Clear the buffer
        } while (!valid);
        return retValue;
    }

    // Part C: getDouble
    public static double getDouble(Scanner pipe, String prompt) {
        double retValue = 0.0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
            }
            pipe.nextLine(); // Clear the buffer
        } while (!valid);
        return retValue;
    }

    // Part D: getRangedInt
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retValue = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                if (retValue >= low && retValue <= high) {
                    valid = true;
                } else {
                    System.out.println("Out of range. Please enter a number between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
            }
            pipe.nextLine(); // Clear the buffer
        } while (!valid);
        return retValue;
    }

    // Part E: getRangedDouble
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retValue = 0.0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                if (retValue >= low && retValue <= high) {
                    valid = true;
                } else {
                    System.out.println("Out of range. Please enter a number between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
            }
            pipe.nextLine(); // Clear the buffer
        } while (!valid);
        return retValue;
    }

    // Part F: getYNConfirm
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean valid = false;
        boolean retValue = false;
        do {
            System.out.print("\n" + prompt + " (Y/N): ");
            String response = pipe.nextLine().trim().toLowerCase();
            if (response.equals("y")) {
                retValue = true;
                valid = true;
            } else if (response.equals("n")) {
                retValue = false;
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        } while (!valid);
        return retValue;
    }

    // Part G: getRegExString
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retValue = "";
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            retValue = pipe.nextLine();
            if (retValue.matches(regEx)) {
                valid = true;
            } else {
                System.out.println("Input does not match the required pattern.");
            }
        } while (!valid);
        return retValue;
    }

    // Part H: prettyHeader
    public static void prettyHeader(String msg) {
        String border = new String(new char[60]).replace('\0', '*');
        System.out.println(border);
        int padding = (60 - msg.length() - 6) / 2;
        System.out.println("***" + " ".repeat(padding) + msg + " ".repeat(padding) + "***");
        System.out.println(border);
    }

    // Part I: CtoF (for the temperature conversion table)
    public static double CtoF(double Celsius) {
        return (Celsius * 9 / 5) + 32;
    }
}