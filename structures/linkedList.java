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
            current = current.next;
        }
    }

    void add(Object data){
        node current = head;
        while (current.next != null){
            current = current.next;
        }
        if(current.data == null){
            current.data = data;
        }
        else{
            current.next = new node(data);

        }
    }

    void remove(Object data){
        node current = head;
        node last = head;
        boolean found = false; // has data in list been found
       
        while(current != null){
            if(current.data == data){
                if (current == head){
                    head = current.next;
                }
                else{
                    last.next = current.next;
                }
                System.out.println("found and removed " + data);
                found = true;
                break;
            } 
            last = current;
            current = current.next;
        }
        if(!found){
            System.out.println("could not find " + data);
        }
    }
}