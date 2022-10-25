public class comentarios {
    
    public static void main(String[] args) {
        // Ola, eu sou um comentario em uma única linha
       
        /* Ola,
         * Eu sou um comentario
         * que posso ser mais detalhado
         * quando necessário
         */

         /**
          * Estas duas estrelinhas acima
            são para identificar que você
            pretende elaborarum comentario
            a nivel de documentação.
             Que incrivel!!!
          */
    }
          public int somaMultiplica (int n, int x, String m) {
            int r = 0; //r é igual ao resultado
            if (m == "M"){ //M = multiplicado
                r = n * x;
            }else{
                // se não soma mesmo
                r = n + x;
            }
            return r;
            
          
        }
}
