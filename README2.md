📡 API-Arduino
Este projeto implementa uma API REST utilizando Quarkus, o Supersonic Subatomic Java Framework.  
  O objetivo é simular a leitura de sensores (temperatura, umidade e luminosidade), processar os dados e expor endpoints para consumo externo.

🚀 Tecnologias utilizadas
Quarkus (framework principal)

Jakarta REST (JAX-RS) para criação dos endpoints

Injeção de dependência com @Inject

DTOs para transporte de dados (SensorDTO, AlertDTO, ResponseDTO)

Services para lógica de negócio (SensorService, AlertService)

Swagger UI para documentação e testes dos endpoints

📑 Endpoints principais
GET /sensors → retorna dados mockados dos sensores e possíveis alertas.
Exemplo de resposta:

json
{
"sensorData": {
"temperature": 25.3,
"humidity": 60,
"luminosity": 300
},
"alerts": [
{
"type": "HIGH_LIGHT",
"message": "Luminosidade acima do limite"
}
]
}    
🔗 Testes via Swagger UI: http://localhost:8080/q/swagger-ui/#/Sensor%20Resource

👨‍💻 Estrutura do projeto
Resource: SensorResource → expõe os endpoints REST.

Services: SensorService, AlertService → lógica de geração e processamento.

DTOs: SensorDTO, AlertDTO, ResponseDTO → transporte de dados.

Enum: AlertType → define os tipos de alerta possíveis.