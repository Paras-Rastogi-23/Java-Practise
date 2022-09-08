package com.company;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem Item);
    void traverse(ListItem root);
}
