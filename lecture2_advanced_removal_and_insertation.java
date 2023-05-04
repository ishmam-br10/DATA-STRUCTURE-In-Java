public class lecture2_advanced_removal_and_insertation {
    public static void main(String[] args) {
        int[] source = {10,20,30,40,50,0,0,0};
        print_array(source);
        boolean result = insert(source, 02, 200, 5);
        print_array(source);
    }
    public static boolean insert(int[] s, int index, int value, int size) {
        if(size == s.length){
            System.out.println("No space availabe");
            return false;
        }
        if(index<0 || index>size){
            System.out.println("Invalide index");
            return false;
        }
        for(int i = size; i>= index; i--){
            s[i+1] = s[i];
        }
        s[index] = value;
        System.out.println("insertation done successfully");
        return true;
    }
    public static void print_array(int[] y) {
        System.out.println("Address of array Y: "+ y);
        for(int value: y){
            System.out.println(value);
        }
    }
}
