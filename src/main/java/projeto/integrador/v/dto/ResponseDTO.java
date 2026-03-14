package projeto.integrador.v.dto;

import java.util.List;

public class ResponseDTO {
    private SensorDTO sensorData;
    private List<AlertDTO> alerts;

    public ResponseDTO(SensorDTO sensorData, List<AlertDTO> alerts) {
        this.sensorData = sensorData;
        this.alerts = alerts;
    }

    public SensorDTO getSensorData() { return sensorData; }
    public List<AlertDTO> getAlerts() { return alerts; }
}



