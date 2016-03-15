/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firehistory;

import java.io.*;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cmo
 */
public class FireHistory {

    private String file_path;
    
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
    public FireHistory(String filePath) {
        file_path = filePath;
        ReadFile(filePath);
    }
    
    public FireHistory() {
    }
    
    public FireHistory(String begining_year, String ending_year, String numberOfSamples, 
            String SampleIDLength, String siteName, String fileName, String folderPath) {
        begin_year = begining_year;
        end_year = ending_year;
        number_of_samples = numberOfSamples;
        name_of_site = siteName;
        id_length = SampleIDLength;
        file_path = folderPath + "/" + fileName;
    }


    public FireHistory(String filePath, Scanner user_input) {
        file_path = filePath;//getInput(user_input, "File Name");
        name_of_site = getInput(user_input, "Name of Site");
        site_code = getInput(user_input, "Site Code");
        collection_date = getInput(user_input, "Collection Date");
        collectors = getInput(user_input, "Collectors");
        crossdaters = getInput(user_input, "Crossdaters");
        number_samples = getInput(user_input, "Number Samples");
        species_name = getInput(user_input, "Species Name");
        common_name = getInput(user_input, "Common Name");
        habitat_type = getInput(user_input, "Habitat Type");
        country = getInput(user_input, "Country");
        state = getInput(user_input, "State");
        county = getInput(user_input, "County");
        park_monument = getInput(user_input, "Park Monument");
        national_forest = getInput(user_input, "National Forest");
        ranger_district = getInput(user_input, "Ranger_district");
        township = getInput(user_input, "Township");
        range = getInput(user_input, "Range");
        section = getInput(user_input, "Section");
        quarter_section = getInput(user_input, "Quarter Section");
        utm_easting = getInput(user_input, "Utm Easting");
        latitude = getInput(user_input, "Latitude");
        longitude = getInput(user_input, "Longitude");
        topographic_map = getInput(user_input, "Topographic Map");
        lowest_elev = getInput(user_input, "Lowest Elev");
        highest_elev = getInput(user_input, "Highest Elev");
        slope = getInput(user_input, "Slope");
        aspect = getInput(user_input, "Aspect");
        area_sampled = getInput(user_input, "Area Sampled");
        substrate_type = getInput(user_input, "Substrate Type");
        comment = getInput(user_input, "Comment");
        begin_year = getInput(user_input, "Begin Year");
        end_year = getInput(user_input, "End Year");
        number_of_samples = getInput(user_input, "Number of Samples");
        id_length = getInput(user_input, "ID Length");
        //TODO: Save File.
    }

    private static String getInput(Scanner user_input, String prompt) {
        String input;
        System.out.print(prompt + ": ");
        input = user_input.next();
        return input;
    }

    private void ReadFile(String fileName) {
        try {
            file_path = fileName;
            FileInputStream fStream = new FileInputStream(file_path);
            BufferedReader in = new BufferedReader(new InputStreamReader(fStream));
            String[] nextLine = new String[2];
            while (in.ready()) {
                nextLine = in.readLine().split(":");
                if (nextLine[0].replaceAll("\\s", "").compareTo("Nameofsite") == 0) {
                    name_of_site = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Sitecode") == 0) {
                    site_code = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Collectiondate") == 0) {
                    collection_date = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Collectors") == 0) {
                    collectors = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Crossdaters") == 0) {
                    crossdaters = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Numbersamples") == 0) {
                    number_samples = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Speciesname") == 0) {
                    species_name = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Commonname") == 0) {
                    common_name = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Habitattype") == 0) {
                    habitat_type = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Country") == 0) {
                    country = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("State") == 0) {
                    state = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("County") == 0) {
                    county = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Park/Monument") == 0) {
                    park_monument = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("NationalForest") == 0) {
                    national_forest = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Rangerdistrict") == 0) {
                    ranger_district = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Township") == 0) {
                    township = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Range") == 0) {
                    range = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Section") == 0) {
                    section = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Quartersection") == 0) {
                    quarter_section = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("UTMeasting") == 0) {
                    utm_easting = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("UTMnorthing") == 0) {
                    utm_northing = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Latitude") == 0) {
                    latitude = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Longitude") == 0) {
                    longitude = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Topographicmap") == 0) {
                    topographic_map = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Lowestelev") == 0) {
                    lowest_elev = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Highestelev") == 0) {
                    highest_elev = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Slope") == 0) {
                    slope = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Aspect") == 0) {
                    aspect = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Areasampled") == 0) {
                    area_sampled = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Substratetype") == 0) {
                    substrate_type = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Begincomments") == 0) {
                    String commentWhole = nextLine[1];
                    String commentLine = in.readLine();
                    while (commentLine.compareTo("End comments   :") != 0) {
                        commentWhole += "/n" + commentLine;
                        commentLine = in.readLine();
                    }
                    comment = commentWhole;

                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Name of site") == 0) {
                    begin_year = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Name of site") == 0) {
                    number_of_samples = nextLine[1];
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Name of site") == 0) {
                    id_length = nextLine[1];
                }

            }
        } catch (IOException e) {
            System.out.println("File input error");
        }
    }

    public void SaveFile() {
        FileOutputStream outFile;
        PrintStream printer;
        try {
            outFile = new FileOutputStream(file_path);
            printer = new PrintStream(outFile);
            printer.println("Name of site   : " + name_of_site);
            printer.println("Site code      : " + site_code);
            printer.println("Collection date: " + collection_date);
            printer.println("Collectors     : " + collectors);
            printer.println("Crossdaters    : " + crossdaters);
            printer.println("Number samples : " + number_samples);
            printer.println("Species name   : " + species_name);
            printer.println("Common name    : " + common_name);
            printer.println("Habitat type   : " + habitat_type);
            printer.println("Country        : " + country);
            printer.println("State          : " + state);
            printer.println("County         : " + county);
            printer.println("Park/Monument  : " + park_monument);
            printer.println("National Forest: " + national_forest);
            printer.println("Ranger district: " + ranger_district);
            printer.println("Township       : " + township);
            printer.println("Range          : " + range);
            printer.println("Section        : " + section);
            printer.println("Quarter section: " + quarter_section);
            printer.println("UTM easting    : " + utm_easting);
            printer.println("UTM northing   : " + utm_northing);
            printer.println("Latitude       : " + latitude);
            printer.println("Longitude      : " + longitude);
            printer.println("Topographic map: " + topographic_map);
            printer.println("Lowest elev    : " + lowest_elev);
            printer.println("Highest elev   : " + highest_elev);
            printer.println("Slope          : " + slope);
            printer.println("Aspect         : " + aspect);
            printer.println("Area sampled   : " + area_sampled);
            printer.println("Substrate type : " + substrate_type);
            printer.println("Begin comments : " + comment);
            printer.println("End comments   :");
            printer.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FireHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param fileName
     */
    public void OpenFile(String fileName) {
        try {
            file_path = fileName;
            FileInputStream fStream = new FileInputStream(file_path);
            BufferedReader in = new BufferedReader(new InputStreamReader(fStream));
            String[] nextLine = new String[2];
            while (in.ready()) {
                nextLine = in.readLine().split(":");
                if (nextLine[0].replaceAll("\\s", "").compareTo("Nameofsite") == 0) {
                    name_of_site = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Sitecode") == 0) {
                    site_code = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Collectiondate") == 0) {
                    collection_date = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Collectors") == 0) {
                    collectors = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Crossdaters") == 0) {
                    crossdaters = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Numbersamples") == 0) {
                    number_samples = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Speciesname") == 0) {
                    species_name = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Commonname") == 0) {
                    common_name = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Habitattype") == 0) {
                    habitat_type = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Country") == 0) {
                    country = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("State") == 0) {
                    state = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("County") == 0) {
                    county = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Park/Monument") == 0) {
                    park_monument = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("NationalForest") == 0) {
                    national_forest = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Rangerdistrict") == 0) {
                    ranger_district = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Township") == 0) {
                    township = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Range") == 0) {
                    range = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Section") == 0) {
                    section = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Quartersection") == 0) {
                    quarter_section = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("UTMeasting") == 0) {
                    utm_easting = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("UTMnorthing") == 0) {
                    utm_northing = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Latitude") == 0) {
                    latitude = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Longitude") == 0) {
                    longitude = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Topographicmap") == 0) {
                    topographic_map = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Lowestelev") == 0) {
                    lowest_elev = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Highestelev") == 0) {
                    highest_elev = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Slope") == 0) {
                    slope = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Aspect") == 0) {
                    aspect = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Areasampled") == 0) {
                    area_sampled = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Substratetype") == 0) {
                    substrate_type = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Begincomments") == 0) {
                    String commentWhole = nextLine[1].trim();
                    String commentLine = in.readLine();
                    while (commentLine.compareTo("End comments   :") != 0) {
                        commentWhole += "\n" + commentLine;
                        commentLine = in.readLine();
                    }
                    comment = commentWhole;

                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Name of site") == 0) {
                    begin_year = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Name of site") == 0) {
                    number_of_samples = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Name of site") == 0) {
                    id_length = nextLine[1].trim();
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(FireHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Ran succsess!");

    }
    
    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String getName_of_site() {
        return name_of_site;
    }

    public void setName_of_site(String name_of_site) {
        this.name_of_site = name_of_site;
    }

    public String getSite_code() {
        return site_code;
    }

    public void setSite_code(String site_code) {
        this.site_code = site_code;
    }

    public String getCollection_date() {
        return collection_date;
    }

    public void setCollection_date(String collection_date) {
        this.collection_date = collection_date;
    }

    public String getCollectors() {
        return collectors;
    }

    public void setCollectors(String collectors) {
        this.collectors = collectors;
    }

    public String getCrossdaters() {
        return crossdaters;
    }

    public void setCrossdaters(String crossdaters) {
        this.crossdaters = crossdaters;
    }

    public String getNumber_samples() {
        return number_samples;
    }

    public void setNumber_samples(String number_samples) {
        this.number_samples = number_samples;
    }

    public String getSpecies_name() {
        return species_name;
    }

    public void setSpecies_name(String species_name) {
        this.species_name = species_name;
    }

    public String getCommon_name() {
        return common_name;
    }

    public void setCommon_name(String common_name) {
        this.common_name = common_name;
    }

    public String getHabitat_type() {
        return habitat_type;
    }

    public void setHabitat_type(String habitat_type) {
        this.habitat_type = habitat_type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPark_monument() {
        return park_monument;
    }

    public void setPark_monument(String park_monument) {
        this.park_monument = park_monument;
    }

    public String getNational_forest() {
        return national_forest;
    }

    public void setNational_forest(String national_forest) {
        this.national_forest = national_forest;
    }

    public String getRanger_district() {
        return ranger_district;
    }

    public void setRanger_district(String ranger_district) {
        this.ranger_district = ranger_district;
    }

    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getQuarter_section() {
        return quarter_section;
    }

    public void setQuarter_section(String quarter_section) {
        this.quarter_section = quarter_section;
    }

    public String getUtm_easting() {
        return utm_easting;
    }

    public void setUtm_easting(String utm_easting) {
        this.utm_easting = utm_easting;
    }

    public String getUtm_northing() {
        return utm_northing;
    }

    public void setUtm_northing(String utm_northing) {
        this.utm_northing = utm_northing;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTopographic_map() {
        return topographic_map;
    }

    public void setTopographic_map(String topographic_map) {
        this.topographic_map = topographic_map;
    }

    public String getLowest_elev() {
        return lowest_elev;
    }

    public void setLowest_elev(String lowest_elev) {
        this.lowest_elev = lowest_elev;
    }

    public String getHighest_elev() {
        return highest_elev;
    }

    public void setHighest_elev(String highest_elev) {
        this.highest_elev = highest_elev;
    }

    public String getSlope() {
        return slope;
    }

    public void setSlope(String slope) {
        this.slope = slope;
    }

    public String getAspect() {
        return aspect;
    }

    public void setAspect(String aspect) {
        this.aspect = aspect;
    }

    public String getArea_sampled() {
        return area_sampled;
    }

    public void setArea_sampled(String area_sampled) {
        this.area_sampled = area_sampled;
    }

    public String getSubstrate_type() {
        return substrate_type;
    }

    public void setSubstrate_type(String substrate_type) {
        this.substrate_type = substrate_type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getBegin_year() {
        return begin_year;
    }

    public void setBegin_year(String begin_year) {
        this.begin_year = begin_year;
    }

    public String getEnd_year() {
        return end_year;
    }

    public void setEnd_year(String end_year) {
        this.end_year = end_year;
    }

    public String getNumber_of_samples() {
        return number_of_samples;
    }

    public void setNumber_of_samples(String number_of_samples) {
        this.number_of_samples = number_of_samples;
    }

    public String getId_length() {
        return id_length;
    }

    public void setId_length(String id_length) {
        this.id_length = id_length;
    }
    
    
    
}
