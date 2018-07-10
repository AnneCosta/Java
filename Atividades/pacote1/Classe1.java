package pacote1;

public class Classe1 {
    protected String valor1;
    
    public Classe1(String valor1){
        this.valor1 = valor1;
    }
    
    public void metodo1(String valor1){
        System.out.println(this.valor1);
    }
    
    public static void main(String[] args){
        Classe1 objClasse1 = new Classe1("valor 1");
        objClasse1.metodo1("valor 2");
    }
}
