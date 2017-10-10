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
            StoreItemNode tempPrevNode = null;
            while(tempCurrentNode.getNext()!=null){
                tempPrevNode = tempCurrentNode;
                tempCurrentNode=tempCurrentNode.getNext();
            }
            tempCurrentNode.setNext(tempItem);
            tempCurrentNode.setPrevious(tempPrevNode);
            if(tempPrevNode==null){
                System.out.println("NULL");
            }
            else
                System.out.println("NOT NULL");
        }
        
        
    }

    public void sellItem(){
        if(currentNode!=null){
            currentNode.sellItem();
            if(currentNode.previousNode!=null&&currentNode.nextNode!=null){
                
                currentNode.previousNode.nextNode=currentNode.nextNode;
                currentNode.nextNode.previousNode=currentNode.previousNode;
                currentNode=currentNode.nextNode;
            }
            else if(currentNode.getPrevious()==null&&currentNode.getNext()!=null){
                root=currentNode.getNext();
                currentNode=root;
            }
            else if(currentNode.getPrevious()!=null&&currentNode.getNext()==null){
                currentNode.previousNode.nextNode=null;
                currentNode=currentNode.previousNode;
            }
            else if(currentNode.getPrevious()==null&&currentNode.getNext()==null){
                //currentNode=null;
                root=null;
            }
        }
        else return;
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
//        if(currentNode.previousNode!=null){
//            currentNode=currentNode.previousNode;
//        }
//        
        if(currentNode==null&&root!=null){
            currentNode=root;
        }
        else if(currentNode.previousNode!=null){
            currentNode=currentNode.previousNode;
        }
    }

    public StoreItem getCurrent(){
        return currentNode.getItem();
    }
}
