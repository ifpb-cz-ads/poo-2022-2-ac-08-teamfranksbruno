package ATV7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class ContaGenerica {

protected int numConta;
protected String agencia;
protected Cliente_teste titular;
protected double saldo;

BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

public void setNumConta(int numConta) {
	this.numConta = numConta;

}
public int getNumConta() {
	return numConta;
}

public void setAgencia(String agencia) {
	this.agencia = agencia;
	
}
public String getAgencia() {
	return agencia;
}

public void setSaldo(double saldo) {
	this.saldo=saldo;
}
public double getSaldo() {
	return saldo;
}
public void imprimirTipoConta() {
	System.out.println("Conta generica  Abstrata");
}
public void metodoSacar(double num) {
	saldo -= num;
}
public Cliente_teste getTitular() {
	return titular;
}
public void setTitular(Cliente_teste titular) {
	this.titular = titular;
}


}
