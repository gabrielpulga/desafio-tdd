package poo.exercicio07;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.poo.exercicio07.Supervisor;

public class supervisorTest {
    private Supervisor supervisor;

    @Before
    public void setup() {
        supervisor = new Supervisor("Ana", 24, 4500);
    }

    @Test
    public void deveCalcularBonificacao() throws Exception {
        Assert.assertEquals(supervisor.getSalario()+5000, supervisor.bonificacao(), 0.0001);

    }
}
