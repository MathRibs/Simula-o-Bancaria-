package DadosSaldo;

import java.util.Locale;
import java.util.Scanner;

public class saldosAtualizados {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		ClasseSaldo saldo;

		System.out.println("Entre com o numero da conta: ");
		int numero = leitor.nextInt();
		System.out.println("Nome do titular: ");
		leitor.nextLine();
		String titular = leitor.nextLine();
		System.out.println("Tem deposito inicial (s/n) ? ");
		char resposta = leitor.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Coloque o valor do deposito inicial: ");
			double inicialDeposito = leitor.nextDouble();
			saldo = new ClasseSaldo(numero, titular, inicialDeposito);
		}
		else {
			saldo = new ClasseSaldo(numero, titular);

		}
		System.out.println();
		System.out.println("Dados da conta ");
		System.out.println(saldo);
	
		System.out.println();
        System.out.println("Informe o valor do deposito");
		 double valorDeposito = leitor.nextDouble();
		 saldo.deposito(valorDeposito);
		 System.out.println("Dados da conta atualizados");
        System.out.println(saldo); 
        
        System.out.println();
        System.out.println("Informe o valor do saque");
		 double withDraw = leitor.nextDouble();
		 saldo.saque(withDraw);
		 System.out.println("Dados da conta atualizados");
        System.out.println(saldo);
		 
		 
		 
		 
		 
		 leitor.close();

	}
}