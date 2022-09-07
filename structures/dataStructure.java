package structures;

import java.util.LinkedList;

public class dataStructure {
     public static void main(String[] args) {
        linkedList llist = new linkedList();
        llist.add(5);
        llist.add(6);
        llist.add(7);
        llist.remove(6);
        llist.printItems();
    }
}