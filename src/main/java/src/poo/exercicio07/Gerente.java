package src.poo.exercicio07;

public class Gerente extends Funcionario {
    public Gerente(String nome, int idade, float salario) {
        super(nome, idade, salario);
    }

    @Override
    public float bonificacao() {
        return getSalario()+10000;
    }
}
