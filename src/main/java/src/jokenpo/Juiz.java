package src.jokenpo;

public class Juiz {

    @Override
    public String toString() {
        return "Juiz{}";
    }

    public Juiz() {
    }

    public void decidirOGanhador(Jogador jogadorUm, Jogador jogadorDois) {

        if (jogadorUm.getMao() == JoKenPo.PAPEL) {

            if (jogadorDois.getMao() == JoKenPo.PEDRA) {
                jogadorUm.setCampeao(true);
                System.out.println("Jogador Um ganhou ao usar papel contra pedra.");
            }

            if (jogadorDois.getMao() == JoKenPo.TESOURA) {
                jogadorDois.setCampeao(true);
                System.out.println("Jogador Dois ganhou ao usar tesoura contra papel.");
            }
            if (jogadorDois.getMao() == JoKenPo.PAPEL)
                System.out.println("Empate técnico de papel contra papel.");

        } else if (jogadorUm.getMao() == JoKenPo.PEDRA) {

            if (jogadorDois.getMao() == JoKenPo.PAPEL) {
                jogadorDois.setCampeao(true);
                System.out.println("Jogador Dois ganhou ao usar papel contra pedra.");
            }
            if (jogadorDois.getMao() == JoKenPo.TESOURA) {
                jogadorUm.setCampeao(true);
                System.out.println("Jogador Um ganhou ao usar pedra contra tesoura.");
            }
            if (jogadorDois.getMao() == JoKenPo.PEDRA)
                System.out.println("Empate técnico de pedra contra pedra.");

        } else if (jogadorUm.getMao() == JoKenPo.TESOURA) {

            if (jogadorDois.getMao() == JoKenPo.PEDRA) {
                jogadorDois.setCampeao(true);
                System.out.println("Jogador Dois ganhou ao usar pedra contra tesoura.");
            }
            if (jogadorDois.getMao() == JoKenPo.PAPEL) {
                jogadorUm.setCampeao(true);
                System.out.println("Jogador Um ganhou ao usar tesoura contra papel.");
            }
            if (jogadorDois.getMao() == JoKenPo.TESOURA)
                System.out.println("Empate técnico de tesoura contra tesoura.");
        }
    }
}
