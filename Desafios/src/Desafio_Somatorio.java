
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  
import java.util.Scanner;

public class Desafio_Somatorio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int Somatorio = 0;
        int N;
        N = leitor.nextInt();

        for(int i = N; 0 <= i; i-- ){
            Somatorio = Somatorio + i;

        }
        System.out.println(Somatorio);

         //TODO: Imprima o somatório de N (utilize o método "somatorio").
    }
}
