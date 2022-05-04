package me.whiteship.refactoring._10_data_clumps;

public class Employee {

    private String name;
    private TelephoneNumber personalPhoneNumber;

    public Employee(final String name, final TelephoneNumber personalPhoneNumber) {
        this.name = name;
        this.personalPhoneNumber = personalPhoneNumber;
    }

    public String personalPhoneNumber() {
        return this.personalPhoneNumber.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TelephoneNumber getPersonalPhoneNumber() {
        return personalPhoneNumber;
    }
}
