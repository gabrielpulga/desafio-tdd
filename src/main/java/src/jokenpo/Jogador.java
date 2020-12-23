package src.jokenpo;

public class Jogador {
    private JoKenPo mao;
    private boolean isCampeao;

    @Override
    public String toString() {
        return "Jogador{" +
                "mao=" + mao +
                ", isCampeao=" + isCampeao +
                '}';
    }

    public Jogador() {
    }

    public boolean isCampeao() {
        return isCampeao;
    }

    public void setCampeao(boolean campeao) {
        isCampeao = campeao;
    }

    public JoKenPo getMao() {
        return mao;
    }

    public void setMao(JoKenPo mao) {
        this.mao = mao;
    }
}
