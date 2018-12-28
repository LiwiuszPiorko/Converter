import java.util.Scanner;

public class ConversionHub {

    static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę wyrażoną w stopniach Fahrenheita: ");
        int fahrenheit = scanner.nextInt();
        double celsjus = (fahrenheit - 32) / 1.8;
        System.out.println("Temperatura w stopniach Celsjusza to: " + celsjus);
    }

    static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę wyrażoną w stopniach Celsjusza: ");
        int celsjus = scanner.nextInt();
        double fahrenheit = (celsjus * 1.8) + 32;
        System.out.println("Temperatura w stopniach Fahrenheita to: " + fahrenheit);

    }

    static void fahrenheitToKelvin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę wyrazoną w stopniach Fahrenheita: ");
        int fahrenheit = scanner.nextInt();
        double kelvin = (fahrenheit + 459.67) * 5 / 9;
        System.out.println("Temperatura w stopniach Kelvina to: " + kelvin);
    }

    static void celsiusToKelvin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę wyrazoną w stopniach Celsjusza: ");
        int celsjus = scanner.nextInt();
        double kelvin = celsjus + 273.15;
        System.out.println("Temperatura w stopniach Kelvina to: " + kelvin);
    }
}
