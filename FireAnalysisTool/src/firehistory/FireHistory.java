/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firehistory;
import java.io.*;

import java.util.List;

/**
 *
 * @author cmo
 */
public class FireHistory {

    private String file_name;

    private String name_of_site;
    private String site_code;
    private String collection_date;
    private String collectors;
    private String crossdaters;
    private String number_samples;
    private String species_name;
    private String common_name;
    private String habitat_type;
    private String country;
    private String state;
    private String county;
    private String park_monument;
    private String national_forest;
    private String ranger_district;
    private String township;
    private String range;
    private String section;
    private String quarter_section;
    private String utm_easting;
    private String utm_northing;
    private String latitude;
    private String longitude;
    private String topographic_map;
    private String lowest_elev;
    private String highest_elev;
    private String slope;
    private String aspect;
    private String area_sampled;
    private String substrate_type;
    private String comment;
    
    private String begin_year;
    private String end_year;
    private String number_of_samples;
    private String id_length;

    private List<Series> series;

    /**
     *
     */
    public FireHistory(String filePath) 
    {
        ReadFile(filePath);
    }
    
    public FireHistory() 
    {
        
    }
    
    private void ReadFile(String fileName)
    {
        try
        {
            FileInputStream fStream = new FileInputStream(fileName);
            BufferedReader in = new BufferedReader(new InputStreamReader(fStream));
            String[] nextLine = new String[2];
            while(in.ready())
            {
               nextLine = in.readLine().split(":");
               if( nextLine[0].replaceAll("\\s","").compareTo("Nameofsite") == 0)
               {
                   name_of_site = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Sitecode") == 0)
               {
                   site_code = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Collectiondate") == 0)
               {
                   collection_date = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Collectors") == 0)
               {
                   collectors = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Crossdaters") == 0)
               {
                   crossdaters = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Numbersamples") == 0)
               {
                   number_samples = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Speciesname") == 0)
               {
                   species_name = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Commonname") == 0)
               {
                   common_name = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Habitattype") == 0)
               {
                   habitat_type = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Country") == 0)
               {
                   country = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("State") == 0)
               {
                   state = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("County") == 0)
               {
                   county = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Park/Monument") == 0)
               {
                   park_monument = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("NationalForest") == 0)
               {
                   national_forest = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Rangerdistrict") == 0)
               {
                   ranger_district = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Township") == 0)
               {
                   township = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Range") == 0)
               {
                   range = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Section") == 0)
               {
                   section = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Quartersection") == 0)
               {
                   quarter_section = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("UTMeasting") == 0)
               {
                   utm_easting = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("UTMnorthing") == 0)
               {
                   utm_northing = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Latitude") == 0)
               {
                   latitude = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Longitude") == 0)
               {
                   longitude = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Topographicmap") == 0)
               {
                   topographic_map = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Lowestelev") == 0)
               {
                   lowest_elev = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Highestelev") == 0)
               {
                   highest_elev = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Slope") == 0)
               {
                   slope = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Aspect") == 0)
               {
                   aspect = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Areasampled") == 0)
               {
                   area_sampled = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Substratetype") == 0)
               {
                   substrate_type = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Begincomments") == 0)
               {
                   String commentWhole = nextLine[1];
                   String commentLine = in.readLine();
                   while(commentLine.compareTo("End comments   :") != 0)
                   {
                       commentWhole += "/n" + commentLine;
                       commentLine = in.readLine();
                   }
                   comment = commentWhole;

               }    
               if( nextLine[0].replaceAll("\\s","").compareTo("Name of site") == 0)
               {
                   begin_year = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Name of site") == 0)
               {
                   number_of_samples = nextLine[1];
               }
               if( nextLine[0].replaceAll("\\s","").compareTo("Name of site") == 0)
               {
                   id_length = nextLine[1];
               }
               
               
            }
        }        
        catch (IOException e) 
        {
            System.out.println("File input error");
        }
        System.out.println("Ran succsess!");
        
    }
}
