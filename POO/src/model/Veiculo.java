package model;

public abstract class Veiculo {

    private String placa;
    private double capacidadeMax;
    private double cargaAtual;

    public Veiculo(String placa, double capacidadeMax) {
        if (capacidadeMax <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser maior que 0");
        }
        this.placa = placa;
        this.capacidadeMax = capacidadeMax;
        this.cargaAtual = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidadeMax() {
        return capacidadeMax;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public boolean podeTransportar(double peso) {
        return cargaAtual + peso <= capacidadeMax;
    }

    public void adicionarCarga(double peso) {
        if (!podeTransportar(peso)) {
            throw new IllegalArgumentException("Capacidade excedida");
        }
        cargaAtual += peso;
    }
}
