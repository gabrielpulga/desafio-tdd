package exercicio02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.exercicio02.Livro;

public class livrosTest {

    private Livro livroEducativo;
    private Livro livroNovo;

    @Before
    public void setup() {
        livroNovo = new Livro("nome", 42.00, 42, "autor", "tema", 400);
        livroEducativo = new Livro("nome", 42.00, 42, "autor", "educativo", 400);
    }

    @Test
    public void deveCalcularOImposto_seEducativo() {
        Assert.assertEquals(0, livroEducativo.calculaImposto(), 0.0001);
    }

    @Test
    public void deveCalcularOImposto_seNovo() {
        Assert.assertEquals(0.1*42, livroNovo.calculaImposto(), 0.0001);
    }
}
