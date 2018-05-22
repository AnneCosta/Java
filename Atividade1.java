import javax.swing.JOptionPane;

public class op1 {

    public static void main(String[] args) {
        // a
        String texto = JOptionPane.showInputDialog("Informe a mensagem");
        int tam = texto.length();
        // b
        String text_1 = texto.toUpperCase();
        // c
        int contVogais = 0;
        String text_2 = texto.toLowerCase();
        for(int i=0; i < tam; i++){
            char c = text_2.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'á' || c == 'ã' || c == 'é' || c == 'ê' || c == 'í' || c == 'õ' || c == 'ó' || c == 'ú'){
                contVogais++;
            }
        }
     
        System.out.println("Número de caracteres: " + tam + "\n");
        System.out.println("Mensagem em caixa alta: " + text_1 + "\n");
        System.out.println("Número de vogais: " + contVogais + "\n");
        
        // d
        if (text_1.startsWith("UNI")){
            System.out.println("A frase começa com UNI. \n");
        }
        else{
            System.out.println("A frase não começa com UNI. \n");
        }
        
        // e
        if(text_1.endsWith("RIO")){
            System.out.println("A frase termina com UNI. \n");
        }
        else{
            System.out.println("A frase não termina com UNI. \n");
        }
        
        //f
        if(Character.isDigit(0))
        
        //g
        String Inverso = new StringBuffer(texto).reverse().toString();
        if(texto.equalsIgnoreCase(Inverso)){
            System.out.println("É um palíndromo.\n");
        }
        else{
            System.out.println("Não é um palíndromo.\n");
        }
    }
    
}
