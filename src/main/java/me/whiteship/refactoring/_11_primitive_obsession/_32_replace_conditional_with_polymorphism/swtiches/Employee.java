package me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.swtiches;

import java.util.List;

public abstract class Employee {

    protected List<String> availableProjects;

    protected Employee() {
    }

    protected Employee(final List<String> availableProjects) {
        this.availableProjects = availableProjects;
    }

    public abstract int vacationHours();

    public boolean canAccessTo(final String project) {
        return this.availableProjects.contains(project);
    }
}
