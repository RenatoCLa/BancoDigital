package bancodigital;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta c;
        Conta c1 = new ContaCorrente(new Cliente("Mãe", "123456789-12"));

        System.out.println("Banco de Guanambi");
        System.out.println("Criação de Conta");
        System.out.print("Digite o seu nome:");

        String nome = sc.nextLine();
        System.out.println("Digite o seu CPF:");

        String CPF = sc.nextLine();
        Cliente cliente = new Cliente(nome, CPF);
        
        System.out.println("Digite 1 para criar uma conta corrente ou");
        System.out.println("Digite 2 para criar uma conta poupanca");
        System.out.print(": ");

        switch(sc.nextInt()){
            case 1:
                c = new ContaCorrente(cliente);
                break;
            case 2:
                c = new ContaPoupanca(cliente);
        }

        int x = 0;
        do{
            System.out.println("Selecione uma operação");
            System.out.println("1-Depositar \n 2-Sacar \n 3-Transferir");

        }while(x == 6);

        System.out.println("O que ");
        sc.close();
    }
}
