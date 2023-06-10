import android.view.View;

public void openGitHubPage(View view) {
        String githubUrl = "https://github.com/nazmi1666/My_assigment_1.git";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(githubUrl));
        startActivity(intent);
        }