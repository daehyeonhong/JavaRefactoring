package me.whiteship.refactoring._01_smell_mysterious_name._03_rename_field;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudyDashboard {

    private final Set<StudyReview> studyReviews = new HashSet<>();

    public static void main(String[] args) throws IOException {
        final StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.loadReviews();
        studyDashboard.getStudyReviews().forEach(System.out::println);
    }

    /**
     * 스터디 리뷰 이슈에 작성되어 있는 리뷰어 목록과 리뷰를 읽어옵니다.
     * @throws IOException
     */
    private void loadReviews() throws IOException {
        final GitHub gitHub = GitHub.connect();
        final GHRepository repository = gitHub.getRepository("whiteship/live-study");
        final GHIssue issue = repository.getIssue(30);

        final List<GHIssueComment> reviews = issue.getComments();
        for (final GHIssueComment review : reviews) studyReviews.add(new StudyReview(review.getUserName(), review.getBody()));
    }

    private Set<StudyReview> getStudyReviews() {
        return this.studyReviews;
    }

}
