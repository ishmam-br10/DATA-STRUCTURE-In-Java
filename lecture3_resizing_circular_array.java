public class lecture3_resizing_circular_array {
    public static void main(String[] args) {
        int[] linear = {20,30,40,50,10};
        int[] n = resize(linear, 4, 5);
        print(n, 4, 5);

    }
    public static int[] resize(int[] l, int start, int size) {
        int[] circular = new int[l.length + 2];
        int index_circ = start;
        for(int i =0; i<size;i++){
            circular[index_circ] = l[i];
            index_circ = (index_circ+1)%(circular.length);
        }
        return circular;
    }
    public static void print(int[] c, int start, int size) {
        int index = start;
        for(int i=0; i< size; i++){
            System.out.println(c[index]);
            index = (index +1)%(c.length);
        }
    }
}
