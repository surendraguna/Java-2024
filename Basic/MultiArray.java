public class MultiArray {
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
        
        for(int i = 0; i < a.length; i++){
            int[] b = a[i];
            for(int j = 0; j < b.length; j++)
                System.out.print(b[j] + " ");
            System.out.println();
        }
        
        for(int[] b : a){
            for(int i : b)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
