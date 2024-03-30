public class Buffer {

    @SuppressWarnings(value = { "unused" })
    public static void main(String[] args) {
        String s1 = "surya";
        String s2 = "surya";
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode() + " " + s2.hashCode());
        StringBuffer s3 = new StringBuffer("surya");
        StringBuffer s4 = new StringBuffer("surya");
        StringBuilder s5 = new StringBuilder("hello");
        s1 = "sure1@1324";
        System.out.println(Character.isDigit(s1.charAt(4)));
    }
}
