import java.util.ArrayList;

public class wave {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> wave = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            ArrayList<String> row = new ArrayList<>();
            for(int j = 0; j < 5; j++){
                row.add(i + " " + j);
            }
            wave.add(row);
        }
        System.out.println(wave);
    }
}
