package me.whiteship.refactoring._07_divergent_change._26_extract_class;

public class Person {

    private final TelephoneNumber telephoneNumber;
    private String name;

    public Person(final TelephoneNumber telephoneNumber, final String name) {
        this.telephoneNumber = telephoneNumber;
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String telephoneNumber() {
        return this.telephoneNumber.toString();
    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }
}
