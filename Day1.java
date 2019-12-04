import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.*;

public class Day1 {

    //https://adventofcode.com/2019/day/1

    public static void main(String[] args) throws IOException {

        //read through input file.
        String filename = "C:\\path\\day1_input.txt";

        FileInputStream fstream = new FileInputStream(filename);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fstream));
        int totalFuel = 0;

        try {
            String linein = "";
            int fuel;

            while ((linein = reader.readLine()) != null) {

                fuel = FuelCalc(Integer.parseInt(linein));
                totalFuel = totalFuel + fuel;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
            fstream.close();

            System.out.println(totalFuel);  //Part 1
        }

    }

    public static int FuelCalc(int mass) {

        int fuel = (mass / 3) - 2;

        return fuel;
    }


}
