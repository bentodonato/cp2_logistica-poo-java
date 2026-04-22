package model;

import java.util.ArrayList;
import java.util.List;

public class Rota {

    private Veiculo veiculo;
    private List<Pacote> pacotes;

    public Rota(Veiculo veiculo) {
        this.veiculo = veiculo;
        this.pacotes = new ArrayList<>();
    }

    public boolean adicionarPacote(Pacote pacote) {
        if (veiculo.podeTransportar(pacote.getPeso())) {
            veiculo.adicionarCarga(pacote.getPeso());
            pacotes.add(pacote);
            return true;
        }
        return false;
    }

    public void iniciarEntrega() {
        for (Pacote p : pacotes) {
            p.atualizarStatus(StatusPack.EM_TRANSPORTE);
        }
    }

    public void finalizarEntrega() {
        for (Pacote p : pacotes) {
            p.atualizarStatus(StatusPack.ENTREGUE);
        }
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public List<Pacote> getPacotes() {
        return pacotes;
    }
}
