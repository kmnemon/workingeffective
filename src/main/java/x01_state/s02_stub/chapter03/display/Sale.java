package x01_state.s02_stub.chapter03.display;

public class Sale {
    private Display display;

    public Sale(Display display) {
        this.display = display;
    }

    public void scan(String barcode){
        display.showLine(barcode);
    }
}
