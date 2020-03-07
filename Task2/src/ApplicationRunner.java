import java.util.Scanner;

public class ApplicationRunner {

        Competition theOneAndOnly = new Competition();

        static CommitteeMember member0 = new CommitteeMember("Ajani Goldmane");
        static CommitteeMember member1 = new CommitteeMember("Tacenda Verlasen");

        static Event FloorExerciseMale = new Event("Floor Exercise - Male", "male", 1,
                        new CommitteeMember[] { member0, null });
        static Event PommelHorseMale = new Event("Pommel Horse - Male", "male", 1,
                        new CommitteeMember[] { member0, null });
        static Event StillRingsMale = new Event("Still Rings - Male", "male", 1,
                        new CommitteeMember[] { member0, null });
        static Event VaultMale = new Event("Vault - Male", "male", 2, new CommitteeMember[] { member0, null });
        static Event ParallelBarsMale = new Event("Parallel Bars - Male", "male", 1,
                        new CommitteeMember[] { member0, null });
        static Event HighBarMale = new Event("High Bar - Male", "male", 1, new CommitteeMember[] { member0, null });
        static Event VaultFemale = new Event("Vault - Female", "female", 2, new CommitteeMember[] { member1, null });
        static Event UnevenBarsFemale = new Event("Uneven Bars - Female", "female", 1,
                        new CommitteeMember[] { member1, null });
        static Event BalanceBeamFemale = new Event("Balance Beam - Female", "female", 1,
                        new CommitteeMember[] { member1, null });
        static Event FloorExerciseFemale = new Event("Floor Exercise - Female", "female", 1,
                        new CommitteeMember[] { member1, null });

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
        static Attempt A3 = new Attempt(23, PommelHorseMale, PHM1); // C1
        static Attempt A4 = new Attempt(23, PommelHorseMale, PHM1); // C2
        static Attempt A5 = new Attempt(23, StillRingsMale, SRM1); // C2
        static Attempt A6 = new Attempt(23, StillRingsMale, SRM1); // C3
        static Attempt A7 = new Attempt(23, VaultMale, VM1); // C3
        static Attempt A8 = new Attempt(23, VaultMale, VM2); // C3
        static Attempt A9 = new Attempt(23, VaultMale, VM1); // C4
        static Attempt A10 = new Attempt(23, VaultMale, VM2); // C4
        static Attempt A11 = new Attempt(23, ParallelBarsMale, PBM1); // C4
        static Attempt A12 = new Attempt(23, ParallelBarsMale, PBM1); // C5
        static Attempt A13 = new Attempt(23, HighBarMale, HBM1); // C1
        static Attempt A14 = new Attempt(23, HighBarMale, HBM1); // C5
        static Attempt A15 = new Attempt(23, VaultFemale, VF1); // C6
        static Attempt A16 = new Attempt(23, VaultFemale, VF2); // C6
        static Attempt A17 = new Attempt(23, VaultFemale, VF1); // C7
        static Attempt A18 = new Attempt(23, VaultFemale, VF2); // C7
        static Attempt A19 = new Attempt(23, UnevenBarsFemale, UBF1); // C7
        static Attempt A20 = new Attempt(23, UnevenBarsFemale, UBF1); // C8
        static Attempt A21 = new Attempt(23, BalanceBeamFemale, BBF1); // C8
        static Attempt A22 = new Attempt(23, BalanceBeamFemale, BBF1); // C9
        static Attempt A23 = new Attempt(23, FloorExerciseFemale, FEF1); // C9
        static Attempt A24 = new Attempt(23, FloorExerciseFemale, FEF1); // C10

        public static void main(String[] args) {

                FloorExerciseMale.setCompetitors(new Competitor[] { C1, C3 });
                PommelHorseMale.setCompetitors(new Competitor[] { C1, C2 });
                StillRingsMale.setCompetitors(new Competitor[] { C2, C3 });
                VaultMale.setCompetitors(new Competitor[] { C3, C4 });
                ParallelBarsMale.setCompetitors(new Competitor[] { C4, C5 });
                HighBarMale.setCompetitors(new Competitor[] { C1, C5 });
                VaultFemale.setCompetitors(new Competitor[] { C6, C7 });
                UnevenBarsFemale.setCompetitors(new Competitor[] { C7, C8 });
                BalanceBeamFemale.setCompetitors(new Competitor[] { C8, C9 });
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
                System.out.println(FloorExerciseMale + "....1");
                System.out.println(PommelHorseMale + "....2");
                System.out.println(StillRingsMale + "....3");
                System.out.println(VaultMale + "....4");
                System.out.println(ParallelBarsMale + "....5");
                System.out.println(HighBarMale + "....6");
                System.out.println(VaultFemale + "....7");
                System.out.println(UnevenBarsFemale + "....8");
                System.out.println(BalanceBeamFemale + "....9");
                System.out.println(FloorExerciseFemale + "....10");
                int choice = input.nextInt();
                Event targetEvent = null;
                switch (choice) {
                        case 1:
                                targetEvent = FloorExerciseMale;
                        case 2:
                                targetEvent = PommelHorseMale;
                        case 3:
                                targetEvent = StillRingsMale;
                        case 4:
                                targetEvent = VaultMale;
                        case 5:
                                targetEvent = ParallelBarsMale;
                        case 6:
                                targetEvent = HighBarMale;
                        case 7:
                                targetEvent = VaultFemale;
                        case 8:
                                targetEvent = UnevenBarsFemale;
                        case 9:
                                targetEvent = BalanceBeamFemale;
                        case 10:
                                targetEvent = FloorExerciseFemale;
                }
                System.out.println("This event is for " + targetEvent.getGender() + " competitors");

        }

        // List competitor events
        static void listCompetitorEvents() {

        }

        // List events attempts
        static void listEventsAttempts() {

        }
}
