package projeto.integrador.v.service;

import jakarta.enterprise.context.ApplicationScoped;
import projeto.integrador.v.dto.SensorDTO;
import projeto.integrador.v.dto.AlertDTO;
import projeto.integrador.v.enums.AlertType;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class AlertService {

    public List<AlertDTO> checkAlerts(SensorDTO dto) {
        List<AlertDTO> alerts = new ArrayList<>();

        if (dto.getTemperature() < 18) {
            alerts.add(new AlertDTO(AlertType.LOW_TEMP, "Temperatura muito baixa!"));
        }
        if (dto.getTemperature() > 30) {
            alerts.add(new AlertDTO(AlertType.HIGH_TEMP, "Temperatura elevada!"));
        }

        if (dto.getHumidity() < 30) {
            alerts.add(new AlertDTO(AlertType.LOW_HUMIDITY, "Umidade baixa!"));
        }
        if (dto.getHumidity() > 70) {
            alerts.add(new AlertDTO(AlertType.HIGH_HUMIDITY, "Umidade elevada!"));
        }

        if (dto.getLuminosity() < 20) {
            alerts.add(new AlertDTO(AlertType.LOW_LIGHT, "Pouca luminosidade!"));
        }
        if (dto.getLuminosity() > 80) {
            alerts.add(new AlertDTO(AlertType.HIGH_LIGHT, "Luminosidade muito alta!"));
        }

        return alerts;
    }
}
