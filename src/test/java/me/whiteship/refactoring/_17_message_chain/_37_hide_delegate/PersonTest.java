package me.whiteship.refactoring._17_message_chain._37_hide_delegate;

import me.whiteship.refactoring._06_mutable_data._20_remove_setting_method.Person;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void manager() {
        Person keesun = new Person("keesun");
        Person nick = new Person("nick");
        keesun.setDepartment(new Department("m365deploy", nick));

        Person manager = keesun.getDepartment().getManager();
        assertEquals(nick, manager);
    }

}
