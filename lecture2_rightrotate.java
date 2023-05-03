public class lecture2_rightrotate{
    public static void main(String[] args) {
        int[] source = {10, 20, 30, 40, 50};
        int k = 3;
        rightRotate(source, k);
        print_array(source);

    }
    public static void rightRotate(int[] s,int shift) {
        int[] temp = new int[shift];
        for(int i = s.length-1, j = temp.length-1; i >=shift;i--, j--){
            temp[j] = s[i];
            s[i] = s[i - shift];
        }
        print_array(temp);
        for(int mew = 0; mew < temp.length; mew++){
            s[mew] = temp[mew];
        }
        
    }
    public static void print_array(int[] y) {
        System.out.println("Address of array Y: "+ y);
        for(int value: y){
            System.out.println(value);
        }
    }
}
