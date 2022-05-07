package me.whiteship.refactoring._14_lazy_elements._34_collapse_hierarchy;

import java.time.LocalDateTime;
import java.util.List;

public record Reservation(LocalDateTime endDateTime, List<String> members, String owner, boolean paid,
                          LocalDateTime startDateTime, String courtNumber) {
}
