/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JFrame;
import fhx.mainFrame;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author andreskis
 */
public class FHX2_BrennenSucks {

    private static String getInput(Scanner user_input, String prompt) {
        String input;
        System.out.print(prompt + ": ");
        input = user_input.next();
        return input;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0 || args[0].compareTo("gui") == 0) {
            System.out.println("Starting GUI...");
            JFrame f = new mainFrame();
            f.setVisible(true);
        } else if (args[0].compareTo("h") == 0 || args[0].compareTo("help") == 0 || args[0].compareTo("man") == 0) {
            System.out.println("Fire History Man Page");
            System.out.println("");
            System.out.println("Params");
            System.out.println("==============================================");
            System.out.println("-d [file_path] => Print out the file");
            System.out.println("-c             => Create New Fire History");
            System.out.println("-h             => Display the Man Page");
            System.out.println("==============================================");
        } else if (args[0].compareTo("d") == 0 || args[0].compareTo("display") == 0) {
            System.out.println("Display Fire History");
            if (args.length == 2) {
                try {
                    // Open the file that is the first 
                    // command line parameter
                    FileInputStream fstream = new FileInputStream(args[1]);//file path
                    // Get the object of DataInputStream
                    DataInputStream in = new DataInputStream(fstream);
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));
                    String strLine;
                    //Read File Line By Line
                    while ((strLine = br.readLine()) != null) {
                        // Print the content on the console
                        System.out.println(strLine);
                    }
                    //Close the input stream
                    in.close();
                } catch (Exception e) {//Catch exception if any
                    System.err.println("Error: " + e.getMessage());
                }
            } else if (args[0].compareTo("c") == 0 || args[0].compareTo("create") == 0) {
                System.out.println("Create Fire History");
                Scanner user_input = new Scanner(System.in);

                String file_name = getInput(user_input, "File Name");
                String name_of_site = getInput(user_input, "Name of Site");
                String site_code = getInput(user_input, "Site Code");
                String collection_date = getInput(user_input, "Collection Date");
                String collectors = getInput(user_input, "Collectors");
                String crossdaters = getInput(user_input, "Crossdaters");
                String number_samples = getInput(user_input, "Number Samples");
                String species_name = getInput(user_input, "Species Name");
                String common_name = getInput(user_input, "Common Name");
                String habitat_type = getInput(user_input, "Habitat Type");
                String country = getInput(user_input, "Country");
                String state = getInput(user_input, "State");
                String county = getInput(user_input, "County");
                String park_monument = getInput(user_input, "Park Monument");
                String national_forest = getInput(user_input, "National Forest");
                String ranger_district = getInput(user_input, "Ranger_district");
                String township = getInput(user_input, "Township");
                String range = getInput(user_input, "Range");
                String section = getInput(user_input, "Section");
                String quarter_section = getInput(user_input, "Quarter Section");
                String utm_easting = getInput(user_input, "Utm Easting");
                String latitude = getInput(user_input, "Latitude");
                String longitude = getInput(user_input, "Longitude");
                String topographic_map = getInput(user_input, "Topographic Map");
                String lowest_elev = getInput(user_input, "Lowest Elev");
                String highest_elev = getInput(user_input, "Highest Elev");
                String slope = getInput(user_input, "Slope");
                String aspect = getInput(user_input, "Aspect");
                String area_sampled = getInput(user_input, "Area Sampled");
                String substrate_type = getInput(user_input, "Substrate Type");
                String comment = getInput(user_input, "Comment");
                String begin_year = getInput(user_input, "Begin Year");
                String end_year = getInput(user_input, "End Year");
                String number_of_samples = getInput(user_input, "Number of Samples");
                String id_length = getInput(user_input, "ID Length");
            } else {
                System.out.println("ERROR: No File Specifided");
            }
        }
    }
}
