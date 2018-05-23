
public class regex {
    public static void main(String[] args) {
       /*
        * Metacaracteres
        * . qualquer caractere
        * \d dígitos            [0-9]
        * \D não é dígito       [^0-9]
        * \s espaços            [ \t\n\x0B\f\r]
        * \w letra              [a-zA-Z_0-9]
        * \W não é letra
        * (?i) ignora maiúsculo e minúsculo
        */
        System.out.println("computação".matches("(?i)Computação"));
        System.out.println("@".matches("."));
        System.out.println("4".matches("\\d"));
        System.out.println("a".matches("\\D"));
        System.out.println("\t".matches("\\s"));
        System.out.println("h".matches("\\w"));
        System.out.println("@".matches("\\W"));
        
       /*
        * Quantificadores
        * X{n}    X, exatamente n vezes
        * X{n,}   X, pelo menos n vezes e sem limite de tamanho máximo
        * X{n,m}  X, pelo menos n vezes e no máximo m vezes
        * X?      X, 0 ou 1 vez
        * X*      X, 0 ou + vezes
        * X+      X, 1 ou + vezes
        */
    }

}
