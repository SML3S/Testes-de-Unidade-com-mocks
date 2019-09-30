import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;

public class ServicoItemPedidoTeste {
	

	private int qtd;
	
	@Mock
	private Produto produto;
	
	@Mock
	private ItemPedido itemPedido;
	
	@Before
	public void initItemPedidoService() {
		MockitoAnnotations.initMocks(this);
		
		itemPedido = new ItemPedido(qtd, produto);
	}

	@Test
	public void testSubTotal() {
		when(produto.getPreco()).thenReturn(100.00);
		when(itemPedido.getQtd()).thenReturn(2);
		double valor = itemPedido.subtotal();
		Assert.assertEquals(valor, 200.00, 0.1);
	}
}
