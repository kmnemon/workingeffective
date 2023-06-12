package x01_wrap_class.wrapclass02.wrapclass;

import java.util.List;

public class EmployeeImpl implements Employee {
    private List<Timecard> timecards;
    private double payRate;

    @Override
    public void pay(){
        Money amount = new Money();
        timecards.forEach(timecard -> amount.add(timecard.getHours() * payRate));
        PayDispatcher.dispatcherPay(this, amount);
    }

    @Override
    public void logPayment(){}


}
