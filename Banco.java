// arquivo Conta.java

public class Conta {
    private int conta;
    private String agencia;
    private String titular;
    private String senha;
    private double saldo;
    
    public Conta(int conta, String agencia, String titular, String senha, double saldo){
        this.conta = conta;
        this.agencia = agencia;
        this.titular = titular;
        this.senha = senha;
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getTitular() {
        return titular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public String sacar(double saque){
        if(this.saldo>=saque){
            saldo -= saque;
            return "Saque efetuado com sucesso! Seu saldo atual é"+this.saldo;
        }
        else{
            return "Saldo indisponível.";
        }
    }
    public String depositar(double deposito){
        if(deposito>0){
            saldo += deposito;
            return "Deposito efetuado com sucesso! Seu novo saldo é: "+this.saldo;
        }
        else{
            return "Valor incorreto";
        }
    }
    public String transferir(double transferencia){
        if(transferencia<=this.saldo && transferencia > 0){
            this.saldo -= transferencia;
            return "Movimentação realizada com sucesso! Seu novo saldo é: "+this.saldo;
        }
        else{
            return "Saldo indisponível.";
        }
    }
}

// arquivo ContaCorrente.java

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
