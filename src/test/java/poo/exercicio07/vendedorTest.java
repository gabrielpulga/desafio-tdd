package poo.exercicio07;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.poo.exercicio07.Vendedor;

public class vendedorTest {
    private Vendedor vendedor;

    @Before
    public void setup() {
        vendedor = new Vendedor("Helio", 19, 3000);
    }

    @Test
    public void deveCalcularBonificacao() throws Exception {
        Assert.assertEquals(vendedor.getSalario()+3000, vendedor.bonificacao(), 0.0001);

    }
}
