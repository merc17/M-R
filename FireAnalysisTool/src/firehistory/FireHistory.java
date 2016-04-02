/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firehistory;

import java.io.*;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cmo
 */
public class FireHistory {

    private String filePath;

    private String nameOfSite;
    private String siteCode;
    private String collectionDate;
    private String collectors;
    private String crossdaters;
    private int numOfSamples;
    private String speciesName;
    private String commonName;
    private String habitatType;
    private String country;
    private String state;
    private String county;
    private String parkMonument;
    private String nationalForest;
    private String rangerDistrict;
    private String township;
    private String range;
    private String section;
    private String quarterSection;
    private String utmEasting;
    private String utmNorthing;
    private String latitude;
    private String longitude;
    private String topographicMap;
    private String lowestElev;
    private String highestElev;
    private String slope;
    private String aspect;
    private String areaSampled;
    private String substrateType;
    private String comment;

    private String fileFormat;

    private String beginYear;
    private String endYear = "0";
    private String numberOfSamples;
    private String idLength;

    private List<Series> series;

    /**
     *
     */
    public FireHistory(String filePath) {
        this.filePath = filePath;
        series = new ArrayList<Series>();
        ReadFile(filePath);
    }

    public FireHistory() {
    }

    public FireHistory(String begining_year, String ending_year, String numberOfSamples,
            String SampleIDLength, String siteName, String fileName, String folderPath) {
        beginYear = begining_year;
        endYear = ending_year;
        this.numberOfSamples = numberOfSamples;
        nameOfSite = siteName;
        idLength = SampleIDLength;
        filePath = folderPath + "/" + fileName;
    }

    public FireHistory(String filePath, Scanner user_input) {
        this.filePath = filePath;//getInput(user_input, "File Name");
        nameOfSite = getInput(user_input, "Name of Site");
        siteCode = getInput(user_input, "Site Code");
        collectionDate = getInput(user_input, "Collection Date");
        collectors = getInput(user_input, "Collectors");
        crossdaters = getInput(user_input, "Crossdaters");
        numOfSamples = Integer.parseInt(getInput(user_input, "Number Samples"));
        speciesName = getInput(user_input, "Species Name");
        commonName = getInput(user_input, "Common Name");
        habitatType = getInput(user_input, "Habitat Type");
        country = getInput(user_input, "Country");
        state = getInput(user_input, "State");
        county = getInput(user_input, "County");
        parkMonument = getInput(user_input, "Park Monument");
        nationalForest = getInput(user_input, "National Forest");
        rangerDistrict = getInput(user_input, "Ranger_district");
        township = getInput(user_input, "Township");
        range = getInput(user_input, "Range");
        section = getInput(user_input, "Section");
        quarterSection = getInput(user_input, "Quarter Section");
        utmEasting = getInput(user_input, "Utm Easting");
        latitude = getInput(user_input, "Latitude");
        longitude = getInput(user_input, "Longitude");
        topographicMap = getInput(user_input, "Topographic Map");
        lowestElev = getInput(user_input, "Lowest Elev");
        highestElev = getInput(user_input, "Highest Elev");
        slope = getInput(user_input, "Slope");
        aspect = getInput(user_input, "Aspect");
        areaSampled = getInput(user_input, "Area Sampled");
        substrateType = getInput(user_input, "Substrate Type");
        comment = getInput(user_input, "Comment");
        beginYear = getInput(user_input, "Begin Year");
        endYear = getInput(user_input, "End Year");
        numberOfSamples = getInput(user_input, "Number of Samples");
        idLength = getInput(user_input, "ID Length");
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
            filePath = fileName;
            FileInputStream fStream = new FileInputStream(filePath);
            BufferedReader in = new BufferedReader(new InputStreamReader(fStream));
            boolean keyValuePairs = true;
            while (in.ready() && keyValuePairs) {
                String nextLineStr = in.readLine();
                if (nextLineStr.compareTo("Begin comments BELOW this line:") == 0) {
                    comment = "";
                    String commentLine = in.readLine();
                    while (commentLine.compareTo("End comments ABOVE this line:") != 0) {
                        comment += '\n' + commentLine;
                        commentLine = in.readLine();
                    }
                    keyValuePairs = false;
                } else {
                    String[] nextLine = new String[2];
                    nextLine = nextLineStr.split(":");
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Nameofsite") == 0) {
                        nameOfSite = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Sitecode") == 0) {
                        siteCode = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Collectiondate") == 0) {
                        collectionDate = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Collectors") == 0) {
                        collectors = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Crossdaters") == 0) {
                        crossdaters = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Numbersamples") == 0) {
                        numOfSamples = Integer.parseInt(nextLine[1].trim());
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Speciesname") == 0) {
                        speciesName = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Commonname") == 0) {
                        commonName = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Habitattype") == 0) {
                        habitatType = nextLine[1].trim();
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
                        parkMonument = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("NationalForest") == 0) {
                        nationalForest = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Rangerdistrict") == 0) {
                        rangerDistrict = nextLine[1].trim();
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
                        quarterSection = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("UTMeasting") == 0) {
                        utmEasting = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("UTMnorthing") == 0) {
                        utmNorthing = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Latitude") == 0) {
                        latitude = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Longitude") == 0) {
                        longitude = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Topographicmap") == 0) {
                        topographicMap = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Lowestelev") == 0) {
                        lowestElev = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Highestelev") == 0) {
                        highestElev = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Slope") == 0) {
                        slope = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Aspect") == 0) {
                        aspect = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Areasampled") == 0) {
                        areaSampled = nextLine[1].trim();
                    }
                    if (nextLine[0].replaceAll("\\s", "").compareTo("Substratetype") == 0) {
                        substrateType = nextLine[1].trim();
                    }
                }
            }
            //Get the file format
            String line = in.readLine();
            while (line.contentEquals("")) {
                line = in.readLine();
            }
            fileFormat = line;
            // Get the start year, Number of years, and series length.
            line = in.readLine();
            while (line.contentEquals("")) {
                line = in.readLine();
            }
            String[] elements = new String[3];
            elements = line.split(" ");
            beginYear = elements[0];
            numberOfSamples = elements[1];
            idLength = elements[2];
            //Read in the key ids
            String idLine = in.readLine();
            int numIds = idLine.length();
            for (int i = 0; i < numIds; i++) {
                Series e = new Series(Integer.parseInt(beginYear));
                series.add(e);
            }
            while (!"".equals(idLine)) {
                for (int i = 0; i < numIds; i++) {
                    series.get(i).appendToID(idLine.charAt(i));
                }
                idLine = in.readLine();
            }
            //Read in the Series
            String seriesLine = in.readLine();
            while (!seriesLine.contentEquals("")) {
                String[] seriesElements = new String[3];
                seriesElements = seriesLine.split(" ");
                for (int i = 0; i < numIds; i++) {
                    series.get(i).appendToRecord(seriesElements[0].charAt(i));
                }
                endYear = seriesElements[1].trim();
                seriesLine = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("File input error");
        }
    }

    public void SaveFile() {
        FileOutputStream outFile;
        PrintStream printer;
        try {
            outFile = new FileOutputStream(filePath);
            printer = new PrintStream(outFile);
            printer.println("Name of site   : " + nameOfSite);
            printer.println("Site code      : " + siteCode);
            printer.println("Collection date: " + collectionDate);
            printer.println("Collectors     : " + collectors);
            printer.println("Crossdaters    : " + crossdaters);
            printer.println("Number samples : " + numOfSamples);
            printer.println("Species name   : " + speciesName);
            printer.println("Common name    : " + commonName);
            printer.println("Habitat type   : " + habitatType);
            printer.println("Country        : " + country);
            printer.println("State          : " + state);
            printer.println("County         : " + county);
            printer.println("Park/Monument  : " + parkMonument);
            printer.println("National Forest: " + nationalForest);
            printer.println("Ranger district: " + rangerDistrict);
            printer.println("Township       : " + township);
            printer.println("Range          : " + range);
            printer.println("Section        : " + section);
            printer.println("Quarter section: " + quarterSection);
            printer.println("UTM easting    : " + utmEasting);
            printer.println("UTM northing   : " + utmNorthing);
            printer.println("Latitude       : " + latitude);
            printer.println("Longitude      : " + longitude);
            printer.println("Topographic map: " + topographicMap);
            printer.println("Lowest elev    : " + lowestElev);
            printer.println("Highest elev   : " + highestElev);
            printer.println("Slope          : " + slope);
            printer.println("Aspect         : " + aspect);
            printer.println("Area sampled   : " + areaSampled);
            printer.println("Substrate type : " + substrateType);
            printer.print("Begin comments BELOW this line:");
            printer.println(comment);
            printer.println("End comments ABOVE this line:");
            printer.println("");
            printer.println(fileFormat);
            printer.println(beginYear + " " + numberOfSamples + " " + idLength);

            int keyLength = Integer.parseInt(idLength);
            for (int i = 0; i < keyLength; i++) {
                for (int index = 0; index < series.size(); index++) {
                    printer.print(series.get(index).getIdCharAt(i));
                }
                printer.println();
            }
            printer.println();
            int numSeries = series.size();
            int year = Integer.parseInt(beginYear);
            int _endYear = Integer.parseInt(endYear) - year;
            for (int i = 0; i <= _endYear; i++) {
                for (int index = 0; index < series.size(); index++) {
                    printer.print(series.get(index).getRedordCharAt(i));
                }
                printer.print(" " + year + '\n');
                year++;
            }
            printer.println();
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
            filePath = fileName;
            FileInputStream fStream = new FileInputStream(filePath);
            BufferedReader in = new BufferedReader(new InputStreamReader(fStream));
            String[] nextLine = new String[2];
            while (in.ready()) {
                nextLine = in.readLine().split(":");
                if (nextLine[0].replaceAll("\\s", "").compareTo("Nameofsite") == 0) {
                    nameOfSite = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Sitecode") == 0) {
                    siteCode = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Collectiondate") == 0) {
                    collectionDate = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Collectors") == 0) {
                    collectors = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Crossdaters") == 0) {
                    crossdaters = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Numbersamples") == 0) {
                    numOfSamples = Integer.parseInt(nextLine[1].trim());
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Speciesname") == 0) {
                    speciesName = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Commonname") == 0) {
                    commonName = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Habitattype") == 0) {
                    habitatType = nextLine[1].trim();
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
                    parkMonument = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("NationalForest") == 0) {
                    nationalForest = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Rangerdistrict") == 0) {
                    rangerDistrict = nextLine[1].trim();
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
                    quarterSection = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("UTMeasting") == 0) {
                    utmEasting = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("UTMnorthing") == 0) {
                    utmNorthing = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Latitude") == 0) {
                    latitude = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Longitude") == 0) {
                    longitude = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Topographicmap") == 0) {
                    topographicMap = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Lowestelev") == 0) {
                    lowestElev = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Highestelev") == 0) {
                    highestElev = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Slope") == 0) {
                    slope = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Aspect") == 0) {
                    aspect = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Areasampled") == 0) {
                    areaSampled = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Substratetype") == 0) {
                    substrateType = nextLine[1].trim();
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
                    beginYear = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Name of site") == 0) {
                    numberOfSamples = nextLine[1].trim();
                }
                if (nextLine[0].replaceAll("\\s", "").compareTo("Name of site") == 0) {
                    idLength = nextLine[1].trim();
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(FireHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Ran succsess!");

    }

    public String getFile_path() {
        return filePath;
    }

    public void setFile_path(String file_path) {
        this.filePath = file_path;
    }

    public String getNameOfSite() {
        return nameOfSite;
    }

    public void setNameOfSite(String nameOfSite) {
        this.nameOfSite = nameOfSite;
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public String getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(String collectionDate) {
        this.collectionDate = collectionDate;
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

    public int getNumOfSamples() {
        return numOfSamples;
    }

    public void setNumOfSamples(int number_samples) {
        this.numOfSamples = number_samples;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getHabitatType() {
        return habitatType;
    }

    public void setHabitatType(String habitatType) {
        this.habitatType = habitatType;
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

    public String getParkMonument() {
        return parkMonument;
    }

    public void setParkMonument(String parkMonument) {
        this.parkMonument = parkMonument;
    }

    public String getNationalForest() {
        return nationalForest;
    }

    public void setNationalForest(String nationalForest) {
        this.nationalForest = nationalForest;
    }

    public String getRangerDistrict() {
        return rangerDistrict;
    }

    public void setRangerDistrict(String rangerDistrict) {
        this.rangerDistrict = rangerDistrict;
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

    public String getQuarterSection() {
        return quarterSection;
    }

    public void setQuarterSection(String quarterSection) {
        this.quarterSection = quarterSection;
    }

    public String getUtmEasting() {
        return utmEasting;
    }

    public void setUtmEasting(String utmEasting) {
        this.utmEasting = utmEasting;
    }

    public String getUtmNorthing() {
        return utmNorthing;
    }

    public void setUtmNorthing(String utmNorthing) {
        this.utmNorthing = utmNorthing;
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

    public String getTopographicMap() {
        return topographicMap;
    }

    public void setTopographicMap(String topographicMap) {
        this.topographicMap = topographicMap;
    }

    public String getLowestElev() {
        return lowestElev;
    }

    public void setLowestElev(String lowestElev) {
        this.lowestElev = lowestElev;
    }

    public String getHighestElev() {
        return highestElev;
    }

    public void setHighestElev(String highestElev) {
        this.highestElev = highestElev;
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

    public String getAreaSampled() {
        return areaSampled;
    }

    public void setAreaSampled(String areaSampled) {
        this.areaSampled = areaSampled;
    }

    public String getSubstrateType() {
        return substrateType;
    }

    public void setSubstrateType(String substrateType) {
        this.substrateType = substrateType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getBeginYear() {
        return beginYear;
    }

    public void setBeginYear(String beginYear) {
        this.beginYear = beginYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getNumberOfSamples() {
        return numberOfSamples;
    }

    public void setNumberOfSamples(String numberOfSamples) {
        this.numberOfSamples = numberOfSamples;
    }

    public String getIdLength() {
        return idLength;
    }

    public void setIdLength(String idLength) {
        this.idLength = idLength;
    }

}
