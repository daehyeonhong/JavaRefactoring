package me.whiteship.refactoring._09_feature_envy;

public class Bill {

    private ElectricityUsage electricityUsage;

    private GasUsage gasUsage;

    public double calculateBill() {
        double electricityBill = getElectricityBill();
        double gasBill = getGasBill();
        return electricityBill + gasBill;
    }

}
