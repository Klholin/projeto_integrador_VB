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
        // Defensive: if dto is null, return empty alerts rather than throwing NPE
        List<AlertDTO> alerts = new ArrayList<>();

        // If the whole payload is missing, add a payload-missing alert and return
        if (dto == null) {
            alerts.add(new AlertDTO(AlertType.MISSING_PAYLOAD, "Dados do sensor não recebidos (payload nulo)."));
            return alerts;
        }

        // If individual fields are null, add an alert for each missing field
        Double temp = dto.getTemperature();
        if (temp == null) {
            alerts.add(new AlertDTO(AlertType.MISSING_TEMPERATURE, "Leitura de temperatura ausente (null)."));
        } else {
            if (temp < 18) {
                alerts.add(new AlertDTO(AlertType.LOW_TEMP, "Temperatura muito baixa!"));
            }
            if (temp > 30) {
                alerts.add(new AlertDTO(AlertType.HIGH_TEMP, "Temperatura elevada!"));
            }
        }

        Integer humidity = dto.getHumidity();
        if (humidity == null) {
            alerts.add(new AlertDTO(AlertType.MISSING_HUMIDITY, "Leitura de umidade ausente (null)."));
        } else {
            if (humidity < 30) {
                alerts.add(new AlertDTO(AlertType.LOW_HUMIDITY, "Umidade baixa!"));
            }
            if (humidity > 70) {
                alerts.add(new AlertDTO(AlertType.HIGH_HUMIDITY, "Umidade elevada!"));
            }
        }

        Integer luminosity = dto.getLuminosity();
        if (luminosity == null) {
            alerts.add(new AlertDTO(AlertType.MISSING_LUMINOSITY, "Leitura de luminosidade ausente (null)."));
        } else {
            if (luminosity < 20) {
                alerts.add(new AlertDTO(AlertType.LOW_LIGHT, "Pouca luminosidade!"));
            }
            if (luminosity > 80) {
                alerts.add(new AlertDTO(AlertType.HIGH_LIGHT, "Luminosidade muito alta!"));
            }
        }

        return alerts;
    }
}
