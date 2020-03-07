public class Routine{
    private String description;
    private int difficultyRating;

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

    public Routine(String description, int difficultyRating){
        this.description = description;
        this.difficultyRating = difficultyRating;
    }

}