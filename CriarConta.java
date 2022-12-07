import java.util.Scanner;
import java.util.ArrayList;

public class CriarConta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Conta> ListaContas = new ArrayList<Conta>();

        System.out.print("| Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("\n| Digite seu cpf: ");
        String cpf = sc.nextLine();

        Cliente c = new Cliente(nome, cpf);

        while(true) {

            int numeroConta = ListaContas.size();

            System.out.println("| Escolha um tipo de conta:");
            System.out.println("| 1 - Conta Especial");
            System.out.println("| 2 - Conta Poupança");
            System.out.println("| 3 - Exibir item");
            System.out.println("| 4 - Sair");

            int input = sc.nextInt();

            Conta con = new ContaPoupanca(numeroConta, c);
            
            switch(input) {
                case 1:
                con = new ContaEspecial(numeroConta, c);
                break;

                case 3:

                System.out.print("| Digite o numero do item: ");
                int input2 = sc.nextInt();

                System.out.println("| Nome: " + ListaContas.get(input2).getTitular().getNome());
                System.out.println("| Cpf: " + ListaContas.get(input2).getTitular().getCpf());
                System.out.println("| Numero: " + ListaContas.get(input2).getNumero());
                System.out.println("| Saldo: " + ListaContas.get(input2).getSaldo());
                break;

                case 4:
                sc.close();
                return;
            }
        
            ListaContas.add(con);
        }
    }
}
