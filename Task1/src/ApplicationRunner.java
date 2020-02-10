
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class ApplicationRunner {
    
    static ArrayList<Trader> traders = new ArrayList<>();

    public static void main(String[] args) {
        readFile();
        for (Trader trader : traders){
            System.out.println(trader.toString());
        }
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

}
