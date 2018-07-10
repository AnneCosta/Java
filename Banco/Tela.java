public class Tela {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(100, "Caixa", "Anne", "28795", 3580.0, 200, 200, 9500.0);
        System.out.println(conta1.depositar(50.00));
        System.out.println(conta1.transferir(40.0));
        System.out.println(conta1.sacar(101));
        System.out.println("-----------------------------------------------");
        ContaPoupanca conta2 = new ContaPoupanca(100, "Caixa", "Anne", "28795", 10.0);
        System.out.println(conta2.depositar(340.0));
        System.out.println(conta2.rendimento());
    }
}
