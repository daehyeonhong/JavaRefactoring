package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier;

public record Billing(Customer customer, EmailGateway emailGateway) {

    public double getTotalOutstanding() {
        return customer.getInvoices().stream().map(Invoice::getAmount).reduce((double) 0, Double::sum);
    }

    public void sendBill() {
        emailGateway.send(formatBill(customer));
    }

    private String formatBill(Customer customer) {
        return "sending bill for " + customer.getName();
    }
}
