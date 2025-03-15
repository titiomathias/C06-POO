import java.util.Random;
import java.util.Scanner;

public class Campo {
    int size;
    int[][] campo ;

    void criarCampo(){
        campo = new int[size][size];
        Random rand = new Random();
        int bomba_x = rand.nextInt(size);
        int bomba_y = rand.nextInt(size);

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                campo[i][j] = 0;
            }
        }

        campo[bomba_x][bomba_y] = -1;
    }

    void jogar(){
        int x, y;
        int n = (size*size)-1;
        Scanner sc = new Scanner(System.in);

        while(true){

            if(n == 0){
                System.out.println("-= Parabéns! Você ganhou! =-");
                break;
            }

            System.out.print("Coordenada 1: ");
            x = sc.nextInt();
            System.out.print("Coordenada 2: ");
            y = sc.nextInt();

            if(campo[x][y] == -1){
                System.out.println("Você pisou em uma bomba! Fim de jogo.");
                break;
            } else if (campo[x][y] == 1){
                System.out.println("Você já esteve aqui! Tente outra coordenada!");
            } else {
                System.out.println("Não há nada aqui! Você está indo bem.");
                campo[x][y] = 1;
                n-=1;
            }
        }
    }
}
