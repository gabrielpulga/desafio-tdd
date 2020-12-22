package src.exercicio03;

public class Main {
    public static void main(String[] args) {
        Mago gandalf = new Mago("Gandalf", 100, 150, 300, 200, 75, 65);
        Guerreiro guerreiro = new Guerreiro("Hercules", 200, 75, 285, 100, 200, 60);

        gandalf.attack();
        gandalf.lvlUp();
        gandalf.aprenderMagia("Conversar com animais");

        System.out.println("\n");

        guerreiro.attack();
        guerreiro.lvlUp();
        guerreiro.aprenderHabilidade("Soco esmagador de joaninhas");

        System.out.println("\n");

        gandalf.attack();
        gandalf.lvlUp();
        gandalf.aprenderMagia("Fogos de artificio");

        System.out.println("\n");

        guerreiro.attack();
        guerreiro.lvlUp();
        guerreiro.aprenderHabilidade("Chute quebrador de ossos");

        System.out.println("A quantidade de personagens criados é de : " + Personagem.getObjectInstances());
    }
}
