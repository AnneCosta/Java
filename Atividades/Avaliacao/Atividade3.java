package Avaliacao;

import java.util.Arrays;

public class Atividade3 {
    public static void main(String[] args) {
        /*String structure = "[a-z]\\w{3,4}://www.\\w{2,26}.[a-z]\\w{2,3} | [a-z]\\w{3,4}://www.\\w{2,26}.[a-z]\\w{2,3}.[a-z]\\w{2,3}";
        String[] link = new String[2];
        link[0] = "http://www.uol.com.br:8080/pasta/pagina1.php";
        link[1] = "ftp://microsoft.com:21/pasta";
        
       boolean contador = false; 
       for(int i=0; i<2; i++){
            if(link.equals(structure)){
                //contador = true;
                System.out.println("Domínio válido");
            }
            else{
                System.out.println(Arrays.toString(link));
            }
       }
       
       for(int i=0; i<2; i++){
           if(contador == true){
               System.out.println("Domínio válido");
           }
           else{
               System.out.println("Domínio inválido");
           }
       }*/
        
        // resolução
        String[] listaLinks = {
            "http://www.uol.com.br:8080/pasta/pagina1.php",
            "ftp://microsoft.com:21/pasta"
        };
        for (String link : listaLinks) {
            String protocolo = "";
            String dominio = "";
            String porta = "";
            String pasta = "";
            String arquivo = "";
            
            String[] partesString = link.split("(://)|(:)|(/)");
            int contador=0;
            for (String string : partesString) {
                if(contador==0){
                    protocolo = partesString[0];
                }else if(contador==1){
                    dominio = partesString[1];
                }else if(contador==2){
                    if(link.matches(""))
                    porta = partesString[2];
                }else if(contador==3){
                    pasta = partesString[3];
                }else{
                    arquivo = partesString[4];
                }
                contador++;
            }
            
            
            
            
            
            
            
            for (String partes : partesString) {
                System.out.println("Protocolo: "+protocolo+"\nDomínio: "+dominio+"\nPorta: "+porta+"\nPasta: "+pasta+"\nArquivo: "+arquivo);
            }
        }
        
    }
}
