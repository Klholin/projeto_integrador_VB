package projeto.integrador.v.resource;

import projeto.integrador.v.dto.ResponseDTO;
import projeto.integrador.v.dto.SensorDTO;
import projeto.integrador.v.dto.AlertDTO;
import projeto.integrador.v.service.SensorService;
import projeto.integrador.v.service.AlertService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.inject.Inject;
import java.util.List;
import java.util.ArrayList;

@Path("/sensors")
public class SensorResource {

    @Inject
    SensorService sensorService;

    @Inject
    AlertService alertService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseDTO getData() {
        SensorDTO data = sensorService.generateMockData();

        // Defensive null-check: if sensor data is null, return empty alerts instead of failing
        if (data == null) {
            return new ResponseDTO(null, new ArrayList<>());
        }

        List<AlertDTO> alerts = alertService.checkAlerts(data);
        return new ResponseDTO(data, alerts);
    }
}
