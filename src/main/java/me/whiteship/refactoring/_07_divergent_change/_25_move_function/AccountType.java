package me.whiteship.refactoring._07_divergent_change._25_move_function;

public record AccountType(boolean premium) {
    double overdraftCharge(final int daysOverdrawn) {
        if (this.premium()) {
            final int baseCharge = 10;
            if (daysOverdrawn <= 7) {
                return baseCharge;
            } else {
                return baseCharge + (daysOverdrawn - 7) * 0.85;
            }
        } else {
            return daysOverdrawn * 1.75;
        }
    }
}
