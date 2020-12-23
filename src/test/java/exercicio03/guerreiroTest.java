package exercicio03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.exercicio03.Guerreiro;
import src.exercicio03.Mago;

public class guerreiroTest {

    private Guerreiro guerreiro;

    @Before
    public void setup() {
        guerreiro = new Guerreiro("Hercules", 200, 75, 285, 100, 200, 60);
    }

    @Test
    public void deveUparDeLevel() throws Exception {
        Assert.assertEquals(1, guerreiro.lvlUp());
    }

    @Test
    public void deveAtacar() throws Exception {
        Assert.assertEquals(true, guerreiro.attack());

    }

    @Test
    public void deveAprenderHabilidade() throws Exception {
        Assert.assertEquals(true, guerreiro.aprenderHabilidade("Chute esmagador de crânios"));
    }
}
