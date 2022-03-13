import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

public class GitHubBot {


    public static void main (String[] args) {
        GitHub github = null;
        try {
            github = new GitHubBuilder().withOAuthToken("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").build();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            GHRepository repo = github.createRepository("Repositorio_Damian").create();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

