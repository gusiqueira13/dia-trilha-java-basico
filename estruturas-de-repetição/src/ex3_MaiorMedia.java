import java.util.Scanner;

/*
 * Faça um programa que leia 5 numeros
 * e informe o maior numero
 * e a media desses numeros
 */
public class ex3_MaiorMedia {
 
    public static void main(String[] args) { // se digitar "psvm" aparece o public static void main
        Scanner scan = new Scanner(System.in);
        

        int numero;
        int maior = 0;
        int soma = 0;
    
        System.out.println("Numero: " );
        numero = scan.nextInt();


        int count = 0;
        do{
            System.out.println("Numero: " );
            numero = scan.nextInt();

            soma = soma + numero;


            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 4);  

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/5));

    }
}


