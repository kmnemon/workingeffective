package x02_behaviour.b01_normal;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ATest {

    @Test
    void fnaTest() {
        B b = mock(B.class);
        A a = new A(b);

        a.fna();

        verify(b).fnb();
    }

}
