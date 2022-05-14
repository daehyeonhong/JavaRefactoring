package me.whiteship.refactoring._18_middle_man._40_replace_subclass_with_delegate;

public record PremiumDelegate(Booking host, PremiumExtra extra) {

    public boolean hasTalkback() {
        return this.host.show.hasOwnProperty("talkback");
    }

    public double extendBasePrice(final double result) {
        return Math.round(result + this.extra.getPremiumFee());
    }

    public boolean hasDinner() {
        return this.extra.hasOwnProperty("dinner") && !this.host.isPeakDay();
    }
}
