public class Autor {
    String nome;
    String nacionalidade;

    Livro escreverLivro(String titulo){
        Livro livro = new Livro();
        Autor autor = new Autor();
        autor.nome = nome;
        autor.nacionalidade = nacionalidade;

        livro.titulo = titulo;
        livro.autor = autor;

        return livro;
    }

    String obterBiografia(){
        return "Nome: " + nome + "\nNacionalidade: "+nacionalidade;
    }
}
