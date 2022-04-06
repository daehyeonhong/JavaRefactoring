package me.whiteship.refactoring._02_duplicated_code._04_extract_function;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class StudyDashboard {

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.printReviewers();
        studyDashboard.printParticipants(15);
    }

    private void printParticipants(int eventId) throws IOException {
        // Get github issue to check homework
        GHIssue issue = this.getGithubIssues(eventId);
        // Get participants
        Set<String> participants = getUsernames(issue);
        // Print participants
        print(participants);
    }

    private void print(final Set<String> participants) {
        participants.forEach(System.out::println);
    }

    private Set<String> getUsernames(final GHIssue issue) throws IOException {
        Set<String> usernames = new HashSet<>();
        issue.getComments().forEach(c -> usernames.add(c.getUserName()));
        return usernames;
    }

    private GHIssue getGithubIssues(final int eventId) throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(eventId);
        return issue;
    }

    private void printReviewers() throws IOException {
        // Get github issue to check reviews
        GHIssue issue = this.getGithubIssues(30);

        // Get reviewers
        Set<String> reviewers = getUsernames(issue);

        // Print reviewers
        print(reviewers);
    }

}
