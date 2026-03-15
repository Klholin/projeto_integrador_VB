package projeto.integrador.v.dto;

public class SensorDTO {
    private double temperature;
    private int humidity;
    private int luminosity;

    public SensorDTO() {} // construtor vazio

    public SensorDTO(double temperature, int humidity, int luminosity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.luminosity = luminosity;
    }

    public double getTemperature() { return temperature; }
    public int getHumidity() { return humidity; }
    public int getLuminosity() { return luminosity; }
}

