public class Vendedor {
    private int cod;
    private String nome;
    private String endereco;
    
    public Vendedor(int cod, String nome, String endereco){
        this.cod = cod;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Venda vender(int cod, String data, Cliente cliente, Vendedor vendedor, String formaPagamento){
        return new Venda(cod, data, cliente, vendedor, formaPagamento);
        
        
    }
    
    public String cancelarVenda(Venda venda){
        venda.setSituacao("Cancelado");
        return "Venda cancelada";
        
    }
    
    public String cancelarItem(){
        return null;
        
    }
    
    public Produto cadastrarProduto(int cod, int quantidade, double valorUnit, String tipo, String nome){
        return new Produto(cod, quantidade, valorUnit, tipo, nome);
    }
    
    public Cliente cadastrarCliente(int cod, String nome, String endereco){
        return new Cliente(cod, nome, endereco);
    }
    
    public ItemVenda incluirItem(int cod, Produto produto, int quantidade, Venda venda){
        double valorUnit = produto.getValorUnit();
        double subTotal = valorUnit * quantidade;
        ItemVenda item = new ItemVenda();
        item.setCod(cod);
        item.setProduto(produto);
        item.setQuantidade(quantidade);
        item.setSubTotal(subTotal);
        item.setVenda(venda);
        
        return item;
        
    }
    
    public ItemVenda incluirItem(int cod, double desconto, Produto produto, int quantidade, Venda venda){
        double valorUnit = produto.getValorUnit();
        double subTotal = valorUnit * quantidade;
        ItemVenda item = new ItemVenda();
        item.setCod(cod);
        item.setProduto(produto);
        item.setQuantidade(quantidade);
        item.setSubTotal(subTotal);
        item.setVenda(venda);
        item.setSituacao("Ativo");
        
        return item;
        
    }
    
    public String fecharVenda(Venda venda){
        venda.setSituacao("Finalizado");
        return "Venda finalizada";
        
    }
    
    public void mostrarVenda(ItemVenda[] itens, Venda venda){
        int cod = venda.getCod();
        String situacao = venda.getSituacao();
        String data = venda.getData();
        Cliente cliente = venda.getCliente();
        Vendedor vendedor = venda.getVendedor();
        String formaPagamento = venda.getFormaPagamento();
        
        System.out.println("Venda\n");
        System.out.println("Código da venda: "+cod+"\nSituação: "+situacao+"\nData da venda: "+data+
                "\nNome do Cliente: "+cliente.getNome()+"\nVendedor: "+vendedor.getNome()+"\nForma de pagamento: "+
                formaPagamento);
        System.out.println("\n----------------------------------------------------");
        System.out.println("Itens de Venda\n");
        for(ItemVenda linha : itens){
            if(linha != null){
                if(linha.getVenda() == venda){
                    System.out.println(
                    "Código do item: "+linha.getCod()+" Desconto: "+linha.getDesconto()+
                    " Nome do produto: "+linha.getProduto().getNome()+" Quantidade: "+linha.getQuantidade()+
                    " Subtotal: "+linha.getSubTotal()
                    );
                }
            }
        }
        
        
    }
    
    
}
