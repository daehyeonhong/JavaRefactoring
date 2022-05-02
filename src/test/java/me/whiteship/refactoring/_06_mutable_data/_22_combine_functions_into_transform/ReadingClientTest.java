package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

import org.junit.jupiter.api.Test;
import java.time.Month;
import java.time.Year;

class ReadingClientTest {

    @Test
    void client1() {
        final Client1 client1 = new Client1(this.acquireReading());
        assertEquals(100d, client1.getBaseCharge());
    }

    @Test
    void client2() {
        final Client2 client2 = new Client2(this.acquireReading());
        assertEquals(100d, client2.getBase());
        assertEquals(95d, client2.getTaxableCharge());
    }

    @Test
    void client3() {
        final Client3 client3 = new Client3(this.acquireReading());
        assertEquals(100d, client3.getBasicChargeAmount());
    }

    private Reading acquireReading() {
        return new Reading("keesung", 10, Month.DECEMBER, Year.of(2021));
    }

}
