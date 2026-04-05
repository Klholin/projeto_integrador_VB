package projeto.integrador.v.dto;

// Use wrapper types (Double/Integer) so fields can be null when data is missing
public class SensorDTO {
    private Double temperature;
    private Integer humidity;
    private Integer luminosity;

    public SensorDTO() {} // construtor vazio

    public SensorDTO(Double temperature, Integer humidity, Integer luminosity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.luminosity = luminosity;
    }

    public Double getTemperature() { return temperature; }
    public Integer getHumidity() { return humidity; }
    public Integer getLuminosity() { return luminosity; }
}

