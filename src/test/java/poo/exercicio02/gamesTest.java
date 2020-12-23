package poo.exercicio02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.poo.exercicio02.VideoGame;

public class gamesTest {

    private VideoGame videoGameUsado;
    private VideoGame videoGameNovo;

    @Before
    public void setup() {
        videoGameNovo = new VideoGame("nome", 42.00, 24, "marca", "modelo", false);
        videoGameUsado = new VideoGame("nome", 42.00, 24, "marca", "modelo", true);
    }

    @Test
    public void deveCalcularOImposto_seUsado() throws Exception {
        Assert.assertEquals(0.25*42, videoGameUsado.calculaImposto(), 0.0001);
    }

    @Test
    public void deveCalcularOImposto_seNovo() throws Exception {
        Assert.assertEquals(0.40*42, videoGameNovo.calculaImposto(), 0.0001);
    }
}
