import java.util.Scanner;


public class UserMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static final int CELSJUS_TO_FAHRENHEIT = 1;
    private static final int CELSJUS_TO_KELVIN = 2;
    private static final int FAHRENHEIT_TO_CELSIUS = 3;
    private static final int FAHRENHEIT_TO_KELVIN = 4;


    static void showOptions() {
        System.out.println(CELSJUS_TO_FAHRENHEIT + " = Konwersja stopni Celsjusz na stopnie Fahrenheita");
        System.out.println(CELSJUS_TO_KELVIN + " = Konwersja stopni Celsjusza na stopnie Kelvina");
        System.out.println(FAHRENHEIT_TO_CELSIUS + " = Konwersja stopni Fahrenheita na stopnie Celsjusza");
        System.out.println(FAHRENHEIT_TO_KELVIN + " = Konwersja stopni Fahrenheita na stopnie Kelvina");
    }

    static int readOption() {
        System.out.println("\nWybierz rodzaj konwersji, jaki Cię interesuje: ");
        return readInt();
    }

    static private int readInt() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    static void executeOption(int opt) {
        switch (opt) {
            case FAHRENHEIT_TO_CELSIUS:
                ConversionHub.fahrenheitToCelsius();
                break;
            case CELSJUS_TO_FAHRENHEIT:
                ConversionHub.celsiusToFahrenheit();
                break;
            case CELSJUS_TO_KELVIN:
                ConversionHub.celsiusToKelvin();
                break;
            case FAHRENHEIT_TO_KELVIN:
                ConversionHub.fahrenheitToKelvin();
        }
    }

    static void mainMethod() {
        int option;
        showOptions();
        option = readOption();
        executeOption(option);
    }
}

