package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double fahrenheit = 9./5. * temperatureCelsius + 32;
        System.out.println(fahrenheit);
    }
}
