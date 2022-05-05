package me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.variation;

import java.util.List;

public class VoyageRatingFactory {
    private VoyageRatingFactory() {
    }

    public static VoyageRating createVoyageRating(Voyage voyage, List<VoyageHistory> histories) {
        if (voyage.zone().equals("china") && hasChinaHistory(histories))
            return new ChinaExperiencedVoyageRating(voyage, histories);
        else return new VoyageRating(voyage, histories);
    }

    private static boolean hasChinaHistory(final List<VoyageHistory> histories) {
        return histories.stream().anyMatch(v -> v.zone().equals("china"));
    }
}
