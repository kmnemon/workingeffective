package x02_put_class_int_test_harness.x0201_parameters.origin;

import org.junit.jupiter.api.Test;

import x02_put_class_in_test_harness.x0201_parameters.origin.ACTIOReport;
import x02_put_class_in_test_harness.x0201_parameters.origin.CreditMaster;
import x02_put_class_in_test_harness.x0201_parameters.origin.CreditValidator;
import x02_put_class_in_test_harness.x0201_parameters.origin.RGHConnection;



public class CreditValidatorTest {
    @Test
    public void validateCustomerUsingOrigin(){
        RGHConnection connection = new FakeConnection();
        CreditMaster creditMaster = new CreditMaster("file", true);

        CreditValidator creditValidator = new CreditValidator(connection, creditMaster, 1);
    }
}

class FakeConnection implements RGHConnection{
    @Override
    public void connect() {
    }

    @Override
    public void disconnect() {
    }

    @Override
    public ACTIOReport ACTIOReportFor(int customerID) {
        return new ACTIOReport();
    }
}
