package Avaliacao;

public class Atividade2 {
    public static void main(String[] args) {
        /*String[] links = new String[3];
        links[0] = "http://www.baixaki.com.br/?id=rb.moc.knilretrevni.www///:ptth";
        links[1] = "http://www.baixaki.com.br/?page=rb.moc.knilretrevni.www///:ptth";
        links[2] = "http://www.baixaki.com.br/?link=rb.moc.knilretrevni.www///:ptth";
        
        String[] linkInvertido;
        linkInvertido = new StringBuilder(links).reverse().toString();*/
        
        // resolução
        
        String[] listaLink = {
            "http://www.baixaki.com.br/?id=ten.knilretrevni.www///:ptth",
            "http://www.baixaki.com.br/?page=rb.moc.knilretrevni.www///:ptth",
            "http://www.baixaki.com.br/?link=oc.knilretrevni.www///:ptth"
        };
        for (String link : listaLink) {
           String linkInvertido = link.substring(link.indexOf("=")+1);
           System.out.println(new StringBuffer(linkInvertido).reverse().toString()); 
        }
        
        
    }
}
