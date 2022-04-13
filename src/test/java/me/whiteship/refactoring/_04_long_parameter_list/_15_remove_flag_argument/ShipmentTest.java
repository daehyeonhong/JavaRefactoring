package me.whiteship.refactoring._04_long_parameter_list._15_remove_flag_argument;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShipmentTest {

    @Test
    void deliveryDate() {
        final LocalDate placedOn = LocalDate.of(2021, 12, 15);
        final Order orderFromWA = new Order(placedOn, "WA");

        final Shipment shipment = new Shipment();
        assertEquals(placedOn.plusDays(1), shipment.rushDeliveryDate(orderFromWA));
        assertEquals(placedOn.plusDays(2), shipment.regularDeliveryDate(orderFromWA));
    }

}
