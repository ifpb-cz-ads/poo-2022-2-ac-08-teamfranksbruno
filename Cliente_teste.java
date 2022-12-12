package ATV7;
import java.util.*;
import java.io.*;

public class Cliente_teste {
private String nome;
private String cpf;

BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public void cadastrarCliente() throws IOException {
	System.out.println("Por favor, digite seu nome:");
	String nome = bfr.readLine();
	System.out.println("Por favor, digite seu cpf:");
	String cpf = bfr.readLine();
	
	setNome(nome);
	setCpf(cpf);
}

}
