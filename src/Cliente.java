
public class Cliente {

	private double desconto;
	

	public Cliente(double desconto) {
		super();
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public Double calcularDesconto(Pedido pedido){
				
		return desconto * pedido.getTotal()/100d;
	}
}
