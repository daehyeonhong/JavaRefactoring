package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {

    private double production;
    private final List<Double> adjustments = new ArrayList<>();

    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
        this.production += adjustment;
    }

    public double getProduction() {
        assert this.production == calculatedProduction();
        return calculatedProduction();
    }

    private double calculatedProduction() {
//        return this.adjustments.stream().reduce((double) 0, Double::sum);
        return this.adjustments.stream().mapToDouble(Double::doubleValue).sum();
    }
}
