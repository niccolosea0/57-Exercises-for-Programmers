public class Table {

    public static final int N = 12;
    
    public static void main(String[] args) {

        for (int i = 0; i <= N; i++) {
            for ( int j = 0; j <= N; j++) {
                System.out.printf("%d x %d = %d\n", i, j, (i * j));
            }

        }
        
         
    }


}
