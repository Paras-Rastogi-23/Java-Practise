package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        String listData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
//        String listData = "5 7 3 9 8 2 1 1 0 4 6";
        String[] listDataArray = listData.split(" ");
        for(String s : listDataArray){
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());
        System.out.println("\n ************************************************************* \n");



        SearchTree tree = new SearchTree(null);
        for(String s : listDataArray){
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());
        System.out.println();
        tree.removeItem(new Node("Darwin"));
        tree.traverse(tree.getRoot());
        System.out.println();
    }
}
