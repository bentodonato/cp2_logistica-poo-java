package model;

public class Carro extends Veiculo {

    private String tipo;

    public Carro(String placa, double capacidadeMax, String tipo) {
        super(placa, capacidadeMax);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
