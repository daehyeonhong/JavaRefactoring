package me.whiteship.refactoring._18_middle_man._38_remove_middle_man;

import me.whiteship.refactoring._06_mutable_data._20_remove_setting_method.Person;
import me.whiteship.refactoring._17_message_chain._37_hide_delegate.Department;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void getManager() {
        Person nick = new Person("nick", null);
        Person keesun = new Person("keesun", new Department(nick));
        assertEquals(nick, keesun.getManager());
    }

}
