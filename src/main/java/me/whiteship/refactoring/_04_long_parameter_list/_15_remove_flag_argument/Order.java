package me.whiteship.refactoring._04_long_parameter_list._15_remove_flag_argument;

import java.time.LocalDate;

public record Order(LocalDate placedOn, String deliveryState) {
}
