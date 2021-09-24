
//biblioteca de IO
import javax.swing.JOptionPane;

public class Operacao {
	
	//criação de um objeto que será usando no decorre do script
	Conta c;
	
	public Operacao() {
		
		//Contrutor da classe
		//recebe numeroConta e titular e armazena no objeto "C"
		
		String numeroConta = JOptionPane.showInputDialog("Digite o numero da conta com 5 digitos:");
		String titular = JOptionPane.showInputDialog("Digite o nome do titular da conta:");
		
		c = new Conta(numeroConta, titular);		
		
		menu();
		
	}
	
	//função chama menu de opções
	
	public void menu() {
		
		//recebe variável "op" usada no switch
		
		int op = Integer.parseInt(JOptionPane.showInputDialog("MENU\n"
				+ "Digite 1 para verificar saldo;\n"
				+ "Digite 2 para efetuar deposito;\n"
				+ "Digite 3 para efetuar saque;\n"
				+ "Digite 4 para sair."));
		
		//Switch gerador de eventos
		
		switch (op) {
		case 1: 
			
			JOptionPane.showMessageDialog(null, c.getSaldo());
			break;
			
		case 2:
			
			int vald = Integer.parseInt(JOptionPane.showInputDialog("Qual valor a ser depositado:"));
			if(c.deposito(vald)==true) {
				JOptionPane.showMessageDialog(null, "Valor depositado com sucesso");
			}
			
			break;
		case 3:
			
			int vals = Integer.parseInt(JOptionPane.showInputDialog("Qual valor a ser sacado:"));
			if(c.saque(vals)==true) {
				JOptionPane.showMessageDialog(null,"Saque realizado com sucesso");
			}else {
				JOptionPane.showMessageDialog(null, "Limite indisponivel");
			}
			break;
			
		case 4:
			
			System.exit(0);
		}
		
		menu();
				
	}

}
