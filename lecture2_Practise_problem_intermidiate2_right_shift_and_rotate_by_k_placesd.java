public class lecture2_Practise_problem_intermidiate2_right_shift_and_rotate_by_k_placesd {
    public static void main(String[] args) {
        int[] source = {10, 20, 30, 40, 50};
        int k = 3;
        rightShift(source, k);
        print_array(source);
    }
    public static void rightShift(int[] s,int shift) {
        for(int i = s.length-1; i >=shift;i--){
            s[i] = s[i - shift];
        }
        for(int j = 0; j<shift;j++){
            s[j] = 0;
        }
    }
    public static void print_array(int[] y) {
        System.out.println("Address of array Y: "+ y);
        for(int value: y){
            System.out.println(value);
        }
    }
}
