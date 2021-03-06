package poo.exercicio01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.poo.exercicio01.Veiculo;

public class veiculoTest {

    private Veiculo veiculo;

    @Before
    public void setup() {
        veiculo = new Veiculo("Fiat", "Palio", "ABXT2370", "Amarelo", 2323, true, 3, 40, 37750.26);
    }

    @Test
    public void carroDeveAcelerarAoChamarEsteMetodo() throws Exception {
        Assert.assertEquals(veiculo.getVelocidade()+20, veiculo.acelerar());
    }


    @Test
    public void carroDeveFrearAoChamarEsteMetodo() throws Exception {
        Assert.assertEquals(veiculo.getVelocidade()-20, veiculo.frear());
    }


    @Test
    public void carroDeveAbastecerGasolinaAoChamarEsteMetodo() throws Exception {
        Assert.assertEquals(veiculo.getLitrosCombustivel()+20, veiculo.abastecer(20));
    }

    @Test
    public void carroDeveMudarDeCorAoChamarEsteMetodo() {
        Assert.assertEquals("Azul", veiculo.pintar("Azul"));
    }

    @Test
    public void carroDeveLigarAoChamarEsteMetodo_seEstiverDesligado() throws Exception {
        // Desligar o carro
        veiculo.setLigado(false);
        Assert.assertEquals(!veiculo.isLigado(), veiculo.ligar());
    }

    @Test
    public void carroNaoDeveLigarAoChamarEsteMetodo_seJaEstiverLigado() throws Exception {
        Assert.assertEquals(veiculo.isLigado(), veiculo.ligar());
    }

    @Test
    public void carroDeveDesligarAoChamarEsteMetodo_seEstiverParado() throws Exception {
        // Parar o carro
        veiculo.setVelocidade(0);
        Assert.assertEquals(veiculo.isLigado(), veiculo.desligar());
    }

    @Test
    public void carroNaoDeveDesligarAoChamarEsteMetodo_seEstiverEmMovimento() throws Exception {
        Assert.assertEquals(veiculo.isLigado(), veiculo.desligar());
    }

    @Test
    public void carroNaoDeveDesligarAoChamarEsteMetodo_seJaEstiverDesligado() throws Exception {
        // Desligar o carro
        veiculo.setLigado(false);
        Assert.assertEquals(!veiculo.isLigado(), veiculo.desligar());
    }
}
