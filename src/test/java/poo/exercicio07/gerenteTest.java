package poo.exercicio07;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.poo.exercicio07.Gerente;

public class gerenteTest {

    private Gerente gerente;

    @Before
    public void setup() {
        gerente = new Gerente("Joao", 22, 6500);
    }

    @Test
    public void deveCalcularBonificacao() throws Exception {
        Assert.assertEquals(gerente.getSalario()+10000, gerente.bonificacao(), 0.0001);

    }
}
