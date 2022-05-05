package me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.variation;

import java.util.List;

public class VoyageRating {

    protected Voyage voyage;

    protected List<VoyageHistory> histories;

    public VoyageRating(Voyage voyage, List<VoyageHistory> histories) {
        this.voyage = voyage;
        this.histories = histories;
    }

    public char value() {
        final int vpf = this.voyageProfitFactor();
        final int vr = this.voyageRisk();
        final int chr = this.captainHistoryRisk();
        return (vpf * 3 > (vr + chr * 2)) ? 'A' : 'B';
    }

    protected int captainHistoryRisk() {
        int result = 1;
        if (this.histories.size() < 5) result += 4;
        result += this.histories.stream().filter(v -> v.profit() < 0).count();
        return Math.max(result, 0);
    }

    private int voyageRisk() {
        int result = 1;
        if (this.voyage.length() > 4) result += 2;
        if (this.voyage.length() > 8) result += this.voyage.length() - 8;
        if (List.of("china", "east-indies").contains(this.voyage.zone())) result += 4;
        return result;
    }

    protected int voyageProfitFactor() {
        int result = 2;
        if (this.voyage.zone().equals("china")) result += 1;
        if (this.voyage.zone().equals("east-indies")) result += 1;
        result += historyLengthFactor();
        result += voyageLengthFactor();
        return result;
    }

    protected int voyageLengthFactor() {
        return this.voyage.length() > 14 ? -1 : 0;
    }

    protected int historyLengthFactor() {
        return this.histories.size() > 8 ? 1 : 0;
    }

}
