public class Ascii {
    public static void main(String[] args) {
        for(int i = 48; i < 97; i++){
            System.out.print((char) i + " ");
        }
        for(int i = 0; i < 10; i++){
            System.out.println((i + '0'));
        }
        char c = '9';
        int j = c - '0';
        System.out.println(j + 5 + " " + c); 
        
        int i  = 5;
        j = 10;
        System.out.println(++i + i++ - ++j - --i + i++ - ++j);
    }
}
