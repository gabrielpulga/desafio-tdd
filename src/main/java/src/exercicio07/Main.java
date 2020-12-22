package src.exercicio07;

public class Main {
    public static void main(String[] args){
        Gerente gerente = new Gerente("Joao", 22, 6500);
        Supervisor supervisor = new Supervisor("Ana", 24, 4500);
        Vendedor vendedor = new Vendedor("Helio", 19, 3000);

        System.out.println(gerente);
        System.out.println("Bonificacao : " + gerente.bonificacao() + "\n");
        System.out.println(supervisor);
        System.out.println("Bonificacao : " + supervisor.bonificacao() + "\n");
        System.out.println(vendedor);
        System.out.println("Bonificacao : " + vendedor.bonificacao() + "\n");

    }
}
