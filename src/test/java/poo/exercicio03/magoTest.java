package poo.exercicio03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.poo.exercicio03.Mago;

public class magoTest {

    private Mago gandalf;

    @Before
    public void setup() {
        gandalf = new Mago("Gandalf", 100, 150, 300, 200, 75, 65);
    }

    @Test
    public void deveAtacar() throws Exception {
        Assert.assertEquals(true, gandalf.attack());

    }

    @Test
    public void deveUparDeLevel() throws Exception {
        Assert.assertEquals(1, gandalf.lvlUp());
    }

    @Test
    public void deveAprenderMagia() throws Exception {
        Assert.assertEquals(true, gandalf.aprenderMagia("Nevada congelante"));

    }

}
