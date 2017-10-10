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
public class StoreItemNode {
    final private StoreItem thisItem;
    public StoreItemNode nextNode;     //public while deving it, change to priv
    public StoreItemNode previousNode; //and use functions later
    StoreItemNode(StoreItem item){
        thisItem=item;
        nextNode=null;
        previousNode=null;
    }
    public void setNext(StoreItemNode next){
        nextNode = next;
    }
    public StoreItemNode getNext(){
        return nextNode;
    }
    public void setPrevious(StoreItemNode previous){
        previousNode= previous;
    }
    public StoreItemNode getPrevious(){
        return previousNode;
    }
    public StoreItem getItem(){
        return thisItem;
    }
    
    public void sellItem(){
        thisItem.remove();
    }
}
