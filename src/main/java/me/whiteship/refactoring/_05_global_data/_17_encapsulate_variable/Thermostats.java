package me.whiteship.refactoring._05_global_data._17_encapsulate_variable;

public class Thermostats {
    private static Integer targetTemperature = 70;
    private static Boolean heating = true;
    private static Boolean cooling = false;
    private static Boolean readInFahrenheit = true;

    protected Thermostats() {
    }

    public static Integer getTargetTemperature() {
        return targetTemperature;
    }

    public static void setTargetTemperature(final Integer targetTemperature) {
//        TODO validation
        Thermostats.targetTemperature = targetTemperature;
//        TODO notify
    }

    public static Boolean getHeating() {
        return heating;
    }

    public static void setHeating(final Boolean heating) {
        Thermostats.heating = heating;
    }

    public static Boolean getCooling() {
        return cooling;
    }

    public static void setCooling(final Boolean cooling) {
        Thermostats.cooling = cooling;
    }

    public static Boolean getReadInFahrenheit() {
        return readInFahrenheit;
    }

    public static void setReadInFahrenheit(final Boolean readInFahrenheit) {
        Thermostats.readInFahrenheit = readInFahrenheit;
    }
}
