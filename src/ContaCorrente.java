
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		System.out.println("*** Extrato Conta Corrente ***");
		System.out.println("Titular: " + super.cliente.toString());
		System.out.println("Agência: " + super.agencia);
		System.out.println("Conta: " + super.numero);
		System.out.println("Saldo: " + super.saldo);
		
	}
	
	
}
