import java.io.ObjectInputStream.GetField;

public class lecture4_basic_link_list_manipulation_part2 {
    public static void main(String[] args) {
        // starting of the node
        Node head = null;

        // creating the nodes first
        Node n4 = new Node("40", null);
        Node n3 = new Node("30", n4);
        Node n2 = new Node("20", n3);
        Node n1 = new Node("10", n2);
        
        // assigning the head reference to the list
        head = n1;
        for(Node n = head; n!= null; n = n.next){
            // do something
        }
        // int g = countNode(head);
        // // System.out.println(g);
    }
    public int countNode(Node head){
        int count = 0;
        for(Node n = head; n!= null; n= n.next){
            count++;
        }
        return count;
    }
    public Object get(Node head, int index){
        int c = 0;
        for(Node n = head; n!= null; n=n.next){
            if(c==index){
                return n.element;
            }
            c++;
        }
        return -1;
    }
    public Node nodeAt(Node head, int size, int index){
        if(index<0 || index>= size){
            return null;
        }
        Node n = head;
        for(int i = 0; i< index; i++, n = n.next){
            ;
        }
        return n;
    }
    public void set(Node head, int index, Object elem){
        int c=0;
        for(Node n = head; n!= null; n=n.next){
            if(c == index){
                n.element = elem;
            }
            c++;
        }
    }
}
