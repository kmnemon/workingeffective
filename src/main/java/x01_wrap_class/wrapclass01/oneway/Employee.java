package x01_wrap_class.wrapclass01.oneway;

import java.util.List;

public class Employee {
    private List<Timecard> timecards;
    private double payRate;

    public void pay(){
        Money amount = new Money();
        timecards.forEach(timecard -> amount.add(timecard.getHours() * payRate));
        PayDispatcher.dispatcherPay(this, amount);
    }


}
