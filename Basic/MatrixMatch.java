public class MatrixMatch {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 1},
            {9, 7, 2},
            {7, 6, 4}
        };

        int[][] n = {
            {1, 6, 1},
            {0, 7, 3},
            {1, 6, 4}
        };

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] == n[i][j])
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}
