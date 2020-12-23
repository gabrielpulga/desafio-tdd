package jokenpo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class juizTest {

    // Instâncias de jogadores e juiz
    private Jogador jogadorUm = new Jogador();
    private Jogador jogadorDois = new Jogador();
    private Juiz juiz = new Juiz();

    @Before
    public void setup() {
        jogadorUm.setMao(JoKenPo.maoAleatoria());
        jogadorDois.setMao(JoKenPo.maoAleatoria());
        juiz.decidirOGanhador(jogadorUm, jogadorDois);
    }

    @Test
    public void deveDecidirOGanhador() {
        if (jogadorUm.getMao() == JoKenPo.PAPEL) {
            if (jogadorDois.getMao() == JoKenPo.PEDRA) {
                Assert.assertEquals(true, jogadorUm.isCampeao());

            } else if (jogadorDois.getMao() == JoKenPo.TESOURA)
                Assert.assertEquals(true, jogadorDois.isCampeao());

        } else if (jogadorUm.getMao() == JoKenPo.PEDRA) {
            if (jogadorDois.getMao() == JoKenPo.PAPEL)
                Assert.assertEquals(true, jogadorDois.isCampeao());

            if (jogadorDois.getMao() == JoKenPo.TESOURA) {
                Assert.assertEquals(true, jogadorUm.isCampeao());
            }
        } else if (jogadorUm.getMao() == JoKenPo.TESOURA) {
            if (jogadorDois.getMao() == JoKenPo.PEDRA)
                Assert.assertEquals(true, jogadorDois.isCampeao());

            else if (jogadorDois.getMao() == JoKenPo.PAPEL)
                Assert.assertEquals(true, jogadorUm.isCampeao());
        }
    }
}
