import java.util.Scanner;

public class ex1_NomeIdade {
/*
 * Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo representando a sua idade
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){

        
        System.out.println("Nome: " );
        nome = scan.next();
        if (nome.equals("0")) break;

        System.out.println("Idade: " );
        idade = scan.nextInt();
        }

        System.out.println("continua aqui... " );


    }
}
