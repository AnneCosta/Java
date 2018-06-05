import java.util.*;

public class Atividade1 {
    public static void main(String[] args) {
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
