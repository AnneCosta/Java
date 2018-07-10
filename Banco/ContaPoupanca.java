public class ContaPoupanca extends Conta{
    final double taxaRendimento = 2.00000000005;
    
    public ContaPoupanca(int conta, String agencia, String titular, String senha, double saldo) {
        super(conta, agencia, titular, senha, saldo);
    }
    public String rendimento(){
        setSaldo(getSaldo()*this.taxaRendimento);
        return "Crédito atrubuido a conta! Seu novo saldo é: "+getSaldo();
    }
    
    @Override
    public boolean login(){
        return false;
    }
    
}
