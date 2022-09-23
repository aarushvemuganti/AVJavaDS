package structures;

import java.util.LinkedList;


public class linkedList {
    node head;

    linkedList() {
        head = new node();
    }

    void printItems() {
        node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    void printReverse() {
        node current = head;
        int indexCount = 0;

        while (current != null) {
            current = current.prev;
        }

        for (int a = indexCount; a >= 0; a--) {
            current = current.prev;
            System.out.println(current.data);
        }

    }

    void add(Object data) {
        node current = head;
        while (current.next != null) {
            current = current.next;
        }
        if (current.data == null) {
            current.data = data;
        } else {
            current.next = new node(data);

        }
    }

    void remove(Object data) {
        node current = head;
        node last = head;
        boolean found = false; // has data in list been found

        while (current != null) {
            if (current.data == data) {
                if (current == head) {
                    head = current.next;
                } else {
                    last.next = current.next;
                    current.next.prev = last;
                }
                System.out.println("found and removed " + data);
                found = true;
                break;
            }
            last = current;
            current = current.next;
        }
        if (!found) {
            System.out.println("could not find " + data);
        }
    }

    node getAtIndex(int index) {
        int i = 0;
        node current = head;
        while (i < index) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
                i++;
            }
        }
        return current;
    }

    int getIndexOf(Object data) {
        node current = head;
        int i = 0;
        while (current != null && current.data != data) {
            current = current.next;
            i++;

        }
        if (current == null) {
            return -1;
        }
        return i;
    }
}