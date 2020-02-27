public class Attempt {
    private int score;
    private Event forEvent;

    public Event getForEvent() {
        return this.forEvent;
    }

    public void setForEvent(Event forEvent) {
        this.forEvent = forEvent;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Attempt(int score, Event forEvent){
        this.score = score;
        this.forEvent = forEvent;
    }

}