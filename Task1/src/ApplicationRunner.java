// Imports

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationRunner {

    // Create a global ArrayList to hold the contents of the file
    static ArrayList<Trader> traders = new ArrayList<>();

    public static void main(String[] args) {
        readFile();
        menu();
    }

    // Reads file into input line by line
    static void readFile() {
        String dataFile = System.getProperty("user.dir") + File.separator + "traders.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(dataFile));
            String line;
            int ID = 1;
            while ((line = br.readLine()) != null) {
// Splits line of text by : character
                String[] array = line.split(":");

// Creates new Trader Object using the contents of the file and an ID attribute to identify the entries
                Trader newTrader = new Trader(ID, array[0], array[1], array[2], Integer.parseInt(array[3]), Double.parseDouble(array[4]), array[5]);

// Inserts new object into ArrayList
                traders.add(newTrader);
                ID++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    static void menu() {
        // Creates scanner, takes input from user and runs appropriate action based on input followed by menu again
        Scanner input = new Scanner(System.in);
        System.out.println("List traders.......1");
        System.out.println("Select trader .....2");
        System.out.println("Search locations...3");
        System.out.println("Search services....4");
        System.out.println("Exit...............0");
        System.out.println("");
        System.out.print("Enter choice:>");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                listTraders();
                menu();
            case 2:
                selectTrader();
                menu();
            case 3:
                searchLocations();
                menu();
            case 4:
                searchServices();
                menu();
            case 0:
                System.exit(0);
            default:
                menu();

        }
    }
    
    // Formats the data to appear as a table
    static String rightpad(String text, int length) {
        return String.format("%-" + length + "." + length + "s", text);
    }
    
    // Loops through ArrayList and prints out content
    static void listTraders() {
        System.out.println("ID " + rightpad("Company name", 20) + rightpad("Location", 20) + rightpad("Services Offered", 50));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        for (Trader trader : traders) {
            StringBuilder str = new StringBuilder(93);
            str.append(rightpad(String.valueOf(trader.getID()), 3));
            str.append(rightpad(trader.getCompanyName(), 25));
            str.append(rightpad(trader.getLocation(), 20));
            str.append(rightpad(trader.getServices(), 70));
            System.out.println(str.toString());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
    }

    // Runs the toString method of the chosen Trader
    static void selectTrader() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter trader ID from list [1 - 25] :>");
        int choice = input.nextInt();
        System.out.println(traders.get(choice - 1).toString());
    }

    // Takes input from the user and outputs all Traders whose location contains the input string
    static void searchLocations() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter search text >");
        String choice = input.next();
        ArrayList<Trader> results = new ArrayList<>();
        for (Trader trader : traders) {
            if (trader.getLocation().toLowerCase().contains(choice.toLowerCase())) {
                results.add(trader);
            }
        }

        System.out.println("ID " + rightpad("Company name", 20) + rightpad("Location", 20) + rightpad("Services Offered", 50));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        for (Trader trader : results) {
            StringBuilder str = new StringBuilder(93);
            str.append(rightpad(String.valueOf(trader.getID()), 3));
            str.append(rightpad(trader.getCompanyName(), 25));
            str.append(rightpad(trader.getLocation(), 20));
            str.append(rightpad(trader.getServices(), 70));
            System.out.println(str.toString());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
    }

    // Takes input from the user and outputs all Traders whose services contains the input string
    static void searchServices() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter search text >");
        String choice = input.next();
        ArrayList<Trader> results = new ArrayList<>();
        for (Trader trader : traders) {
            if (trader.getServices().toLowerCase().contains(choice.toLowerCase())) {
                results.add(trader);
            }
        }

        System.out.println("ID " + rightpad("Company name", 20) + rightpad("Location", 20) + rightpad("Services Offered", 50));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        for (Trader trader : results) {
            StringBuilder str = new StringBuilder(93);
            str.append(rightpad(String.valueOf(trader.getID()), 3));
            str.append(rightpad(trader.getCompanyName(), 25));
            str.append(rightpad(trader.getLocation(), 20));
            str.append(rightpad(trader.getServices(), 70));
            System.out.println(str.toString());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
    }
}
