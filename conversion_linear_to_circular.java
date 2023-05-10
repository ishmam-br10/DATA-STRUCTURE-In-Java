public class conversion_linear_to_circular {
    public static void main(String[] args) {
        int[] linear = {10,20,30,40,50,0,0,0,0,0,0};
        int[] circular= circularize(linear, 8, 5);
        print(circular, 8, 5);
    }
    public static int[] circularize(int[] lin, int start, int size) {
        int[] circ = new int[lin.length];
        int index = start;
        for(int i =0; i<size; i++){
            circ[index] = lin[i];
            index = (index +1)%lin.length;
        }
        return circ;
    }
    public static void print(int[] c, int start, int size) {
        int index = start;
        for(int i=0; i< size; i++){
            System.out.println(c[index]);
            index = (index +1)%(c.length);
        }
    }
}
