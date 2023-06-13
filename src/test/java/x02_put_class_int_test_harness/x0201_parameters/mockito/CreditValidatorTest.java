package x02_put_class_int_test_harness.x0201_parameters.mockito;

import org.junit.jupiter.api.Test;
import x02_put_class_in_test_harness.x0201_parameters._01mockito.ACTIOReport;
import x02_put_class_in_test_harness.x0201_parameters._01mockito.CreditMaster;
import x02_put_class_in_test_harness.x0201_parameters._01mockito.CreditValidator;
import x02_put_class_in_test_harness.x0201_parameters._01mockito.RGHConnection;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CreditValidatorTest {
    @Test
    public void validateCustomerUsingMock(){
        RGHConnection connection = mock(RGHConnection.class);
        CreditMaster creditMaster = new CreditMaster("file", true);
        when(connection.ACTIOReportFor(anyInt())).thenReturn(new ACTIOReport());

        CreditValidator creditValidator = new CreditValidator(connection, creditMaster, 1);

    }
}
