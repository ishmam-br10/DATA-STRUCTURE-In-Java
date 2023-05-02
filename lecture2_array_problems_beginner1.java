public class lecture2_array_problems_beginner1 {
    public static void main(String[] args) {
        int[] source = {10,20,30,40,50};
        int[] new_source =  new int[source.length];
        // we want it to become {50,40,30,20,10}
        new_source = reverse(source);
        print_array(new_source);
    }
    public static int[] reverse(int[] s) {
        int[] dest = new int[s.length];
        for(int i=0, j = dest.length-1; i<s.length; i++, j--){
            dest[j] = s[i];
        }
        return(dest);
    }
    public static void print_array(int[] y) {
        System.out.println("Address of array Y: "+ y);
        for(int value: y){
            System.out.println(value);
        }
    }
}
