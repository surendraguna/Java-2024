import java.util.HashMap;

public class Duplicate {
    public static void main(String[] args) {
        HashMap<Integer, Integer> dup = new HashMap<>();
        int a[] = {1, 2, 3, 1, 5, 6, 7, 1, 2, 3, 1, 3};
        for(int i: a){
            if(dup.containsKey(i))
                dup.put(i, dup.get(i) + 1);
            else
                dup.put(i, 1);
        }
        System.out.println(dup);
    }
    
}
