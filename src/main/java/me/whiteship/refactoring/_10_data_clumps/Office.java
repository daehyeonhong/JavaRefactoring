package me.whiteship.refactoring._10_data_clumps;

public class Office {

    private final String location;

    private final TelephoneNumber officePhoneNumber;

    public Office(final String location, final TelephoneNumber officePhoneNumber) {
        this.location = location;
        this.officePhoneNumber = officePhoneNumber;
    }

    public String officePhoneNumber() {
        return this.officePhoneNumber.toString();
    }
}
