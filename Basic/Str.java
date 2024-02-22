public class Str {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "hello";

        String s2 = new String("hello");
        String s3 = new String("hello");

        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        s1 = "hello my name";
        s2 = s1.trim();
        System.out.println(s2);
        s3 = s1.substring(0, 5);
        System.out.println(s3);
    }
}
