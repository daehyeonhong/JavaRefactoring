package me.whiteship.refactoring._12_repeated_swtiches;

import org.junit.jupiter.api.Test;

class SwitchImprovementsTest {

    @Test
    void vacationHours() {
        SwitchImprovements si = new SwitchImprovements();
        assertEquals(120, si.vacationHours("full-time"));
    }

}
