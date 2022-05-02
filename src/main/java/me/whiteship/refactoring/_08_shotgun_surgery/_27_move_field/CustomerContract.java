package me.whiteship.refactoring._08_shotgun_surgery._27_move_field;

import java.time.LocalDate;

public class CustomerContract {

    private LocalDate startDate;
    private double discountRate;

    public CustomerContract(final LocalDate startDate, final double discountRate) {
        this.startDate = startDate;
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(final double discountRate) {
        this.discountRate = discountRate;
    }
}
