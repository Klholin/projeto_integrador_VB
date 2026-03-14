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
import java.util.List;

@Path("/sensors")
public class SensorResource {

    private SensorService sensorService = new SensorService();
    private AlertService alertService = new AlertService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseDTO getData() {
        SensorDTO data = sensorService.generateMockData();
        List<AlertDTO> alerts = alertService.checkAlerts(data);
        return new ResponseDTO(data, alerts);
    }

}
