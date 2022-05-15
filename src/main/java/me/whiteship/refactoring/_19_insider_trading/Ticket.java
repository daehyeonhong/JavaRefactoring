package me.whiteship.refactoring._19_insider_trading;

import java.time.LocalDate;

public record Ticket(LocalDate purchasedDate, boolean prime) {
    public boolean isFastPass() {
        LocalDate earlyBirdDate = LocalDate.of(2022, 1, 1);
        return this.prime() && this.purchasedDate().isBefore(earlyBirdDate);
    }
}
