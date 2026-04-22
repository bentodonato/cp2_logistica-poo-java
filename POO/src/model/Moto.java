package model;

public class Moto extends Veiculo {

    private boolean temBau;

    public Moto(String placa, double capacidadeMax, boolean temBau) {
        super(placa, capacidadeMax);
        this.temBau = temBau;
    }

    public boolean temBau() {
        return temBau;
    }
}
