import java.util.Arrays;
import java.util.Scanner;

public class ApplicationRunner {

        Competition theOneAndOnly = new Competition();

        static CommitteeMember member0 = new CommitteeMember("Ajani Goldmane");
        static CommitteeMember member1 = new CommitteeMember("Tacenda Verlasen");

        static Event FloorExerciseMale = new Event("Floor Exercise - Male", "male", 1,
                        new CommitteeMember[] { member0, null });
        static Event PommelHorse = new Event("Pommel Horse", "male", 1, new CommitteeMember[] { member0, null });
        static Event StillRings = new Event("Still Rings", "male", 1, new CommitteeMember[] { member0, null });
        static Event VaultMale = new Event("Vault - Male", "male", 2, new CommitteeMember[] { member0, null });
        static Event ParallelBars = new Event("Parallel Bars", "male", 1, new CommitteeMember[] { member0, null });
        static Event HighBar = new Event("High Bar", "male", 1, new CommitteeMember[] { member0, null });
        static Event VaultFemale = new Event("Vault - Female", "female", 2, new CommitteeMember[] { member1, null });
        static Event UnevenBars = new Event("Uneven Bars", "female", 1, new CommitteeMember[] { member1, null });
        static Event BalanceBeam = new Event("Balance Beam", "female", 1, new CommitteeMember[] { member1, null });
        static Event FloorExerciseFemale = new Event("Floor Exercise - Female", "female", 1,
                        new CommitteeMember[] { member1, null });

        static Event[] eventList = { FloorExerciseMale, PommelHorse, StillRings, VaultMale, ParallelBars, HighBar,
                        VaultFemale, UnevenBars, BalanceBeam, FloorExerciseFemale };

        static Competitor C1 = new Competitor(1, "Montell Griffin", "male");
        static Competitor C2 = new Competitor(2, "Ubaid Gross", "male");
        static Competitor C3 = new Competitor(3, "Rhodri Hills", "male");
        static Competitor C4 = new Competitor(4, "Tashan Croft", "male");
        static Competitor C5 = new Competitor(5, "Jordan-Lee Hicks", "male");
        static Competitor C6 = new Competitor(6, "Adela Garza", "female");
        static Competitor C7 = new Competitor(7, "Farrah Christie", "female");
        static Competitor C8 = new Competitor(8, "Heena Swan", "female");
        static Competitor C9 = new Competitor(9, "Che Moss", "female");
        static Competitor C10 = new Competitor(10, "Chelsey Taylor", "female");

        static Routine FEM1 = new Routine("Basic Routine", 1);
        static Routine PHM1 = new Routine("Basic Routine", 1);
        static Routine SRM1 = new Routine("Basic Routine", 1);
        static Routine VM1 = new Routine("Basic Routine", 1);
        static Routine VM2 = new Routine("Advanced Routine", 2);
        static Routine PBM1 = new Routine("Basic Routine", 1);
        static Routine HBM1 = new Routine("Basic Routine", 1);
        static Routine VF1 = new Routine("Basic Routine", 1);
        static Routine VF2 = new Routine("Advanced Routine", 2);
        static Routine UBF1 = new Routine("Basic Routine", 1);
        static Routine BBF1 = new Routine("Basic Routine", 1);
        static Routine FEF1 = new Routine("Basic Routine", 1);

        static Attempt A1 = new Attempt(23, FloorExerciseMale, FEM1); // C1
        static Attempt A2 = new Attempt(23, FloorExerciseMale, FEM1); // C3
        static Attempt A3 = new Attempt(23, PommelHorse, PHM1); // C1
        static Attempt A4 = new Attempt(23, PommelHorse, PHM1); // C2
        static Attempt A5 = new Attempt(23, StillRings, SRM1); // C2
        static Attempt A6 = new Attempt(23, StillRings, SRM1); // C3
        static Attempt A7 = new Attempt(23, VaultMale, VM1); // C3
        static Attempt A8 = new Attempt(23, VaultMale, VM2); // C3
        static Attempt A9 = new Attempt(23, VaultMale, VM1); // C4
        static Attempt A10 = new Attempt(23, VaultMale, VM2); // C4
        static Attempt A11 = new Attempt(23, ParallelBars, PBM1); // C4
        static Attempt A12 = new Attempt(23, ParallelBars, PBM1); // C5
        static Attempt A13 = new Attempt(23, HighBar, HBM1); // C1
        static Attempt A14 = new Attempt(23, HighBar, HBM1); // C5
        static Attempt A15 = new Attempt(23, VaultFemale, VF1); // C6
        static Attempt A16 = new Attempt(23, VaultFemale, VF2); // C6
        static Attempt A17 = new Attempt(23, VaultFemale, VF1); // C7
        static Attempt A18 = new Attempt(23, VaultFemale, VF2); // C7
        static Attempt A19 = new Attempt(23, UnevenBars, UBF1); // C7
        static Attempt A20 = new Attempt(23, UnevenBars, UBF1); // C8
        static Attempt A21 = new Attempt(23, BalanceBeam, BBF1); // C8
        static Attempt A22 = new Attempt(23, BalanceBeam, BBF1); // C9
        static Attempt A23 = new Attempt(23, FloorExerciseFemale, FEF1); // C9
        static Attempt A24 = new Attempt(23, FloorExerciseFemale, FEF1); // C10

        static Attempt[] attemptList = { A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17,
                        A18, A19, A20, A21, A22, A23, A24 };

        public static void main(String[] args) {

                FloorExerciseMale.setCompetitors(new Competitor[] { C1, C3 });
                PommelHorse.setCompetitors(new Competitor[] { C1, C2 });
                StillRings.setCompetitors(new Competitor[] { C2, C3 });
                VaultMale.setCompetitors(new Competitor[] { C3, C4 });
                ParallelBars.setCompetitors(new Competitor[] { C4, C5 });
                HighBar.setCompetitors(new Competitor[] { C1, C5 });
                VaultFemale.setCompetitors(new Competitor[] { C6, C7 });
                UnevenBars.setCompetitors(new Competitor[] { C7, C8 });
                BalanceBeam.setCompetitors(new Competitor[] { C8, C9 });
                FloorExerciseFemale.setCompetitors(new Competitor[] { C9, C10 });

                C1.setAttempts(new Attempt[] { A1, A3, A13 });
                C2.setAttempts(new Attempt[] { A4, A5 });
                C3.setAttempts(new Attempt[] { A2, A6, A7, A8 });
                C4.setAttempts(new Attempt[] { A9, A10, A11 });
                C5.setAttempts(new Attempt[] { A12, A14 });
                C6.setAttempts(new Attempt[] { A15, A16 });
                C7.setAttempts(new Attempt[] { A17, A18, A19 });
                C8.setAttempts(new Attempt[] { A20, A21 });
                C9.setAttempts(new Attempt[] { A22, A23 });
                C10.setAttempts(new Attempt[] { A24 });

                menu();

        }

        static void menu() {
                // Creates scanner, takes input from user and runs appropriate action based on
                // input followed by menu again
                Scanner input = new Scanner(System.in);
                System.out.println("List Event Information.......1");
                System.out.println("List Competitor Events .....2");
                System.out.println("List Event's Attempts...3");
                System.out.println("Exit...............0");
                System.out.println("");
                System.out.print("Enter choice:>");
                int choice = input.nextInt();
                switch (choice) {
                        case 1:
                                listEventInformation();
                                menu();
                        case 2:
                                listCompetitorEvents();
                                menu();
                        case 3:
                                listEventsAttempts();
                                menu();
                        case 0:
                                System.exit(0);
                        default:
                                menu();

                }
        }

        // List event information
        static void listEventInformation() {
                Scanner input = new Scanner(System.in);
                System.out.println("Floor Exercise....1");
                System.out.println("Pommel Horse....2");
                System.out.println("Still Rings....3");
                System.out.println("Vault....4");
                System.out.println("Parallel Bars....5");
                System.out.println("High Bar....6");
                System.out.println("Uneven Bars....7");
                System.out.println("Balance Beam....8");
                int choice = input.nextInt();
                Event targetEvent = null;
                switch (choice) {
                        case 1:
                                Scanner input2 = new Scanner(System.in);
                                System.out.println("Male....1");
                                System.out.println("Female....2");
                                int choice2 = input2.nextInt();
                                if (choice2 == 1) {
                                        targetEvent = FloorExerciseMale;
                                } else if (choice2 == 2) {
                                        targetEvent = FloorExerciseFemale;
                                }
                                break;

                        case 2:
                                targetEvent = PommelHorse;
                                break;
                        case 3:
                                targetEvent = StillRings;
                                break;
                        case 4:
                                Scanner input3 = new Scanner(System.in);
                                System.out.println("Male....1");
                                System.out.println("Female....2");
                                int choice3 = input3.nextInt();
                                if (choice3 == 1) {
                                        targetEvent = VaultMale;
                                } else if (choice3 == 2) {
                                        targetEvent = VaultFemale;
                                }
                                break;
                        case 5:
                                targetEvent = ParallelBars;
                                break;
                        case 6:
                                targetEvent = HighBar;
                                break;
                        case 7:
                                targetEvent = VaultFemale;
                                break;
                        case 8:
                                targetEvent = UnevenBars;
                                break;
                }
                for (Competitor comp : targetEvent.getCompetitors()) {
                        System.out.println("Number: " + comp.getCompetitionNumber());
                        System.out.println("Name: " + comp.getName());
                }
                System.out.println("Committee Members: " + Arrays.toString(targetEvent.getOrganisedBy()));

        }

        // List competitor events
        static void listCompetitorEvents() {
                Scanner input = new Scanner(System.in);
                System.out.println("Montell Griffin....1");
                System.out.println("Ubaid Gross....2");
                System.out.println("Rhodri Hills....3");
                System.out.println("Tashan Croft....4");
                System.out.println("Jordan-Lee Hicks....5");
                System.out.println("Adela Garza....6");
                System.out.println("Farrah Christie....7");
                System.out.println("Heena Swan....8");
                System.out.println("Che Moss....9");
                System.out.println("Chelsey Taylor....10");
                int choice = input.nextInt();
                Competitor targetCompetitor = null;
                switch (choice) {
                        case 1:
                                targetCompetitor = C1;
                                break;
                        case 2:
                                targetCompetitor = C2;
                                break;
                        case 3:
                                targetCompetitor = C3;
                                break;
                        case 4:
                                targetCompetitor = C4;
                                break;
                        case 5:
                                targetCompetitor = C5;
                                break;
                        case 6:
                                targetCompetitor = C6;
                                break;
                        case 7:
                                targetCompetitor = C7;
                                break;
                        case 8:
                                targetCompetitor = C8;
                                break;
                        case 9:
                                targetCompetitor = C9;
                                break;
                        case 10:
                                targetCompetitor = C10;
                                break;

                }
                for (Event event : eventList) {
                        if (Arrays.asList(event.getCompetitors()).contains(targetCompetitor)) {
                                System.out.println("Event: " + event.getDescription());
                                for (Attempt attempt : attemptList) {
                                        if ((attempt.getForEvent().equals(event))) {
                                                System.out.println("Description: " + attempt.getRoutine().getDescription());
                                                System.out.println("Difficulty: " + attempt.getRoutine().getDifficultyRating());
                                        }
                                }
                        }
                }

        }

        // List events attempts
        static void listEventsAttempts() {
                Scanner input = new Scanner(System.in);
                System.out.println("Floor Exercise....1");
                System.out.println("Pommel Horse....2");
                System.out.println("Still Rings....3");
                System.out.println("Vault....4");
                System.out.println("Parallel Bars....5");
                System.out.println("High Bar....6");
                System.out.println("Uneven Bars....7");
                System.out.println("Balance Beam....8");
                int choice = input.nextInt();
                Event targetEvent = null;
                switch (choice) {
                        case 1:
                                Scanner input2 = new Scanner(System.in);
                                System.out.println("Male....1");
                                System.out.println("Female....2");
                                int choice2 = input2.nextInt();
                                if (choice2 == 1) {
                                        targetEvent = FloorExerciseMale;
                                } else if (choice2 == 2) {
                                        targetEvent = FloorExerciseFemale;
                                }
                                break;

                        case 2:
                                targetEvent = PommelHorse;
                                break;
                        case 3:
                                targetEvent = StillRings;
                                break;
                        case 4:
                                Scanner input3 = new Scanner(System.in);
                                System.out.println("Male....1");
                                System.out.println("Female....2");
                                int choice3 = input3.nextInt();
                                if (choice3 == 1) {
                                        targetEvent = VaultMale;
                                } else if (choice3 == 2) {
                                        targetEvent = VaultFemale;
                                }
                                break;
                        case 5:
                                targetEvent = ParallelBars;
                                break;
                        case 6:
                                targetEvent = HighBar;
                                break;
                        case 7:
                                targetEvent = UnevenBars;
                                break;
                        case 8:
                                targetEvent = BalanceBeam;
                                break;
                }

                for (Competitor comp : targetEvent.getCompetitors()) {
                        for (Attempt att : comp.getAttempts()) {
                                if (att.getForEvent().equals(targetEvent)) {
                                        System.out.println("Name: " + comp.getName());
                                        System.out.println("Description: " + att.getRoutine().getDescription());
                                        System.out.println(
                                                        "Difficulty Rating: " + att.getRoutine().getDifficultyRating());
                                        System.out.println("Score: " + att.getScore());
                                }
                        }
                }

        }
}
