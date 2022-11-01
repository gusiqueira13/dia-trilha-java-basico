import java.util.Random;

/*Faça um programa que leia 20 numeros inteiros aleatorios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os numeros e seus sucessores.
 */
public class ex3_NumerosAleatorios {
    
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int [20];

        
        for( int i = 0; i < numerosAleatorios.length; i++ ){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("\nNumeros Aleatorios: ");
        for( int numero : numerosAleatorios ){
            System.out.println(numero + " ");
        }

        System.out.println("\nSucessores dos Numeros Aleatorios: ");
        for( int numero : numerosAleatorios ){
            System.out.println((numero+1) + " ");
        }

        System.out.println("\nAntecessores dos Numeros Aleatorios: ");
        for( int numero : numerosAleatorios ){
            System.out.println((numero-1) + " ");
        }
       
    }
}
