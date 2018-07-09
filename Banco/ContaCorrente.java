public class ContaCorrente extends Conta {
    
    private int numeroSaqueMensal;
    private int numeroExtratosMensal;
    private double limite;
    
    public ContaCorrente(int conta, String agencia, String titular, String senha, double saldo) {
        super(conta, agencia, titular, senha, saldo);
    }
    public void debitoCesta(double valorDebito){
        if(valorDebito<getSaldo()){
            setSaldo(getSaldo() - valorDebito);
        }
        else{
            System.out.println("Saldo indisponível");
        }
    }
    public String sacar(double saque){
        double saldoTotal = this.limite+getSaldo();
        if(saldoTotal>saque){
            double limiteAnterior;
            double restante = saque - getSaldo();
            if(restante<0){
                setSaldo(0);
                limiteAnterior = this.limite - restante;
                this.limite -= restante;
                return "Saque efetuado com sucesso. Seu saldo é: "+getSaldo()+""+
                        "Seu limite é: "+this.limite+"! Houve uma movimentação de "+(limiteAnterior-limite);
            }
            else{
                setSaldo(getSaldo()-saque);
                return "Saque efetuado com sucesso. Seu saldo é: "+getSaldo()+""+
                        "Seu limite é: "+this.limite;
            }

        }
    }
    
}
