//reversing an array in-place approach
public class lecture2_array_practise_beginner_2 {
    public static void main(String[] args) {
        int[] uttara = {10, 20, 30, 40, 50};
        reverse(uttara);
        print_array(uttara);

    }
    public static void reverse(int[] source) {
        for(int i=0,j=source.length-1; i<j; i++,j--){
            int temp = source[i];
            source[i] = source[j];
            source[j] = temp;

        }
    }
    public static void print_array(int[] y) {
        System.out.println("Address of array Y: "+ y);
        for(int value: y){
            System.out.println(value);
        }
    }    
}
