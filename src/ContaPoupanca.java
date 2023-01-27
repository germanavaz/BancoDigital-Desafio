
public class ContaPoupanca extends Conta {
	
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("*** Extrato Conta Poupança ***");
		System.out.println("Titular: " + super.cliente);
		System.out.println("Agência: " + super.agencia);
		System.out.println("Conta: " + super.numero);
		System.out.println("Saldo: " + super.saldo);
		
	}
}
