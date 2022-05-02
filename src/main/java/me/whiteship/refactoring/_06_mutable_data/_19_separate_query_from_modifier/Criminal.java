package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier;

import me.whiteship.refactoring._06_mutable_data._20_remove_setting_method.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

public class Criminal {
    private final Logger log = LoggerFactory.getLogger(Criminal.class);

    public void alertForMiscreant(List<Person> people) {
        if (!this.findMiscreant(people).isBlank()) this.setOffAlarms();
    }

    public String findMiscreant(List<Person> people) {
        for (Person p : people) {
            if (p.getName().equals("Don")) return "Don";
            if (p.getName().equals("John")) return "John";
        }
        return "";
    }

    private void setOffAlarms() {
        log.info("set off alarm");
    }
}
