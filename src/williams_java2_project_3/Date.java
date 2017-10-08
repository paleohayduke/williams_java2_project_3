/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package williams_java2_project_3;

/**
 *
 * @author PALEOHAYDUKE
 */
public class Date {
    private int[] date = new int[3]; //0=day;1=month;2=year;
    
    Date(int day, int month, int year){
        setDate(day,month,year);
        
    }
    
    public void setDate(int day, int month, int year){
        date[0]=day;
        date[1]=month;
        date[2]=year;
    }
    
    public int getDay(){
        return date[0];
    }
    
    public int getMonth(){
        return date[1];
    }
    
    public int getYear(){
        return date[2];
    }
    
    public String printableString(){
        String output = date[0]+"-"+date[1]+"-"+date[2];//TODO
        return output;
    }
    
    
}
