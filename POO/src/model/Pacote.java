package model;

public class Pacote {

    private String codigo;
    private double peso;
    private StatusPack status;

    public Pacote(String codigo, double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser maior que 0");
        }
        this.codigo = codigo;
        this.peso = peso;
        this.status = StatusPack.PENDENTE;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public StatusPack getStatus() {
        return status;
    }

    public void atualizarStatus(StatusPack status) {
        this.status = status;
    }
}
