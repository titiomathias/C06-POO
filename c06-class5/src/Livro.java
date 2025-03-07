public class Livro {
    String titulo;
    Autor autor;
    Biblioteca biblioteca;

    public Livro(){
        biblioteca = new Biblioteca();
    }

    String detalhes(){
        return "Título: " + titulo + "\nAutor: " + autor.nome;
    }

    void emprestar(){
        System.out.println("O livro foi emprestado para um leitor.");
    }

    void devolver(){
        System.out.println("O livro foi devolvido para a biblioteca.");
    }
}
