package me.whiteship.refactoring._10_data_clumps;

public class TelephoneNumber {

    private final String areaCode;

    private final String number;

    public TelephoneNumber(final String areaCode, final String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.areaCode + "-" + this.number;
    }
}
