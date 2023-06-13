package x03_run_method_in_test_harness.x0301_sideeffect._02fakeobject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountDetailFrameTest {
    @Test
    public void testPerformCommand(){
        TestingAccountDetailFrame frame = new TestingAccountDetailFrame();
        frame.accountSymbol = "SYM";

        frame.performCommand("project activity");

        assertEquals("SYM", frame.displayText);
    }



}

class TestingAccountDetailFrame extends AccountDetailFrame{
    String displayText = "";
    String accountSymbol = "";

    @Override
    public void setDescription(){

    }

    @Override
    public String getAccountSymbol(){
        return accountSymbol;
    }

    @Override
    public void setDisplayText(String text){
        displayText = text;
    }


}
