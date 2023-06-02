package bancodigital;

public class Main {
    
    public static void main(String[] args) {

        Cliente renato = new Cliente();
        renato.setNome("Renato");
        
        Conta cc = new ContaCorrente(renato);
        Conta poupanca = new ContaPoupanca(renato);
        
        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
