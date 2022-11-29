/* IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  
*/
import java.util.Scanner;
public class Desafio_Multiplos {

/*e se criar um array com os multiplos ate o "N" e depois
multiplicar pelo valor inicial "A"
*/
    public static void main(String[] args) {
        int A, N;
        int valorfinal = 0;

        Scanner leitor = new Scanner(System.in);
        A = leitor.nextInt();
        N = leitor.nextInt();

        for(int i = A; i <=N; i = i + A){
            valorfinal = valorfinal + i;
        }

        System.out.println(valorfinal);
        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
    }
}

