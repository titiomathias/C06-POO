public class Pessoa {
    String nome;
    int idade;
    Livro livro_emprestado;

    void emprestarLivro(Livro livro){
        System.out.println("Você pegou emprestado o livro: " + livro.titulo + " - " + livro.autor.nome);
        livro.emprestar();
        livro_emprestado = livro;
    }

    void devolverLivro(Livro livro){
        System.out.println("Você devolveu o livro livro: " + livro.titulo + " - " + livro.autor.nome);
        livro.devolver();
    }

    void listarLivroEmprestado(Livro livro){
        System.out.println("Livro emprestado:");
        livro.detalhes();
    }
}
