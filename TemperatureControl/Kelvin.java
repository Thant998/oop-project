class Kelvin {

    // The temperature value.
    private double temp;

    // Constructor, takes in the temperature.
    public Kelvin(double temp) {
        this.temp = temp;
    }

    // Converts to Celsius.
    public double toCelsius() {
        return (temp - 273.15);
    }

    // Converts to Fahrenheit.
    public double toFahrenheit() {
        return (9.0/5*temp - 459.67);
    }
}