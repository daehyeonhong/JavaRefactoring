package me.whiteship.refactoring._06_mutable_data._20_remove_setting_method;

public class Person {

    private final String id;
    private String name;

    public Person(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

}
