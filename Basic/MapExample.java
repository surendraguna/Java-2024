import java.util.ArrayList;
import java.util.HashSet;

public class MapExample {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(2);
        System.out.println(a);
        HashSet<Integer> hs = new HashSet<>();
        for(int i : a)
            hs.add(i);
        System.out.println(hs);
        
    }
}
