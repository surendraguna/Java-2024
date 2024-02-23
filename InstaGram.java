import java.util.ArrayList;

public class InstaGram {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 1; i < 101; i++)
            a.add(i);
        
        // Start from the last element and remove every second element
        while (a.size() > 1) {
            for(int i = 1; i < a.size(); i++)
                a.remove(i);
            System.out.println(a);
        }
        
    }
}
