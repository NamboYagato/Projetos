package classes;

import java.util.Random;

public class CartaoSorteio extends Cartao {

    public CartaoSorteio() {
        super(6);
        sorteiaNumeros();

    }

    private void sorteiaNumeros() {
        Random sorte = new Random();

        int i = 1;

        while (i <= numeros.length) {
            if (addNumeros(sorte.nextInt(10) + 1) == 1) {
                i++;
            }
        }
//        for (int i = 1; i <= numeros.length; ){
//           
//            if(addNumeros(sorte.nextInt(50)) == 1){
//               i++;
//           }
//        }
    }

}
