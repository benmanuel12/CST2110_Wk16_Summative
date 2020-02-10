
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationRunner {

    static ArrayList<Trader> traders = new ArrayList<>();

    public static void main(String[] args) {
        readFile();
        menu();

    }

    static void readFile() {
        String dataFile = System.getProperty("user.dir") + File.separator + "traders.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(dataFile));
            String line;

            while ((line = br.readLine()) != null) {
                String[] array = line.split(":");
                Trader newTrader = new Trader(array[0], array[1], array[2], Integer.parseInt(array[3]), Double.parseDouble(array[4]), array[5]);
                traders.add(newTrader);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    static void menu() {
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

    static String rightpad(String text, int length) {
        return String.format("%-" + length + "." + length + "s", text);
    }

    static void listTraders() {
        int id = 1;
        
        System.out.println("ID " + rightpad("Company name", 20) + rightpad("Location", 20) + rightpad("Services Offered", 50));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        for (Trader trader : traders) {
            StringBuilder str = new StringBuilder(93);
            str.append(rightpad(String.valueOf(id), 3));
            str.append(rightpad(trader.getCompanyName(), 25));
            str.append(rightpad(trader.getLocation(), 20));
            str.append(rightpad(trader.getServices(), 70));
            System.out.println(str.toString());
            id++;
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
    }

    static void selectTrader() {

    }

    static void searchLocations() {

    }

    static void searchServices() {

    }
}
