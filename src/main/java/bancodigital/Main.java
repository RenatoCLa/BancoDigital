package bancodigital;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta c = null;
        Conta c1 = new ContaCorrente(new Cliente("Mãe", "123456789-12"));

        System.out.println("Banco de Guanambi");
        System.out.println("Criacao de Conta");
        System.out.print("Digite o seu nome:");

        String nome = sc.nextLine();
        System.out.print("Digite o seu CPF:");

        String CPF = sc.nextLine();
        Cliente cliente = new Cliente(nome, CPF);
        
        System.out.println("Digite 1 para criar uma conta corrente ou");
        System.out.print("Digite 2 para criar uma conta poupanca:");

        switch(sc.nextInt()){
            case 1:
                c = new ContaCorrente(cliente);
                break;
            case 2:
                c = new ContaPoupanca(cliente);
        }

        for(int i = 0; i != 6;){
            System.out.println();
            System.out.println("Selecione uma operação");
            System.out.println("1-Depositar \n2-Sacar \n3-Transferir \n4-Extrato \n5-Extrato MÃE \n6-Fechar");
            int y = sc.nextInt();
            i = y;
            switch(y){
                case 1:
                    System.out.print("Digite o valor do deposito:");
                    c.depositar(sc.nextDouble());
                    System.out.println("Saldo: R$" + c.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor do saque:");
                    Double saqueV = sc.nextDouble();
                    if(saqueV > c.getSaldo()){

                        System.out.println("Saldo insuficiente!" + "\n Saldo atual: " 
                        + c.getSaldo() + "\n Valor do saque: " + saqueV);
                    }else{

                        Double temp1 = c.getSaldo();
                        c.sacar(saqueV);
                        System.out.println("Saldo Antigo: R$" + temp1 + "\n Saldo Atual: R$" 
                        + c.getSaldo());
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor da transferência para " + c1.getNome());
                    c.transferir(sc.nextDouble(), c1);
                    System.out.println("Transação concluida!");
                    break;
                case 4:
                    c.imprimirExtrato();
                    break;
                case 5:
                    c1.imprimirExtrato();
                    break;
            }
        
        }
        sc.close();
    }
}