
public class Main {
    public static void main(String[] args) {
        Cliente evelin = new Cliente();
        evelin.setNome("Evelin");
        
        Conta cc = new ContaCorrente(evelin);
        cc.depositar(200);
        Conta cp = new ContaPoupanca(evelin);
        cc.transferir(30, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
    
}
