package model;

public class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(String placa, double capacidadeMax, int eixos) {
        super(placa, capacidadeMax);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }
}
