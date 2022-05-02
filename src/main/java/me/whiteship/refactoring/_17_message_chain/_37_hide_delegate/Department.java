package me.whiteship.refactoring._17_message_chain._37_hide_delegate;

import me.whiteship.refactoring._06_mutable_data._20_remove_setting_method.Person;

public class Department {

    private String chargeCode;

    private Person manager;

    public Department(String chargeCode, Person manager) {
        this.chargeCode = chargeCode;
        this.manager = manager;
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public Person getManager() {
        return manager;
    }
}
