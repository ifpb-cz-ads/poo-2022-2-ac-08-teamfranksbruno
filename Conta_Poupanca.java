package ATV7;
import java.util.*;
import java.io.*;

public class Conta_Poupanca extends ContaGenerica {
private double deposito;

public Conta_Poupanca(Cliente_teste titular, double deposito, int numConta) {
	this.titular = titular;
}
public double getDeposito() {
	return deposito;
}
public void setDeposito(double deposito) {
	this.deposito = deposito;
}
public double reajuste() {
	double soma;
	soma = this.deposito;
	soma*=0.5;
	this.deposito +=soma;
	return this.deposito;
}

@Override
public void imprimirTipoConta() {
	System.out.println("Conta Poupanca");
	
}

@Override
public void metodoSacar(double cash) {
	if(cash <= deposito) {
		this.deposito-=cash;
		System.out.println("Você sacou " + this.deposito + "da conta poupanca");
		
	}else {
		System.out.println("Saldo insuficiente");
	}
}


}