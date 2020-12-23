package src.exercicio03;

public abstract class Personagem {
    protected String Nome;
    protected int Vida;
    protected int Mana;
    protected float Xp;
    protected int Inteligencia;
    protected int Forca;
    protected int Level;

    // Contador estático
    private static int objectInstances = 0;

    public Personagem() {
    }

    public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        Nome = nome;
        Vida = vida;
        Mana = mana;
        Xp = xp;
        Inteligencia = inteligencia;
        Forca = forca;
        Level = level;

        // Incrementa no número de objetos instanciados cada vez que o construtor é inicializado
        objectInstances++;
    }

    // Retorna número do contador estático
    public static int getObjectInstances() {
        return objectInstances;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public int getMana() {
        return Mana;
    }

    public void setMana(int mana) {
        Mana = mana;
    }

    public float getXp() {
        return Xp;
    }

    public void setXp(float xp) {
        Xp = xp;
    }

    public int getInteligencia() {
        return Inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        Inteligencia = inteligencia;
    }

    public int getForca() {
        return Forca;
    }

    public void setForca(int forca) {
        Forca = forca;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int lvlUp() {
        return 0;
    }
}
