public class lecture4_basic_linked_list_manipulation_part1 {
    public static void main(String[] args) {
        // starting of the node
        Node head = null;

        // creating the nodes first
        Node n1 = new Node("10", null);
        Node n2 = new Node("20", null);
        n1.next = n2;
        // alternative
        // Node n2 = new Node("20", null);
        // Node n1 = new Node("10", n2);
        // assigning the head reference to the list
        head = n1;
    }
}
