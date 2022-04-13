package me.whiteship.refactoring._04_long_parameter_list._14_replace_parameter_with_query;

public class Order {

    private final int quantity;

    private final double itemPrice;

    public Order(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double finalPrice() {
        double basePrice = this.quantity * this.itemPrice;
        return this.discountedPrice(basePrice);
    }

    private int disCountLevel() {
        return this.quantity > 100 ? 2 : 1;
    }

    private double discountedPrice(double basePrice) {
        return this.disCountLevel() == 2 ? basePrice * 0.90 : basePrice * 0.95;
    }
}
