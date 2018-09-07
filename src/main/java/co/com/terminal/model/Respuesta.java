package co.com.terminal.model;

import java.io.Serializable;

public class Respuesta implements Serializable {

    private String requestMessage;
    private Servicio servicio;

    public String getRequestMessage() {
        return requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}
