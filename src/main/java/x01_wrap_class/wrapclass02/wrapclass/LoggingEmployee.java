package x01_wrap_class.wrapclass02.wrapclass;

public class LoggingEmployee implements Employee{
    private Employee employee;
    public LoggingEmployee(Employee e) {
        this.employee = e;
    }

    @Override
    public void pay() {
        logPayment();
        this.employee.pay();
    }

    @Override
    public void logPayment() {
        //...
    }
}
