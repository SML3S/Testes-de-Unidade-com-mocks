import java.util.ArrayList;
import java.util.List;


public class Pedido {

	private List<ItemPedido> items = new ArrayList<ItemPedido>();
	
	public Pedido(List<ItemPedido> items) {
		super();
		this.items= items;
		
	}
	
	public List<ItemPedido> getItems() {
		return items;
	}
		
	public double getTotal(){
		double total=0;
		for(ItemPedido it: items){
			total += it.subtotal();
		}
		
		return total;
	}
}
