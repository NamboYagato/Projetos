package classes;

public class CartaoAposta extends Cartao {

    private static int numeroAposta;

    public CartaoAposta(int qtdeNumeros) {
        super(qtdeNumeros);
        setNumeroAposta();
    }

    

    public float calculaAposta() {
        int qtdeNumeros = getTotNumeros();
        
        float aposta = 0;
        
        if(qtdeNumeros == 6){
            aposta = 4.5f;
        }else if(qtdeNumeros == 7){
            aposta = 31.5f;
        }else if(qtdeNumeros == 8){
            aposta = 126;
        }else if(qtdeNumeros == 9){
            aposta = 378;
        }else{
            aposta = 945;
        }
        return aposta;
    }

    public static int getNumeroAposta() {
        return numeroAposta;
    }
    
    private static void setNumeroAposta() {
        numeroAposta++;
    }
    
    public Cartao acertos(CartaoSorteio sorteio){
        Cartao acertos = new Cartao(totNumeros);
        
        for(int i = 0; i < totNumeros; i++){
            if(sorteio.existe(numeros[i])){
                acertos.addNumeros(numeros[i]);
            }
        }
        return acertos;
    }

    
    
}
