import java.util.Scanner;

/*
 * Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo representando a sua idade
 */
public class ex2_Nota {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
    
        System.out.println("Nota: " );
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota invalida! Digite novamente:  " );
            nota = scan.nextInt();



        }



    }
}

