package com.company;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            // The list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison <0) {
                // newItem is greater, move right if possible
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    /**
                     * Line 32 is the short of below two commented lines
                     * currentItem.setNext(newItem);
                     * newItem.setPrevious(currentItem) */
                    return true;
                }
            } else if(comparison >0) {
                // newItem is less, insert before
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }

        return false;
    }


    @Override
    public boolean removeItem(ListItem Item) {
        if(Item != null){
            System.out.println("Item to be Delete :"+Item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(Item);
            if(comparison == 0){
                //Found the item to be deleted
                if(currentItem == this.root){
                    this.root = currentItem.next();
                }else{
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }
            else if(comparison < 0){
                //item is greater then currentItem
                currentItem = currentItem.next();
            }else{
                //we're at an item greater than the one to be deleted
                System.out.println(Item.getValue()+ " is not present in the list, can't delete");
                return false;
            }
        }
        // we've reached at the end of the List
        System.out.println(Item.getValue()+ " is not present in the list, can't delete");
        return false;
    }

    @Override
    public void traverse(ListItem root) {
     if(root == null){
         System.out.println("The List is Empty, can't Traverse");
     }else{
         while (root!=null){
             System.out.print(" => "+root.getValue());
             root = root.next();
         }
         System.out.println();
     }
    }
}
