package structures;

import java.util.Queue;
import java.util.LinkedList;

public class Stack{
    node head;
    
    Stack(Object data){
        head = new node(data);
    }

    void push(Object data){
        node temp = new node(data);
        temp.next = head;
        head = temp;
    }

    Object pop(){
        node temp = head;
        if(head!=null){
            head = head.next;
            return temp.data;
        }
    }

    Object pop(int n){
        Object temp = head;
        int i = 0;
        while(i<n && temp != null){
            temp = pop();
            i++;
        }
        return temp;
    }
}
