package ATV7;
import java.io.*;
import java.util.*;


public class ContaMain {
	public static void main(String [] args) throws NumberFormatException, IOException {
		int teclado;
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bem-vindo ao atendimento caixa!");
		System.out.println("Digite 1 para se cadastrar e criar uma conta");
		 
		teclado = Integer.parseInt(bfr.readLine());
		switch(teclado) {
		case 1:
			Cliente_teste cliente = new Cliente_teste();
			cliente.cadastrarCliente();
			System.out.println("Que tipo de conta deseja criar?");
			System.out.println("Conta especial digite 1");
			System.out.println("Conta poupança digite 2");
			int tecladoConta = Integer.parseInt(bfr.readLine());
			
			if(tecladoConta==1) {
				System.out.println("Por favor, digite o numero da sua conta:");
				int numConta = Integer.parseInt(bfr.readLine());
				System.out.println("Por favor, digite sua agencia:");
				String numAgencia = bfr.readLine();
				Conta_Especial ce = new Conta_Especial(cliente, numConta, numAgencia);
				System.out.println("Parabèns ao novo cliente " + ce.titular.getNome() +"de cpf: " + ce.titular.getCpf() + " pela sua nova conta especial");
				
			}
			if(tecladoConta ==2) {
				System.out.println("Por favor, digite o numero da sua conta popupanca:");
				int numConta = Integer.parseInt(bfr.readLine());
				System.out.println("Por favor, digite um valor inical de deposito:");
				double deposito = Integer.parseInt(bfr.readLine());
				Conta_Poupanca cp = new Conta_Poupanca(cliente, deposito, numConta);
				
				System.out.println("Parabèns ao novo cliente " + cp.titular.getNome() + "de cpf: " + cp.titular.getCpf() + " pela sua nova conta poupanca");
				
			}
			
			

			break;
		
		case 2:
		
			break;
		}
	}
}
