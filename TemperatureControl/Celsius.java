class Celsius {

    // The temperature value.
    private double temp;

    // Constructor, takes in the temperature.
    public Celsius(double temp) {
        this.temp = temp;
    }

    // Converts to Kelvin.
    public double toKelvin() {
        return (temp + 273.15);
    }

    // Converts to Fahrenheit.
    public double toFahrenheit() {
        return (9.0/5*temp + 32);
    }
}