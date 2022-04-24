package me.whiteship.refactoring._07_divergent_change._24_split_phase;

public class PriceOrder {

    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        final PriceData priceData = calculatePriceData(product, quantity);
        return applyShipping(priceData, shippingMethod);
    }

    private PriceData calculatePriceData(final Product product, final int quantity) {
        final double basePrice = product.basePrice() * quantity;
        final double discount = Math.max(quantity - product.discountThreshold(), 0) * product.basePrice() * product.discountRate();
        return new PriceData(basePrice, discount, quantity);
    }

    private double applyShipping(final PriceData priceData, final ShippingMethod shippingMethod) {
        final double shippingPerCase = (priceData.basePrice() > shippingMethod.discountThreshold()) ? shippingMethod.discountedFee() : shippingMethod.feePerCase();
        final double shippingCost = priceData.quantity() * shippingPerCase;
        return priceData.basePrice() - priceData.discount() + shippingCost;
    }
}
