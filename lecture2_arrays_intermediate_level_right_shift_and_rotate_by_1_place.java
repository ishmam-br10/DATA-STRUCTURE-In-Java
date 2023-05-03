public class lecture2_arrays_intermediate_level_right_shift_and_rotate_by_1_place {
    public static void main(String[] args) {
        int[] uttara = {10, 20, 30, 40, 50};
        rightRotate(uttara);
        print_array(uttara);

    }
    public static void rightRotate(int[] source) {
        int right_value = source[source.length-1];
        for(int i = source.length-1; i>=1; i--){
            source[i] = source[i-1];
        }
        source[0] = right_value;
    }
    public static void print_array(int[] y) {
        System.out.println("Address of array Y: "+ y);
        for(int value: y){
            System.out.println(value);
        }
    }
}
