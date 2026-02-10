public class Table {

    public static final int N = 12;
    
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int elem : array) {
            System.out.printf(elem + " ");
        }
        System.out.println();
        for (int i = 0; i <= N; i++) {
            System.out.printf(i + " ");
            for (int j = 0; j <= N; j++) {
                System.out.printf(i * array[j] + " ");
            }
            System.out.println();
        }
        
         
    }


}
