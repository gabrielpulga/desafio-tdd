package src.exercicio03;

import java.util.List;

public class Mago extends Personagem {
    private List<String> Magia;

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public List<String> getMagia() {
        return Magia;
    }

    public void setMagia(List<String> magia) {
        Magia = magia;
    }

    int novaMana = 0;
    int novaInteligencia = 0;
    int novoNivel = 0;

    public int lvlUp() {
        novoNivel = novoNivel+1;
        novaMana = novaMana + 5 + this.getMana();

        novaInteligencia = novaInteligencia + 10 + this.getInteligencia();

        System.out.println("O personagem " + this.getNome() + " subiu de nível e agora possui " + novaMana + " de mana e " + novaInteligencia + " de inteligencia");
        return novoNivel;
    }

    public boolean attack() {
        double danoDoAtaque = this.getInteligencia()*this.getLevel() + Math.floor(Math.random() * 301);

        System.out.println(this.getNome() + " realizou um ataque e causou " + danoDoAtaque + " de dano");

        return true;
    }

    public boolean aprenderMagia(String magiaAprendida) {
        System.out.println(this.getNome() + " acabou de aprender a magia " + magiaAprendida + " e esta pronto para utiliza-la");

        return true;
    }
}
