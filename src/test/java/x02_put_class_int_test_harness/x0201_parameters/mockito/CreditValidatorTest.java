package x02_put_class_int_test_harness.x0201_parameters.mockito;

import org.junit.jupiter.api.Test;
import x02_put_class_in_test_harness.x0201_parameters.mockito.ACTIOReport;
import x02_put_class_in_test_harness.x0201_parameters.mockito.CreditMaster;
import x02_put_class_in_test_harness.x0201_parameters.mockito.CreditValidator;
import x02_put_class_in_test_harness.x0201_parameters.mockito.RGHConnection;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CreditValidatorTest {
    @Test
    public void validateCustomerUsingMock(){
        CreditMaster creditMaster = new CreditMaster("file", true);
        RGHConnection connection = mock(RGHConnection.class);
        when(connection.ACTIOReportFor(anyInt())).thenReturn(new ACTIOReport());

        CreditValidator creditValidator = new CreditValidator(connection, creditMaster, 1);

    }
}
