package me.whiteship.refactoring._03_long_function._13_replace_conditional_with_polymorphism;

import me.whiteship.refactoring._03_long_function._01_before.Participant;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CvsPrinter extends StudyPrinter {
    public CvsPrinter(final int totalNumberOfEvents, final List<Participant> participants) {
        super(totalNumberOfEvents, participants);
    }

    @Override
    public void execute() throws IOException {
        try (final FileWriter fileWriter = new FileWriter("participants.cvs");
             PrintWriter writer = new PrintWriter(fileWriter)) {
            writer.println(cvsHeader(this.participants.size()));
            this.participants.forEach(p -> writer.println(getCvsForParticipant(p)));
        }
    }

    private String getCvsForParticipant(Participant participant) {
        StringBuilder line = new StringBuilder();
        line.append(participant.username());
        for (int i = 1; i <= this.totalNumberOfEvents; i++) {
            if (participant.homework().containsKey(i) && Boolean.TRUE.equals(participant.homework().get(i))) {
                line.append(",O");
            } else {
                line.append(",X");
            }
        }
        line.append(",").append(participant.getRate(this.totalNumberOfEvents));
        return line.toString();
    }

    private String cvsHeader(int totalNumberOfParticipants) {
        StringBuilder header = new StringBuilder(String.format("참여자 (%d),", totalNumberOfParticipants));
        for (int index = 1; index <= this.totalNumberOfEvents; index++) {
            header.append(String.format("%d주차,", index));
        }
        header.append("참석율");
        return header.toString();
    }

}
