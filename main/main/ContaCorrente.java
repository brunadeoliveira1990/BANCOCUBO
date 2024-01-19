package main;

public class ContaCorrente  extends  Conta{


    public ContaCorrente(String nome, String cpf) {   //CONSTRUTOR DA CLASSE CONTA CORRENTE
        super(nome, cpf);               // CHAMA O CONSTRUTOR DA CLASSE PAI (CONTA)
    }

    
    public void depositarCorrente (double valor) {
    	valor += valor;
    }
    
    
    public void sacarCorrente (double valor){   // METODO SACAR DA CONTA CORRENTE
        valor += (valor * 0.10);       // PEGA O VALOR E ACRENCENTA 10% DE JUROS

         super.sacar(valor); 
        
    }
}
