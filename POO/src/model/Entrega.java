package model;

import java.time.LocalDateTime;

public class Entrega {

    private Rota rota;
    private LocalDateTime dataSaida;
    private LocalDateTime dataEntrega;

    public Entrega(Rota rota) {
        this.rota = rota;
    }

    public void iniciar() {
        dataSaida = LocalDateTime.now();
        rota.iniciarEntrega();
    }

    public void finalizar() {
        dataEntrega = LocalDateTime.now();
        rota.finalizarEntrega();
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

    public LocalDateTime getDataEntrega() {
        return dataEntrega;
    }
}
