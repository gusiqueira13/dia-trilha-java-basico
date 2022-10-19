import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Operadores {
    

    public static void main(String[] args ) {
        int numero =  5;
        //x repeticao
        numero ++;
        //numero = numero +1
        System.out.println(numero);

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("a nossa condicao e verdadeira");
        }

        System.out.println("numeroUM é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUM é diferente a numeroDois?" + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUM é maior que numeroDois?" + simNao);

        //OPERADORES LOGICOS
        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && (7 > 4) ){
            System.out.println("as duas condicoes são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("fim");

    
    
    }

}