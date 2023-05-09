public class lecture3_circular_array_traversal {
    public static void main(String[] args) {
        int[] circular = {40,50,0,0,0,0,0,0,10,20,30};
        print(circular, 8, 5);
    }
    public static void print(int[] c, int start, int size) {
        int index = start;
        for(int i=0; i< size; i++){
            System.out.println(c[index]);
            index = (index +1)%(c.length);
        // alternative way
        //if(index == c.length){
            //index = 0;
            //this will make index zero when it reaches limit
        //}
        }
    }
}
//     Thumb rule 2
// Whenever you icreament the index of a circular array,
// always mod the increamented value with the circular
// array's length.
