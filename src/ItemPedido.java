
public class ItemPedido {

	private int qtd;
	private Produto produto;
	public ItemPedido(){
		
	}
	
	
	public ItemPedido(int qtd, Produto produto) {
		super();
		this.qtd = qtd;
		this.produto = produto;
	}

	public int getQtd() {
		return qtd;
	}


	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double subtotal(){
		return qtd*produto.getPreco();
	}
}
