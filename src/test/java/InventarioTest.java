
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class InventarioTest {

    @Test
    void calculaSubtotalDeCuatroProductos() {

        int resultado = Inventario.calcularSubtotal(50, 4);

        assertEquals(200, resultado);
    }
}

