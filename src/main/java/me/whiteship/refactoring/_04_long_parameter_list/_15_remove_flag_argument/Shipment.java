package me.whiteship.refactoring._04_long_parameter_list._15_remove_flag_argument;

import java.time.LocalDate;

public class Shipment {

    public LocalDate regularDeliveryDate(final Order order) {
        int deliveryTime = switch (order.deliveryState()) {
            case "WA", "CA" -> 2;
            case "OR", "TX", "NY" -> 3;
            default -> 4;
        };
        return this.deliveryDate(order, deliveryTime);
    }

    public LocalDate rushDeliveryDate(final Order order) {
        int deliveryTime = switch (order.deliveryState()) {
            case "WA", "CA", "OR" -> 1;
            case "TX", "NY", "FL" -> 2;
            default -> 3;
        };
        return this.deliveryDate(order, deliveryTime);
    }

    private LocalDate deliveryDate(final Order order, final int deliveryTime) {
        return order.placedOn().plusDays(deliveryTime);
    }
}
