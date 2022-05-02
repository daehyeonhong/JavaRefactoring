package me.whiteship.refactoring._08_shotgun_surgery._29_inline_class;

import me.whiteship.refactoring._04_long_parameter_list._15_remove_flag_argument.Shipment;
import org.junit.jupiter.api.Test;

class ShipmentTest {

    @Test
    void trackingInfo() {
        Shipment shipment = new Shipment(new TrackingInformation("UPS", "12345"));
        assertEquals("UPS: 12345", shipment.getTrackingInfo());
    }

}
