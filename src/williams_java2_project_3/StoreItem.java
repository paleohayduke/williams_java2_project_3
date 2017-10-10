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
public class StoreItem {
    protected static int itemCount=0;
    protected String title;
    protected String author;
    protected Date dateAcquired;
    protected double purchasePrice; // req doc asks for int
    protected double askingPrice;
    
    public StoreItem(String title, String author, Date dateAcquired, 
            double purchasePrice, double askingPrice){
        setTitle(title);
        setAuthor(author);
        setDate(dateAcquired);
        setPurchasePrice(purchasePrice);
        setAskingPrice(askingPrice);
        itemCount++;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public String getAuthor(){
        return author;
        
    }
    
    public void setAuthor(String author){
        this.author=author;
    }
    
    public void setDate(Date dateAcquired){
        this.dateAcquired=dateAcquired;
    }
    
    public Date getDate(){
        return dateAcquired;
    }
    
    public void setPurchasePrice(double purchasePrice){
        this.purchasePrice = purchasePrice;
    }
    
    public double getPurchasePrice(){
        return purchasePrice;
    }

    public void setAskingPrice(double askingPrice){
        this.askingPrice = askingPrice;
    }
    
    public double getAskingPrice(){
        return askingPrice;
    }
    
  //  public boolean deal(double custOffer){
        
 //   }
    
    public void remove(){
       itemCount--; 
    }
    
    public String printableString(){
        return "override me";
    };
    
 //   public double calculateComission(double custOffer){
        
//    }
    
    
}
