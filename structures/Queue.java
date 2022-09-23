package structures;
import java.util.Queue;
import java.util.LinkedList;

class Queue {
    node head;
    node tail;

    Queue(Object data) {
        head = new node(data);
    }

    void push(Object data) {
        node temp = new node(data);
        temp.next = head;
        head.prev = temp;
        head = temp;
    }

    Object pop() {
        node temp = tail;
        if (tail != null) {
            tail = tail.prev;
            return temp.data;
        }
    }

    Object pop(int n) {
        Object temp = head;
        int i = 0;
        while (i < n && temp != null) {
            temp = pop();
            i++;
        }
        return temp;
    }
}
