
public abstract class Conta implements IConta {

	protected static final int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}


	public double getSaldo() {
		return saldo;
	}

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;

	}

	public void depositar(double valor) {
		this.saldo += valor;

	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
}
