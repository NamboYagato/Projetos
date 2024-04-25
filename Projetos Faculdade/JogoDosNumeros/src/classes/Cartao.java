package classes;

import java.util.Random;

public class Cartao {

    protected int[] numeros;
    protected int totNumeros;

    public Cartao(int qtde) {
        numeros = new int[qtde];
        totNumeros = 0;
    }

    public int addNumeros(int numero) {
        if (totNumeros < numeros.length) {
            if (existe(numero)) {
                return 0;
            } else {
                numeros[totNumeros++] = numero;
                return 1;
            }
        } else {
            return 2;
        }
    }

    public boolean existe(int numeroProcurado) {
        for (int i = 0; i < totNumeros; i++) {
            if (numeros[i] == numeroProcurado) {
                return true;
            }
        }
        return false;
    }

    public String numerosCartao() {
//        StringBuilder dados = new StringBuilder("\n");
//        for (int i = 0; i < numeros.length; i++){
//            dados.append("\n");
//        }
//        return dados.toString();\

        StringBuilder saida = new StringBuilder();

        for (int i = 0; i < numeros.length; i++) {
            saida.append(numeros[i]).append(" ");

            
            
        }
        return saida.toString();
    }

    public int[] getNumeros() {
        return numeros;
    }

    public int getTotNumeros() {
        return totNumeros;
    }

}
