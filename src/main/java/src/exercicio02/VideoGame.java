package src.exercicio02;

public class VideoGame extends Produto implements Imposto {
    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame() {
    }

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    @Override
    public double calculaImposto() {
        if (this.isUsado()) {
            System.out.println("Imposto " + this.getNome() + " usado, R$" + 0.25*this.getPreco());
            return 0.25*this.getPreco();
        } else {
            System.out.println("Imposto " + this.getNome() + " novo, R$" + 0.40*this.getPreco());
            return 0.40*this.getPreco();
        }
    }
}
