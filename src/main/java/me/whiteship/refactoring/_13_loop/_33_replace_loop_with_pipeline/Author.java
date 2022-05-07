package me.whiteship.refactoring._13_loop._33_replace_loop_with_pipeline;

import java.util.List;
import java.util.Objects;

public class Author {

    private final String company;

    private final String twitterHandle;

    public Author(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }

    static List<String> twitterHandles(List<Author> authors, String company) {
        return authors.stream()
                .filter(author -> author.company.equals(company))
                .map(author -> author.twitterHandle)
                .filter(Objects::nonNull)
                .toList();
    }

}
