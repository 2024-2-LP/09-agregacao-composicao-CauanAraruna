package school.sptech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nome;
    private List<Livro> livros = new ArrayList<>();


    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nome='" + nome + '\'' +
                ", livros=" + livros +
                '}';
    }

    public Biblioteca(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro) {
        if (livro != null) {
            if (livro.getTitulo() != null && !livro.getTitulo().isBlank()) {
                if (livro.getAutor() != null && !livro.getAutor().isBlank()) {
                    if (livro.getDataPublicacao() != null) {
                        livros.add(livro);
                    }
                }
            }
        }
    }

    public void removerLivroPorTitulo(String titulo) {

        for (int i = 0; i < livros.size(); i++) {
            if (titulo.equalsIgnoreCase(livros.get(i).getTitulo())) {
                livros.remove(i);
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            for (Livro livroDaVez : livros) {
                if (titulo.equalsIgnoreCase(livroDaVez.getTitulo())) {
                    return livroDaVez;
                }
            }
        }
        return null;
    }

    public Integer contarLivros() {
        Integer total = 0;

        for (Livro livroDaVez : livros) {
            total++;
        }

        return total;
    }

    public List<Livro> retornarTopCincoLivros(){

        List<Livro> cincoLivros = new ArrayList<>();

        if (livros.size() <= 5) {
            for (Livro livroDaVez : livros) {
                cincoLivros.add(livroDaVez);
                cincoLivros.sort();
            }
        }
    }

//    public List<Livro> obterLivrosAteAno(Integer ano) {
//
//        List<Livro> livroAnos = new ArrayList<>();
//
//        for (Livro livroDaVez : livros) {
//            if (livroDaVez.getDataPublicacao().getYear() <= ano) {
//                livroAnos.add(livroDaVez);
//            }
//        }
//
//        return livroAnos;
//
//    }

}
