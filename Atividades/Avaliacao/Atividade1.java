package Avaliacao;
import java.util.*;

public class Atividade1 {
    public static void main(String[] args) {
        /*String[] listaMensagens = new String[5];
        listaMensagens[0] = "Olá meu nome é João Mourato moro em Senhor do Bonfim/BA e meu e-mail é joao.mourato@gmail.com";
        listaMensagens[1] = "Anota meu endereço eletrônico pedroalcantara@gmail.com e meu telefone é: 87 9 9999-9999";
        listaMensagens[2] = "Boa noite meu e-mail de contato é fabio@bolcom";
        listaMensagens[3] = "Está ai meu e-mail: cleisson@formigueirotecnologico.com.br estarei aguardando seu retorno.";
        listaMensagens[4] = "Contato: mariapedrina @ gmail . com";
        
        
                
        String email = "[a-z|A-Z]\\w+@[a-z|A-Z]\\w+\\.[a-z|A-Z]{2,3}|" +
                "[a-z|A-Z]\\w+@[a-z|A-Z]\\w+\\.[a-z|A-Z]{2,3}\\.[a-z|A-Z]{2,3}";
        
        
        List<String> listaEmails = new ArrayList<>();*/
        
        // resolução
        
        String[] listaMensagens = {
            "Olá meu nome é João Mourato moro em Senhor do Bonfim/BA e meu e-mail é joao.mourato@gmail.com",
            "Anota meu endereço eletrônico pedroalcantara@gmail.com e meu telefone é: 87 9 9999-9999",
            "Boa noite meu e-mail de contato é fabio@bolcom",
            "Está ai meu e-mail: cleisson@formigueirotecnologico.com.br estarei aguardando seu retorno.",
            "Contato: mariapedrina @ gmail . com"
        };
                
        String[] listaEmails = new String[5];
        int contador = 0;
        for (String mensagem : listaMensagens) {
            String[] mensagemQuebrada = mensagem.split(" ");
            
            for (String pedacos : mensagemQuebrada) {
                if(pedacos.matches("[a-z|A-Z]\\w+\\.*\\w+@[a-z|A-Z]\\w+\\.[a-z|A-Z]{2,3}|[a-z|A-Z]\\w+@[a-z|A-Z]\\w+\\.[a-z|A-Z]{2,3}\\.[a-z|A-Z]{2,3}")){
                    listaEmails[contador] = pedacos;
                    contador++;
                }
            }
        }
        
        for (String email : listaEmails) {
            System.out.println(email);
        }
        
    }
}
