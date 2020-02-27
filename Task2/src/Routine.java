public class Routine{
    private String description;
    private int difficultyRating;
    private Attempt forAttempt;

    public Attempt getForAttempt() {
        return this.forAttempt;
    }

    public void setForAttempt(Attempt forAttempt) {
        this.forAttempt = forAttempt;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDifficultyRating() {
        return this.difficultyRating;
    }

    public void setDifficultyRating(int difficultyRating) {
        this.difficultyRating = difficultyRating;
    }

    public Routine(String description, int difficultyRating, Attempt forAttempt){
        this.description = description;
        this.difficultyRating = difficultyRating;
        this.forAttempt = forAttempt;
    }

}