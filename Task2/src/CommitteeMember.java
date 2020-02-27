public class CommitteeMember {
    private String name;
    private Event[] organisedEvents;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Event[] getOrganisedEvents() {
        return this.organisedEvents;
    }

    public void setOrganisedEvents(Event[] organisedEvents) {
        this.organisedEvents = organisedEvents;
    }

    public CommitteeMember(String name, Event[] organisedEvents){
        this.name = name;
        this.organisedEvents = organisedEvents;
    }

}