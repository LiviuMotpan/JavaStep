public class TempConverter {

    public static void main(String[] args) {

        double celsiusDegrees = 20;
        double celsiusDegreesToFahrenehit = celsiusDegrees*1.8 + 32;
        double fahrenheitDegrees = 75.55;
        double fahrenehitDegreesToCelsius = (fahrenheitDegrees-32)*5/9;

        System.out.println("Celsius to Fahrenheit -> "+celsiusDegreesToFahrenehit + " Fahrenheit to Celsius -> " + fahrenehitDegreesToCelsius);
    }

}
