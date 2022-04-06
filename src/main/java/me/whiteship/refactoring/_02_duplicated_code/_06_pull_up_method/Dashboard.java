package me.whiteship.refactoring._02_duplicated_code._06_pull_up_method;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Dashboard {

    public static void main(String[] args) throws IOException {
        ReviewerDashboard reviewerDashboard = new ReviewerDashboard();
        reviewerDashboard.printReviewers(30);
        ParticipantDashboard participantDashboard = new ParticipantDashboard();
        participantDashboard.printReviewers(15);
    }

    protected void printUsernames(final int eventId) throws IOException {
        final GitHub gitHub = GitHub.connect();
        final GHRepository repository = gitHub.getRepository("whiteship/live-study");
        final GHIssue issue = repository.getIssue(eventId);

        // Get usernames
        final Set<String> usernames = new HashSet<>();
        issue.getComments()
                .stream().map(GHIssueComment::getUserName)
                .forEach(usernames::add);

        // Print usernames
        usernames.forEach(System.out::println);
    }
}
