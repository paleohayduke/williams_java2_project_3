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
public class Painting extends StoreItem{
    static int paintingCount=0;
    private int height;
    private int width;
    private String media;
    
    Painting(String title, String author,  Date dateAcquired, double purchasePrice,
            double askingPrice, int height, int width, String media){
        super(title, author, dateAcquired,purchasePrice, askingPrice);
        
        
        paintingCount++;
    }
    
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    public void setMedia(String media){
        this.media=media;
    }
    public String getMedia(){
        return media;
    }
    
    public void remove(){
        paintingCount--;        
    }
    
    public String printableString(){
        String output = "Title: " + title +"\nAuthor: "+author+"\nMedia: "+media+
                "\nHeight:"+height+"\nWidth"+width+
                "\nDate Acquired: " + dateAcquired.printableString() + "\nPurchase Price: " + 
                purchasePrice + "\nAsking Price: "+askingPrice;
        return output;
    }
    
}
