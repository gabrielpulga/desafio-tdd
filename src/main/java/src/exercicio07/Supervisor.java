package src.exercicio07;

public class Supervisor extends Funcionario {
    public Supervisor(String nome, int idade, float salario) {
        super(nome, idade, salario);
    }

    @Override
    public float bonificacao() {
        return getSalario()+5000;
    }
}
