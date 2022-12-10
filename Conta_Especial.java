package ATV7;
import java.util.*;
import java.io.*;

public class Conta_Especial extends ContaGenerica {
private double limite = 1000;

public Conta_Especial(Cliente_teste titular, int numConta, String agencia) {
	this.titular = titular;
	this.numConta = numConta;
	this.agencia = agencia;
}

BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

@Override
public void imprimirTipoConta() {
	System.out.println("Conta especial");
	
}
@Override
public void metodoSacar(double cash){
	if(cash < limite && cash <= saldo) {
		this.saldo -=cash;
		System.out.println("Você sacou " + this.saldo + "da conta especial");
		
	}else {
		System.out.println("Valor a cima do limite permitido por dia. Por favor, solicite um saque a baixo de 1000 R$");
	}
}



}
