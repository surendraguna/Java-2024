public class pat7 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++)
                System.out.print(" ");
            for(int j = 0; j < 2*i-1; j++)
                System.out.print("*");
            System.out.println();
        }  
        int a[] = {1};
        System.out.println(a[0]);
        res(a);
        System.out.println(a[0]);
        int c = 1;
        c *= ++c;
        System.out.println(c);
    }
    static void res(int[] a){
        a[0] = 5;
    }

    
}
