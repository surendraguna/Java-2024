public class TypeCast {
    public static void main(String[] args) {
        int i = 'c';
        System.out.println(i);
        char j = (char)99;
        System.out.println(j);

        // Int to String
        i = 121;
        String s = String.valueOf(i);
        System.out.println(s);
        // String to int
        s = "123435";
        i = Integer.parseInt(s);
        System.out.println(i);
        var k = 10;
        call(k);
    }
    static void call(int j) {
        System.out.println(j);
    }
}
