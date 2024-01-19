package main;

public class ContaPoupanca extends Conta {
	
	public Double valorPoupanca;

    public ContaPoupanca(String nome, String cpf) {  //CONSTRUTOR DA CLASSE CONTAPOUPANÇA
        super(nome, cpf);                       /// CHAMA O CONSTRUTOR DA CLASSE PAI (CONTA)
    }
    
    public void ContaPoupancaValor (double valor) {
    	valorPoupanca = valor;
    }
    
    public void depositarPoupanca (double valor) {
    	valor += valor;
    	rendimento(valor);
    }

    public void sacarPoupanca (double valor){  // METODO SACAR DA CONTA CORRENTE
    	
        valor += (valor * 0.05);  // PEGA O VALOR E ACRENCENTA 05% DE JUROS

        super.sacar(valor);    // CHAMA O METODO SACAR DA CONTA MULTIPLICANDO COM OS 05%
        
        
     // MOSTRANDO O JUROS
    }
    
    public void rendimento (double valor) {
    	valor = valor * 0.2;
    }
}