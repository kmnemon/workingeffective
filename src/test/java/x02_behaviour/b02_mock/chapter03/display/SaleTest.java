package x02_behaviour.b02_mock.chapter03.display;

import org.junit.jupiter.api.Test;
import x01_state.s02_stub.chapter03.display.Display;
import x01_state.s02_stub.chapter03.display.Sale;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SaleTest {
    @Test
    public void displayAnItem(){
        Display display = mock(Display.class);
        Sale sale = new Sale(display);

        sale.scan("1");

        verify(display).showLine("1");
    }
}
