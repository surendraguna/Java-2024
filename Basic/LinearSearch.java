import java.util.Random;

public class LinearSearch {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++){
            a[i] = r.nextInt(50, 100);
        }
        int key  = r.nextInt(50, 100);
        int flag = 0, j = 0;
        for(int i = 0; i < a.length; i++){
            if(key == a[i]){
                flag = 1;
                j = i;
                break;
            }
        }
        if(flag == 0)
            System.out.println(key + " Not found");
        else 
            System.out.println(key +" found at " + j);
        System.out.println(key + " found at " + new LinearSearch().help(a, key, 0));
    }
    int help(int[] a, int key, int i){
        if(i < a.length)
            return key == a[i] ? i : help(a, key, ++i);
        return -1;
    }
}
