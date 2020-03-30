public class CommitteeMember {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CommitteeMember(String name){
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }

}