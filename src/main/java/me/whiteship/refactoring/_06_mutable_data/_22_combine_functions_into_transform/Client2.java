package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

public class Client2 extends ReadingClient {

    private final double base;
    private final double taxableCharge;

    public Client2(Reading reading) {
        final EnrichReading enrichReading = enrichReading(reading);
        this.base = enrichReading.baseCharge();
        this.taxableCharge = enrichReading.taxableCharge();
    }

    public double getBase() {
        return base;
    }

    public double getTaxableCharge() {
        return taxableCharge;
    }
}
