public class LinkedList1 { //a list of integer
    
    private Node head;//first node

    public LinkedList1() {
        //this.head = new Node(); 唔想夾硬比一粒 node 佢
    }

    public void add(int value) {//add to the tail of the list
        if (this.head == null) {
            this.head = new Node(value);
            return;
        }
        
        Node first = this.head;
        while (first.next() != null) {
            first = first.next();
        }
        first.setNode(new Node(value));
    }

    public void remove() {//remove head node
        if (this.head ==null)
            return;
        this.head = this.head.next();
       
    }

    public int size() {
        int count = 0;
        Node first = this.head;
        while (first == null) {
            first = first.next();
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        Node first = head;
        String str = "LinkedList1";

        while (first != null) {
            str += first.getValue() + ",";
            first = first.next();
        }
        return str.substring(0, str.length()-1) + "]";
    }

    public static void main(String[] args) {

        LinkedList1 ll = new LinkedList1();
        System.out.println(ll.size());

        ll.add(10);
        ll.add(20);
        ll.add(100);
        System.out.println(ll);

    }
}
