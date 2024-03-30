
public class PrintAllDiv {
    public static void main(String[] args) {
        int n = 5;
        int res = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    if(i / j == j){
                        res += j;
                    }else{
                        res += j + i / j;
                    }
                }
            }
        }
        System.out.println(res);
        n = 25;
        System.out.println(Math.sqrt(n));
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.print(i + " ");
                if(i != n / i){
                    System.out.print(n / i + " ");
                }
            }
        }
        System.out.println();
        int a = 30, b = 40;
        while(a > 0 && b > 0){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }
            System.out.println(a + " " + b);
        }
        if(a == 0){
            System.out.println(b); 
        }else{
            System.out.println(a);
        }
    }
}
