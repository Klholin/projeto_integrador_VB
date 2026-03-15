package projeto.integrador.v.service;

import jakarta.enterprise.context.ApplicationScoped;
import projeto.integrador.v.dto.SensorDTO;
import java.util.Random;

@ApplicationScoped
public class SensorService {
    private Random random = new Random();

    public SensorDTO generateMockData() {
        double temp = 20 + random.nextDouble() * 10; // 20–30 °C
        int humidity = 30 + random.nextInt(40);      // 30–70 %
        int luminosity = random.nextInt(101);        // 0–100 %

        return new SensorDTO(temp, humidity, luminosity);
    }
}

