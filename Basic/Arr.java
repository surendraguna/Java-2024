import java.util.Scanner;

public class Arr {
    class arr{
        int id;
        String name;
        arr(){

        }
        arr(int id,   String name){
            this.id = id;
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Arr obj = new Arr();
        arr[] a = new arr[3];
        for(int i = 0; i < a.length; i++){
            a[i] = obj.new arr(i + 1, s.next());
        }
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i].id + " " + a[i].name);
        }
        for(arr i: a)
            System.out.println(i.id + " " + i.name);
    }

}
