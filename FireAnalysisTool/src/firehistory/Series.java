/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firehistory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cmo
 */
public class Series {

    private String seriesID;
    private int startYear;
    private List<Character> record;

    public Series(int startYear) {
        seriesID = "";
        this.startYear = startYear;
        record = new ArrayList<Character>();
    }
    
    public void appendToID(char ch) {
        seriesID += ch;
    }
    public void appendToRecord(char ch) {
        record.add(ch);
    }
    
    public char getIdCharAt(int index){
        return seriesID.charAt(index);
    }
    public char getRedordCharAt(int index){
        return record.get(index);
    }
}
