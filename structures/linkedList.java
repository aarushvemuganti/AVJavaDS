package structures;

public class linkedList {
    node head;

    linkedList(){
        head = new node();
    }
    
    void printItems(){
        node current = head;
        while (current != null){
            System.out.println(current.data);
            current = head.next;
        }
    }

    void add(Object data){
        if(head.data == null){
            head.data = data;
        }
        head.next = new node();
        next.data = data;
    }
}
