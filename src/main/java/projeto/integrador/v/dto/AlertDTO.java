package projeto.integrador.v.dto;

import projeto.integrador.v.enums.AlertType;

public class AlertDTO {
    private AlertType type;
    private String message;

    public AlertDTO(AlertType type, String message) {
        this.type = type;
        this.message = message;
    }

    public AlertType getType() { return type; }
    public String getMessage() { return message; }
}
