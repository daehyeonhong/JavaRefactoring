package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

public class Client3 extends ReadingClient {

    private final double basicChargeAmount;

    public Client3(Reading reading) {
        this.basicChargeAmount = enrichReading(reading).baseCharge();
    }

    public double getBasicChargeAmount() {
        return basicChargeAmount;
    }
}
