package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

public abstract class Employee {

    private final String name;

    protected Employee(String name) {
        this.name = name;
    }

    public static Employee createEmployee(final String name, final String type) {
        return switch (type) {
            case "engineer" -> new Engineer(name);
            case "manager" -> new Manager(name);
            case "salesman" -> new Salesman(name);
            default -> throw new IllegalArgumentException(type);
        };
    }

    protected abstract String getType();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + this.getType() + '\'' +
                '}';
    }
}
