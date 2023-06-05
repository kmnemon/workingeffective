package x01_state.s02_stub.chapter03.display;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaleTest {
    @Test
    public void displayAnItem(){
        DisplayStub displayStub = new DisplayStub();
        Sale sale = new Sale(displayStub);

        sale.scan("1");

        assertEquals("1", displayStub.getLastLine());
    }

}

class DisplayStub implements Display{
    private String lastLine = "";

    @Override
    public void showLine(String line){
        lastLine = line;
    }

    public String getLastLine() {
        return lastLine;
    }
}
