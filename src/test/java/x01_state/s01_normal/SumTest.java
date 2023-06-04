package x01_state.s01_normal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {
    @Test
    void addTest(){
        int r = Sum.add(3, 6);

        assertEquals(9, r);
    }
}
