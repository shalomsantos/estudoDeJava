
public class Conta {

	//cria��o de vari�veis usadas
	String numeroConta, titular;
	//private para restringir a variavel "saldo" quando for realizar opera��o
	private int saldo;
	
	//contrutor da classse conta
	public Conta(String numeroConta, String titular) {
		
		this.numeroConta = numeroConta;
		this.titular = titular;
		saldo = 0;
		
	}
	
	//metodo deposito
	public boolean deposito(int valDeposito) {
		
		saldo = saldo+valDeposito;
		
		return true;
	}
	
	//metodo saque 
	public boolean saque(int valSaque) {
		
		if (saldo >= valSaque) {
			saldo = saldo - valSaque;
			return true;
		}else {
			return false;
		}
		
	}
	
	//metodo ver saldo
	public int getSaldo() {
		return saldo;
	}
	
	
}
