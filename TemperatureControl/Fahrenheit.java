class Fahrenheit {

    // The temperature value.
    private double temp;

    // Constructor, takes in the temperature.
    public Fahrenheit(double temp) {
        this.temp = temp;
    }

    // Converts to Kelvin.
    public double toKelvin() {
        return (temp + 459.67) * (5.0/9.0);
    }

    // Converts to Celsius.
    public double toCelsius() {
        return (temp - 32) * (5.0/9.0);
    }
}
