
public class Main {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Germana");
		
		Conta cc = new ContaCorrente(cliente1);
		cc.depositar(150);
		cc.imprimirExtrato();
		
		Conta poupanca = new ContaPoupanca(cliente1);
		cc.transferir(47, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
