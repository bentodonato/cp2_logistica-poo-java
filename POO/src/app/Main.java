package app;


import model.*;

public class Main {

    public static void main(String[] args) {

        Veiculo caminhao = new Caminhao("BDG5616", 1000, 4);

        Pacote p1 = new Pacote("PK1", 200);
        Pacote p2 = new Pacote("PK2", 500);

        Rota rota = new Rota(caminhao);

        rota.adicionarPacote(p1);
        rota.adicionarPacote(p2);

        Entrega entrega = new Entrega(rota);

        entrega.iniciar();
        entrega.finalizar();

        System.out.println("Entrega finalizada!");
        System.out.println("Veículo: " + caminhao.getPlaca());
        System.out.println("Pacotes na rota: " + rota.getPacotes().size());

        for (Pacote p : rota.getPacotes()) {
            System.out.println("Pacote " + p.getCodigo() + " - Status: " + p.getStatus());
        }
    }
}
