package src.exercicio02;

import java.util.List;

public class Loja {
    private static String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public Object listaLivros() {
        if (livros.isEmpty()) {
            System.out.println("A loja não tem livros no seu estoque.");
            return 0;
        } else {
            System.out.println("\nA loja " + Loja.getNome() + " possui estes livros para a venda : ");
            for (Livro livro : livros) {
                System.out.println("Titulo : " + livro.getNome() + " , Preco : " + livro.getPreco() + " , Quantidade : " + livro.getQtd() + " em estoque.");
            }
            return livros;
        }
    }

    public Object listaVideoGames() {
        if (videoGames.isEmpty()) {
            System.out.println("A loja não tem video-games no seu estoque.");
            return 0;
        } else {
            System.out.println("\nA loja " + Loja.getNome() + " possui estes video-games para venda : ");
            for (VideoGame videoGame : videoGames) {
                System.out.println("Titulo : " + videoGame.getNome() + " , Preco : " + videoGame.getPreco() + " , Quantidade : " + videoGame.getQtd() + " em estoque.");
            }
            return videoGames;
        }
    }

    public double calculaPatrimonio() {
        double valorTotalEmVideoGames = 0;

        for (VideoGame videoGame : videoGames) {
            valorTotalEmVideoGames = valorTotalEmVideoGames + (videoGame.getPreco() * videoGame.getQtd());
        }

        double valorTotalEmLivros = 0;
        for (Livro livro : livros) {
            valorTotalEmLivros = valorTotalEmLivros + (livro.getPreco() * livro.getQtd());
        }

        double valorTotal = valorTotalEmVideoGames + valorTotalEmLivros;

        System.out.println("O patrimonio da loja " + Loja.getNome() + " é de R$" +  valorTotal);

        return valorTotal;
    }
}