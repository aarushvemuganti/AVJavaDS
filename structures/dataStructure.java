package structures;

public class dataStructure {
    public static void main(String[] args) {
        Queue mystack = new Queue(1);
        mystack.push(2);
        mystack.push(3);

        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        mystack.push(2);
        mystack.push(3);
        System.out.println(mystack.pop());

    }
}