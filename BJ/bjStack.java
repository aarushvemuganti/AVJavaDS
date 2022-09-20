public class bjStack {
    node head;

    Stack(Object data){
        head = new node(data);
    }

    void push(Object data) {
        node temp = new node(data);
        temp.next = head;
        head = temp;
    }

    Object pop() {
        node temp = head;
        if (head != null) {
            head = head.next;
            return temp.data;
        }
    }

}
