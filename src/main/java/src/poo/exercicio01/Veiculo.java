package src.poo.exercicio01;

public class Veiculo {

    // Variáveis
    private String Marca;
    private String Modelo;
    private String Placa;
    private String Cor;
    private float Km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int Velocidade;
    private Double preco;

    // Getters/setters
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public float getKm() {
        return Km;
    }

    public void setKm(float km) {
        Km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(int velocidade) {
        Velocidade = velocidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    // Métodos

    public int acelerar() {
        Velocidade = Velocidade + 20;
        setVelocidade(Velocidade);
        System.out.println("Esse carro acelerou e agora esta andando a " + Velocidade + " km/h");
        return Velocidade;
    }

    public int abastecer(int combustivel) {
        if ((getLitrosCombustivel() + combustivel) > 60) {
            System.out.println("Limite de combustivel de 60 litros, favor nao ultrapassar");
        } else {
            setLitrosCombustivel(getLitrosCombustivel() + combustivel);
            System.out.println("Este carro agora esta com " + getLitrosCombustivel() + " litros de combustivel");
        }
        return getLitrosCombustivel();
    }

    public int frear() {
        if (getVelocidade() == 0) {
            System.out.println("Veiculo parado, impossivel frear");
        } else {
            Velocidade = Velocidade - 20;
            setVelocidade(Velocidade);
            System.out.println("Este carro freou e agora esta andando a " + getVelocidade() + " km/h");
        }
        return Velocidade;
    }

    public String pintar(String cor) {
        setCor(cor);
        System.out.println("Este carro foi pintado e agora possui a cor " + getCor());
        return cor;
    }

    public boolean ligar() {
        if (isLigado()) {
            System.out.println("Carro ja esta ligado");
        } else {
            setLigado(true);
            System.out.println("Vrum vrum, este carro acaba de ser ligado");
        }
        return isLigado;
    }

    public void desligar() {
        if (isLigado() && (getVelocidade() == 0)) {
            setLigado(false);
            System.out.println("Este carro acaba de ser desligado");
        } else if (!isLigado()) {
            System.out.println("Carro ja esta desligado");
        } else if (isLigado() && (getVelocidade() > 0)) {
            System.out.println("Impossivel desligar o carro em movimento");
        }
    }

    // Construtor
    public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado, int litrosCombustivel, int velocidade, Double preco) {
        Marca = marca;
        Modelo = modelo;
        Placa = placa;
        Cor = cor;
        Km = km;
        this.isLigado = isLigado;
        this.litrosCombustivel = litrosCombustivel;
        Velocidade = velocidade;
        this.preco = preco;
    }

    // Teste dos métodos através do console
    public static void main(String[] args) {
        Veiculo fiatPalio = new Veiculo("Fiat", "Palio", "ABXT2370", "Amarelo", 2323, true, 3, 40, 37750.26);
        fiatPalio.acelerar();
        fiatPalio.abastecer(57);
        fiatPalio.frear();
        fiatPalio.pintar("Azul");
        fiatPalio.ligar();
        fiatPalio.desligar();

        System.out.println("------");

        Veiculo hondaCivic = new Veiculo("Honda", "Civic", "OPAB2993", "Azul", 3233, false, 60, 0, 89980.60);
        hondaCivic.acelerar();
        hondaCivic.abastecer(20);
        hondaCivic.frear();
        hondaCivic.pintar("Amarelo");
        hondaCivic.ligar();
        hondaCivic.desligar();
    }
}
