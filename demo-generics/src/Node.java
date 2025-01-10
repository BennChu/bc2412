public class Node {
    
    private Node node;//address
                     //

    private int value;

    //private String name; name actually is an address

    public Node(Node node, int value) {
        this.node = node;
        this.value = value;
    }

    public Node(int value) {
        this.value = value;
    }
    
    public Node(Node node) {
        this.node = node;
    }

    public Node() {

    }

    //setting the next node to the current node
    public void setNode(Node node) {
        this.node = node;
    }

    //getter
    public Node next() {  //getNode
        return this.node;    
    }

    public int getValue() {
        return this.value;
    }


    public static void main(String[] args) {

        //Node head = new Node(new Node(new Node(null)));//null 空指針, 3 objects, 唔 call runtime 冇事

        //
        Node head = new Node(40);//new way to store int

        Node node2 = new Node(50);
        head.setNode(node2);

        Node node3 = new Node(60);
        node2.setNode(node3);
        
        node3.setNode(new Node(70));

        Node temp = head;//store head address first, purpose is backup
        while (temp != null) { //can i exit
            System.out.println(temp.getValue());//由頭開始 getValue()
            temp = temp.next(); //去到尾冇野攞, null
        }
        //for loop and for each cannot 

        //Array vs LinkedList, LinkedList important
        //LinkedList adv: add / remove head and tail
        //Array/ArrayList adv: point to the object directly if you know the position
        //Person.class, maybe find a name




    }
}
