public class lecture2_rightrotate{
    //done modified 
    public static void main(String[] args) {
        int[] source = {10, 20, 30, 40, 50};
        int k = 3;
        rightRotate(source, k);
        print_array(source);

    }
    public static void rightRotate(int[] s,int shift) {
        int[] temp = new int[shift];
        for(int i = s.length-1, j = temp.length; i >=shift-1;i--, j--){
            temp[j-1] = s[i];
            if(i-shift>=0){
                s[i] = s[i - shift];
            }
        }
        // print_array(temp);
        for(int mew = 0; mew < temp.length; mew++){
            s[mew] = temp[mew];
        }
        
    }
    public static void print_array(int[] y) {
        System.out.println("Address of the source array: "+ y);
        System.out.println("New right rotated array");
        for(int value: y){
            System.out.println(value);
        }
    }
}
