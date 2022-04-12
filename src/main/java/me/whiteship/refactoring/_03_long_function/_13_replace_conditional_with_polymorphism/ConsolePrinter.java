package me.whiteship.refactoring._03_long_function._13_replace_conditional_with_polymorphism;

import java.util.List;

public class ConsolePrinter extends StudyPrinter {
    public ConsolePrinter(final int totalNumberOfEvents, final List<Participant> participants, final PrinterMode printerMode) {
        super(totalNumberOfEvents, participants, printerMode);
    }
}
