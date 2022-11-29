// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class Desafio_SaoIguais {

    public static void main(String[] args) {

        //TODO: Imprima se os valores numéricos passados são iguais ou não.
        Scanner leitor = new Scanner(System.in);
        
        int A;
        A = leitor.nextInt();
        
        int B;
        B = leitor.nextInt();
        
        
        if (A == B) 
        System.out.println("Sao iguais!");
          
        else  
        System.out.println("Nao sao iguais!");
        
        

    }
}