import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class informi {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Lenovo\\Desktop\\matriz.csv");
        try {

            String linhas = new String();
            
            Scanner leitor = new Scanner(file);

            int l;
            int c;

            int m[][] = new int[4][7];
            for (l=0; l<4; l++){
                for(c=0; c<7; c++){
                    
                }
            }

            while (leitor.hasNext()){

                linhas = leitor.nextLine();

                System.out.println(linhas);


            }
        } catch (FileNotFoundException e) {
            // TODO: handle exception
        }


    }   
    
}