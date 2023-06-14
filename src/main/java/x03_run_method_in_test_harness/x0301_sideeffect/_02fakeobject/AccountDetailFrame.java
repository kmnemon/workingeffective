package x03_run_method_in_test_harness.x0301_sideeffect._02fakeobject;

import java.awt.*;
import java.awt.event.ActionEvent;

public class AccountDetailFrame extends Frame {
    private TextField dispaly = new TextField(10);
    private DetailFrame detailDisplay;

    public AccountDetailFrame() {
    }

    public void performAction(ActionEvent event){
        String source = event.getActionCommand();
        performCommand(source);
    }

    public void performCommand(String source) {
        if(source.equals("project activity")){
            setDescription();
            String accountDescription = getAccountSymbol();
            setDisplayText(accountDescription);
        }
    }

    public void setDescription() {
        detailDisplay = new DetailFrame();
        detailDisplay.setDescription("...description...");
        detailDisplay.show();
    }

    public String getAccountSymbol() {
        return detailDisplay.getAccountSymbol();
    }

    public void setDisplayText(String accountDescription) {
        dispaly.setText(accountDescription);
    }
}
