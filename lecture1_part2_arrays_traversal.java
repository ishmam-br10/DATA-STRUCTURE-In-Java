public class lecture1_part2_arrays_traversal {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[5]);
        System.out.println("Print by loop");
        for(int i=0; i< a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("Print by loop , kintu onno vabe");
        for(int x:a){
            System.out.println(x);
        }
    }
}
