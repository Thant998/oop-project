import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


// TemperatureControl main class.
public class TemperatureControl {

    // Main method.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the first unit, asking until it's valid.
        System.out.println("What unit do you want to convert from?");
        System.out.print("Enter 1 for Celsius, 2 for Kelvin, 3 for Farenheit: ");
        int startUnit = 0;
        while (startUnit == 0) {
            startUnit = input.nextInt();
            if (startUnit < 1 || startUnit > 3)
                System.out.print("Out of range. Choose again: ");

        }
        // Get the value.
        System.out.println("What is the value of the temperature?");
        double temp = input.nextDouble();

        // Get the second unit, asking until it's valid.
        System.out.println("What unit do you want to convert to?");
        System.out.print("Enter 1 for Celsius, 2 for Kelvin, 3 for Farenheit: ");
        int endUnit = 0;
        while (endUnit == 0) {
            endUnit = input.nextInt();
            if (endUnit < 1 || endUnit > 3) {
                System.out.print("Out of range. Choose again: ");
            } else if (endUnit == startUnit) {
                endUnit = 0;
                System.out.print("Can't convert from a unit to itself. Choose again: ");
            }
        }
        input.close();
        System.out.println();

        // Do the conversion.
        String result = null;
        String format = "%.2f%s = %.2f%s";
        if (startUnit == 1) { // Celsius
            Celsius temperature = new Celsius(temp);
            if (endUnit == 2) {
                //result = temp + "C = " + temperature.toKelvin() + "K";
                result = String.format(format, temp, "C", temperature.toKelvin(), "K");
            } else {
                //result = temp + "C = " + temperature.toFahrenheit() + "F";
                result = String.format(format, temp, "C", temperature.toFahrenheit(), "F");
            }
        } else if (startUnit == 2) { // Kelvin
            Kelvin temperature = new Kelvin(temp);
            if (endUnit == 1) {
                //result = temp + "K = " + temperature.toCelsius() + "C";
                result = String.format(format, temp, "K", temperature.toCelsius(), "C");
            } else {
                //result = temp + "K = " + temperature.toFahrenheit() + "F";
                result = String.format(format, temp, "K", temperature.toFahrenheit(), "F");
            }
        } else { // Fahrenheit
            Fahrenheit temperature = new Fahrenheit(temp);
            if (endUnit == 1) {
                //result = temp + "F = " + temperature.toCelsius() + "C";
                result = String.format(format, temp, "F", temperature.toCelsius(), "C");
            } else {
                //result = temp + "F = " + temperature.toKelvin() + "K";
                result = String.format(format, temp, "F", temperature.toKelvin(), "K");
            }
        }

        System.out.println(result);
        writeToFile(result);
    }

    // Method to write the conversion to file.
    public static void writeToFile(String line) {
        try {
            PrintWriter pw = new PrintWriter("output.txt");
            pw.println(line);
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}
