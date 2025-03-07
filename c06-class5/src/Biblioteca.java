public class Biblioteca {
    String nome;
    String endereco;
    Livro livro_biblioteca;

    void adicionarLivro(Livro livro){
        System.out.println("O livro '" + livro.titulo + "' foi adicionado na biblioteca.");
        livro_biblioteca = livro;
    }

    void removerLivro(Livro livro){
        System.out.println("O livro '" + livro.titulo + "' foi adicionado na biblioteca.");
    }

    void listarLivro(){
        System.out.println("Livro emprestado:");
        System.out.println("Nome: " + livro_biblioteca.titulo);
        System.out.println("Autor: " + livro_biblioteca.autor.nome);
        System.out.println("Nacionalidade: " + livro_biblioteca.autor.nacionalidade);
    }
}
