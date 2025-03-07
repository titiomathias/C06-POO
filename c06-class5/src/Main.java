import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        Livro new_livro = new Livro();
        Autor autor_new_livro = new Autor();
        Pessoa leitor = new Pessoa();
        int subopt;

        leitor.nome = "Matheus";
        leitor.idade = 18;

        biblioteca.nome = "SANTO DOMINGO";
        biblioteca.endereco = "Rua dos Bobos, Bairro Escondido, n 0 - Santa Rita do Sapucaí";

        while(true){
            System.out.println("\n[!] SISTEMA DE GERÊNCIA DA BIBLIOTECA MUNICIPAL - " + biblioteca.nome +" [!]\n");

            System.out.println("[1] Gerenciamento de Livros");
            System.out.println("[2] Gerenciamento de Autores");
            System.out.println("[3] Gerenciamento de Leitores");

            System.out.print("Escolha uma opção: ");
            int opt = scanner.nextInt();

            switch (opt) {

                case 1:
                    System.out.println("\n[!] Gerenciamento de Livros [!]\n");
                    System.out.println("[1] Adicionar livro");
                    System.out.println("[2] Remover livro");
                    System.out.println("[3] Listar livros");
                    System.out.println("[4] Sair");

                    System.out.print("Escolha uma opção: ");
                    subopt = scanner.nextInt();
                    scanner.nextLine();

                    switch (subopt){
                        case 1:
                            System.out.print("Digite o título do livro: ");
                            new_livro.titulo = scanner.nextLine();

                            System.out.print("\nDigite o nome do autor do livro: ");
                            autor_new_livro.nome = scanner.nextLine();

                            System.out.print("\nDigite a nacionalidade do autor do livro: ");
                            autor_new_livro.nacionalidade = scanner.nextLine();

                            new_livro.autor = autor_new_livro;

                            biblioteca.adicionarLivro(new_livro);
                        break;
                        case 2:
                            biblioteca.removerLivro(new_livro);
                        break;
                        case 3:
                            biblioteca.listarLivro();
                        break;
                    }

                    break;
                case 2:
                    System.out.println("[!] Gerenciamento de Autores [!]");
                    System.out.println("[1] Escrever livro");
                    System.out.println("[2] Obter biografia");
                    System.out.println("[3] Sair");

                    System.out.print("Escolha uma opção: ");
                    subopt = scanner.nextInt();
                    scanner.nextLine();

                    switch (subopt){
                        case 1:
                            String novo_titulo;

                            System.out.print("Digite o título do livro: ");
                            novo_titulo = scanner.nextLine();

                            autor_new_livro.escreverLivro(novo_titulo);
                            break;
                        case 2:
                            System.out.println(autor_new_livro.obterBiografia());
                            break;
                        case 3:
                            System.out.println("Saindo...");
                            break;
                    }

                    break;
                case 3:
                    System.out.println("[!] Gerenciamento de Leitores [!]");
                    System.out.println("[1] Emprestar livro");
                    System.out.println("[2] Devolver livro");
                    System.out.println("[3] Listar livros emprestados");
                    System.out.println("[4] Sair");

                    System.out.print("Escolha uma opção: ");
                    subopt = scanner.nextInt();
                    scanner.nextLine();

                    switch (subopt){
                        case 1:
                            System.out.print("Digite o título do livro: ");
                            new_livro.titulo = scanner.nextLine();

                            System.out.print("\nDigite o nome do autor do livro: ");
                            autor_new_livro.nome = scanner.nextLine();

                            System.out.print("\nDigite a nacionalidade do autor do livro: ");
                            autor_new_livro.nacionalidade = scanner.nextLine();

                            new_livro.autor = autor_new_livro;

                            leitor.emprestarLivro(new_livro);
                            break;
                        case 2:
                            leitor.devolverLivro(new_livro);
                            break;
                        case 3:
                            leitor.listarLivroEmprestado(new_livro);
                        case 4:
                            System.out.println("Saindo...");
                            break;
                    }

                    break;
                case 4:
                    System.out.println("Desligando Sistema.");
                    break;
                default:
                    System.out.println("Escolha uma das opções acima!");
                    break;
            }

            if(opt == 4){
                break;
            }
        }
    }
}