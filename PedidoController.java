@RestController
@RequestMapping("api/cliente")
public class PedidoController {
	
	@PostMapping("/pedidos")
	public ResponseEntity<?> criarPedido() {
		return ResponseEntity.ok("Pedido criado");
	}
}