package x03_run_method_in_test_harness.x0301_sideeffect._01origin;

import java.awt.*;
import java.awt.event.ActionEvent;

public class AccountDetailFrame extends Frame{
    private TextField dispaly = new TextField(10);

    public AccountDetailFrame() {
    }

    public void actionPerformed(ActionEvent event){
        String source = event.getActionCommand();
        if(source.equals("project activity")){
            DetailFrame detailDisplay = new DetailFrame();
            detailDisplay.setDescription("...description...");
            detailDisplay.show();
            String accountDescription = detailDisplay.getAccountSymbol();
            dispaly.setText(accountDescription);
        }
    }
}
