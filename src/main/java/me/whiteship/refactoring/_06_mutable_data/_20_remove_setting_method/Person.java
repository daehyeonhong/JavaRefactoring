package me.whiteship.refactoring._06_mutable_data._20_remove_setting_method;

public class Person {

    private String name;

    private final int id;

    public Person(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

}
