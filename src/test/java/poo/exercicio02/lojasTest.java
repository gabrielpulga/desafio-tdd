package poo.exercicio02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.poo.exercicio02.Livro;
import src.poo.exercicio02.Loja;
import src.poo.exercicio02.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class lojasTest {

    private Livro l1;
    private Livro l2;
    private Livro l3;

    private VideoGame ps4;
    private VideoGame ps4Usado;
    private VideoGame xbox;

    private Loja americanas;

    private List<Livro> livros;
    private List<VideoGame> games;

    @Before
    public void setup() {
        l1 = new Livro("Harry Potter", 40, 50, "J.K. Rowling", "fantasia", 300);
        l2 = new Livro("Senhor dos Aneis", 60, 30, "J.R.R. Tolkien", "fantasia", 500);
        l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);

        ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
        ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
        xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);

        livros = new ArrayList<>();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);

        games = new ArrayList<>();
        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);

        americanas = new Loja("Americanas", "12345678", livros, games);
    }

    @Test
    public void deveListarLivros() throws Exception {
        Assert.assertEquals(livros, americanas.listaLivros());
    }

    @Test
    public void deveListarVideoGames() throws Exception {
        Assert.assertEquals(games, americanas.listaVideoGames());
    }

    @Test
    public void deveCalcularOPatrimonio() throws Exception {
        Assert.assertEquals(941800.0, americanas.calculaPatrimonio(), 0.0001);
    }
}
