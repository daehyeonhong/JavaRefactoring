package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

public class Order {
    Priority priority;
    private String priorityValue;

    public Order(final String priorityValue) {
        this(new Priority(priorityValue));
    }

    public Order(final Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

}
