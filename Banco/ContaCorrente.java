public class ContaCorrente extends Conta {
    
    private int numeroSaqueMensal;
    private int numeroExtratoMensal;
    private double limite;
    final private double limiteInicial;
    
    public ContaCorrente(int conta, String agencia, String titular, String senha, double saldo, int numeroSaqueMensal, int numeroExtratoMensal, double limite) {
        super(conta, agencia, titular, senha, saldo);
        this.numeroSaqueMensal = numeroSaqueMensal;
        this.numeroExtratoMensal = numeroExtratoMensal;
        this.limite = limite;
        this.limiteInicial = limite;
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
        if(saldoTotal>=saque){
            double limiteAnterior;
            double restante = getSaldo() - saque;
            if(restante<0){
                setSaldo(0);
                limiteAnterior = this.limite - restante;
                this.limite += restante;
                return "Saque efetuado com sucesso. Seu saldo é: "+getSaldo()+""+
                        ". Seu limite é: "+this.limite+"! Houve uma movimentação de "+(limiteAnterior-limite);
            }
            else{
                setSaldo(getSaldo()-saque);
                return "Saque efetuado com sucesso. Seu saldo é: "+getSaldo()+""+
                        ". Seu limite é: "+this.limite;
            }

        }else{
            return "Saldo indisponível";
        }
        
    }
    
    public String depositar(double deposito){
        if(limiteInicial > limite){
            double restante = this.limiteInicial - this.limite;
            if(deposito > restante){
                this.limite = limiteInicial;
                setSaldo(deposito-restante);
                return "Deposito efetuado com sucesso! Seu novo saldo é: "+getSaldo()+""
                    + ". Seu limite é: "+this.limite;
            }
            else{
                this.limite += deposito;
                return "Deposito efetuado com sucesso! Seu novo saldo é: "+getSaldo()+""
                    + ". Seu limite é: "+this.limite;
            }
        }
        else{
            setSaldo(getSaldo()+deposito);
            return "Deposito efetuado com sucesso! Seu novo saldo é: "+getSaldo()+""
                    + ". Seu limite é: "+this.limite;
        }
    }

    
    @Override
    public boolean login(){
        return false;
    }
}
