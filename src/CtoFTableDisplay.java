public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.println("Celsius    Fahrenheit");
        System.out.println("---------------------");
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = SafeInput.CtoF(celsius);
            System.out.printf("%3d        %.2f\n", celsius, fahrenheit);
        }
    }
}