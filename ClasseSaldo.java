package DadosSaldo;

public class ClasseSaldo {

	private int numero;
	private String titular;
	private double saldo;

	public ClasseSaldo(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public ClasseSaldo(int numero, String titular, double inicialDeposito) {
		this.numero = numero;
		this.titular = titular;
		deposito (inicialDeposito);
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito (double quantidade) {
      saldo += quantidade;
	}

public void saque (double quantidade) {
	saldo -= quantidade + 5.0;
}
 public String toString () {
	 return "Conta: "
			 + numero 
			 + ", Titular: "
			 + titular 
			 + ", Saldo: $ "
			 +String.format("%.2f", saldo);
 }





}