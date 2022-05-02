package me.whiteship.refactoring._03_long_function._13_replace_conditional_with_polymorphism;

import me.whiteship.refactoring._03_long_function._01_before.Participant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.util.List;

public class ConsolePrinter extends StudyPrinter {
    final Logger log = LoggerFactory.getLogger(ConsolePrinter.class);

    public ConsolePrinter(final int totalNumberOfEvents, final List<Participant> participants) {
        super(totalNumberOfEvents, participants);
    }

    @Override
    public void execute() throws IOException {
        this.participants.forEach(p -> log.info("{} {}:{}", p.username(), checkMark(p), p.getRate(this.totalNumberOfEvents)));
    }
}
