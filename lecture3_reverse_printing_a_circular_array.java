public class lecture3_reverse_printing_a_circular_array {
    public static void main(String[] args) {
        int[] circular = {40,50,0,0,0,0,0,0,10,20,30};
        revPrinter(circular, 8, 5);
    }
    public static void revPrinter(int[] c, int start, int size) {
        int index = (start + size -1)%c.length;
        for(int i=0; i<size;i++){
            System.out.println(c[index]);
            index = index - 1;
            if(index<0){
                index = c.length -1;
            }
        }
    }


//     Thumb rule 2
// Whenever you icreament the index of a circular array,
// always mod the increamented value with the circular
// array's length.

// THUMB RULE 4
// When ever you decreament the index of a circular array,
// always check keep a check whether it became negative.
// If it does, point it to the end of the array.
}
