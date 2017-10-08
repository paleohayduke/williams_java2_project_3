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
public class StoreHandler {
    StoreItemNode root;
    StoreItemNode currentNode;
    
    StoreHandler(){
        root = null;
        currentNode=null;
    }
    public void addItem(StoreItem item){
        StoreItemNode tempItem = new StoreItemNode(item);
        if(root==null){
            root=tempItem;
        }
        else{
            StoreItemNode tempCurrentNode = root;
            while(tempCurrentNode.getNext()!=null){
                tempCurrentNode=tempCurrentNode.getNext();
            }
            tempCurrentNode.setNext(tempItem);
        }
    }

    public void sellItem(){
        
    }

    public void nextItem(){
        if(currentNode==null&&root!=null||currentNode.getNext()==null){
            currentNode=root;
        }
        else{
            currentNode=currentNode.getNext();
        }

    }
    
    public void previousItem(){
        
    }

    public StoreItem displayCurrent(){
        return currentNode.getItem();
    }
}
