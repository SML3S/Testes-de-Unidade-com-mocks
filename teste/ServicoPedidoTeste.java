import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class ServicoPedidoTeste {
	@Mock
	private Produto produto1 =new Produto(100.00);
	
	@Mock
	private Produto produto2 =new Produto(100.00);
	
	@Mock
	private Produto produto3 =new Produto(100.00);
	
	
	private ItemPedido items1 = new ItemPedido(1, produto1);
	
	private ItemPedido items2 = new ItemPedido(1, produto2);
	
	private ItemPedido items3 = new ItemPedido(1, produto3);
	
	@Mock
	private List<ItemPedido> listaItem = new ArrayList<ItemPedido>();
	
	
	@Mock
	private Pedido pedido;

	@Mock
	private Cliente cliente;
	
	@Before
	public void initPedidoService() {
		MockitoAnnotations.initMocks(this);
		listaItem.add(items1);
		listaItem.add(items2);
		listaItem.add(items3);
		pedido = new Pedido(listaItem);
	}

	@Test
	public void testaPedidoDesconto() {
		when(cliente.getDesconto()).thenReturn(10.0);
		double valorDesc = cliente.calcularDesconto(pedido);
		Assert.assertEquals(valorDesc, 270.00, 0.000001);
	}
}
