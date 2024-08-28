public interface Temperature {
     double getTemperature();
     void setTemperature(double temperature);
     String getUnit();
     void setUnit(String unit);
     double convertToCelsius();
     double convertToFahrenheit();
    double convertToKelvin();

}
