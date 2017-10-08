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
public class Movie extends StoreItem{
    static private int movieCount = 0;
    private String title;
    private String director;
    private String[] actors;
    private String[] actresses;
    
    Movie(String title, String author, Date dateAcquired, double purchasePrice,
            double askingPrice, String director, String[]actors, String[]actresses){
        super(title, author, dateAcquired,purchasePrice, askingPrice);
        
        movieCount++;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public String getDirector(){
        return director;
    }
    public void setActors(String [] actors){
        this.actors=actors;
    }
    public String[] getActors(){
        return actors;
    }
    public void setActresses(String [] actresses){
        this.actors=actresses;
    }
    public String[] getActresses(){
        return actresses;
    }
    
    public void remove(){
        movieCount--;
    }
    
    public String printableString(){
        String output = "Title: " + title +"\nAuthor: "+author+ "\nDirector: " + 
                director+"\nDate Acquired: " +"INSERT ACTORS AND ACTRESSES"+ dateAcquired.printableString() + 
                "\nPurchase Price: " + purchasePrice + "\nAsking Price: "+
                askingPrice;
        return output;
    }    
}
