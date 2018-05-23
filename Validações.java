package aula2205;

import javax.swing.JOptionPane;

public class Validações {
    public static void main(String[] args) {
        // Validação CEP
        
       /* String info = JOptionPane.showInputDialog("Informe seu CEP");
        System.out.println(info.matches("\\d{5}-\\d{3}|\\d{8}"));*/
        
        // Validação email
        
        String email = JOptionPane.showInputDialog("Informe seu e-mail");
        System.out.println(email.matches("[a-z|A-Z]\\w+@[a-z|A-Z]\\w+\\.[a-z|A-Z]{2,3}|"
                                       + "[a-z|A-Z]\\w+@[a-z|A-Z]\\w+\\.[a-z|A-Z]{2,3}\\.[a-z|A-Z]{2,3}"));
    }
}