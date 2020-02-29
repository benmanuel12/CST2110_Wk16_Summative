
public class ApplicationRunner {
    
    public static void main(String[] args) {
        // Create in this order
        // Competition
        // CommitteeMember
        // Event
        // Competitor
        // Routine
        // Attempt

        Competition theOneAndOnly = new Competition();

        CommitteeMember member0 = new CommitteeMember("Ajani Goldmane");
        CommitteeMember member1 = new CommitteeMember("Tacenda Verlasen");

        Event FloorExerciseMale = new Event("Floor Exercise - Male", "male", 1, new CommitteeMember[]{member0, null});
        Event PommelHorseMale = new Event("Pommel Horse - Male", "male", 1, new CommitteeMember[]{member0, null});
        Event StillRingsMale = new Event("Still Rings - Male", "male", 1, new CommitteeMember[]{member0, null});
        Event VaultMale = new Event("Vault - Male", "male", 2, new CommitteeMember[]{member0, null});
        Event ParallelBarsMale = new Event("Parallel Bars - Male", "male", 1, new CommitteeMember[]{member0, null});
        Event HighBarMale = new Event("High Bar - Male", "male", 1, new CommitteeMember[]{member0, null});
        Event VaultFemale = new Event("Vault - Female", "female", 2, new CommitteeMember[]{member1, null});
        Event UnevenBarsFemale = new Event("Uneven Bars - Female", "female", 1, new CommitteeMember[]{member1, null});
        Event BalanceBeamFemale = new Event("Balance Beam - Female", "female", 1, new CommitteeMember[]{member1, null});
        Event FloorExerciseFemale = new Event("Floor Exercise - Female", "female", 1, new CommitteeMember[]{member1, null});

        
        
    }
}

