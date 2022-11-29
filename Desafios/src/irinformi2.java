import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class irinformi2 {
  
    /**
while((line = br.readLine()) != null)     */
    public static void main(String[] args) {

        String[][] dados = {{"EIXO", "EIXO_X", "EIXO_Y", "EIXO_Z"},{"1", "2", "3","4","5","6","7"},{"35","56","12","56","23","67","12"},{"23","56","56","23","12","66","23"},{"11","32","23","22","23","12","23"}};
        int idx_maior = buscar_maior(dados);
        System.out.println("Objetivo 1: " + dados[3][4]);

        int maior = 0;

        for (int i = 0; i < dados.length; i++) {
            if(dados[i] > dados[maior]){
                maior =i;
            }
        }
    }
}   
    


