package me.whiteship.refactoring._18_middle_man._39_replace_superclass_with_delegate;

import java.util.List;

public record CategoryItem(Integer id, String title, List<String> tags) {
    public boolean hasTag(String tag) {
        return this.tags.contains(tag);
    }
}
