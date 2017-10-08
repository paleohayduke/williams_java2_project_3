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
public class Book extends StoreItem{
    static int bookCount = 0;
    String title;
    String genre;

    public Book(String title, String author, Date dateAcquired, double purchasePrice,
            double askingPrice, String genre){
        super(title, author, dateAcquired,purchasePrice, askingPrice);
        setTitle(title);
        setGenre(genre);
        bookCount++;
        
//        String title, String author, Date dateAcquired, 
//            double purchasePrice, double askingPrice
        
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public void setGenre(String gengre){
        this.genre=genre;
    }
    
    public void remove(){
        bookCount--;
    }
    
    public String printableString(){
        String output = "Title: " + title +"\nAuthor: "+author+
                "\nDate Acquired: " + dateAcquired.printableString() + "\nPurchase Price: " + 
                purchasePrice + "\nAsking Price: "+askingPrice+"Genre: "+genre;
        return output;
    }
//    title, author, dateAcquired, purchasePrice,askingPrice,genre    
    
}
