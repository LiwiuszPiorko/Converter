public class Temperature {
    int fahrenheit;
    int celsius;

    public Temperature(int fahrenheit, int celsius) {
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
    }

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }
}
