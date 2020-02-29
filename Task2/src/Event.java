public class Event{
    private String description;
    private int startTime;
    private String gender;
    private Competitor[] competitors = new Competitor[10];
    private int noOfPossibleAttempts;
    private CommitteeMember[] organisedBy = new CommitteeMember[2];

    public CommitteeMember[] getOrganisedBy() {
        return this.organisedBy;
    }

    public void setOrganisedBy(CommitteeMember[] organisedBy) {
        this.organisedBy = organisedBy;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Competitor[] getCompetitors() {
        return this.competitors;
    }

    public void setCompetitors(Competitor[] competitors) {
        this.competitors = competitors;
    }

    public int getNoOfPossibleAttempts() {
        return this.noOfPossibleAttempts;
    }

    public void setNoOfPossibleAttempts(int noOfPossibleAttempts) {
        this.noOfPossibleAttempts = noOfPossibleAttempts;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public Event(String description, String gender, int noOfPossibleAttempts, CommitteeMember[] organisedBy){
        this.description = description;
        this.gender = gender;
        this.noOfPossibleAttempts = noOfPossibleAttempts;
        this.organisedBy = organisedBy;
        // no need to instantiate competitors at event creation
    }

}