public class BaseConverter implements Temperature {
    double temperature;
    String unit;

    public BaseConverter(double temperature, String unit) {
        this.temperature = temperature;
        this.unit = unit;
    }
    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    @Override
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public double convertToCelsius() {
        if (unit.equals("F")) { //Fahrenheit to Celsius
            return (temperature - 32) * 5 / 9;
        } else if (unit.equals("K")) { //Kelvin to Celsius
            return temperature - 273.15;
        }

        return temperature;
    }

    @Override
    public double convertToFahrenheit() {
        if (unit.equals("C")) { //Celsius to Fahrenheit
            return (temperature * 9 / 5) + 32;
        } else if (unit.equals("K")) { //Kelvin to Fahrenheit
            return (temperature * 1.8) - 459.67;
        }
        return temperature;
    }

    @Override
    public double convertToKelvin() {
        if (unit.equals("C")) { //Celsius to Kelvin
            return temperature + 273.15;
        } else if (unit.equals("F")) { //Fahrenheit to Kelvin
            return (temperature + 459.67) / 1.8;
        }
        return temperature;
    }

}
