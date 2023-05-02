public class lecture1_part3_array_traversal_trhough_method {
    public static void main(String[] args) {
        int [] a = {10, 20, 30, 40, 50};
        System.out.println("Address of array A: "+ a);
        System.out.println(a[0]); // 10
        print_array(a);
        System.out.println(a[0]); //250
    }
    public static void print_array(int[] y) {
        System.out.println("Address of array Y: "+ y);
        for(int value: y){
            System.out.println(value);
        }
        y[0] = 250;
        // a and y both referes same ram location
    }    
}