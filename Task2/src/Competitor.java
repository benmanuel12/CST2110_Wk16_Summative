public class Competitor{
    private int competitionNumber;
    private String name;
    private Attempt[] attempts;
    private String gender;

    public int getCompetitionNumber() {
        return this.competitionNumber;
    }

    public void setCompetitionNumber(int competitionNumber) {
        this.competitionNumber = competitionNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attempt[] getAttempts() {
        return this.attempts;
    }

    public void setAttempts(Attempt[] attempts) {
        this.attempts = attempts;
    }

    public void addAttempt(Attempt attempt){
        Attempt[] newAttempts = Attempt[attempts.length + 1];
        newAttempts[attempts.length] = attempt;

        attempts = newAttempts;
    }

    public Competitor(int competitionNumber, String name, String gender){
        this.competitionNumber = competitionNumber;
        this.name = name;
        this.gender = gender;
        // no need to set attempts here as upon creation of a new person they have attempted nothing
    }
    
}