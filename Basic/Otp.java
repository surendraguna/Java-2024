import java.util.Random;

public class Otp {
    public static void main(String[] args) {
        Random r = new Random();
        int otp = r.nextInt(1000, 9999);
        // genragte otp no repated
        for(int i = 0; i < 4; i++) {
            int otp1 = r.nextInt(1000, 9999);
            if(otp == otp1) {
                otp1 = r.nextInt(1000, 9999);
            }
            System.out.println(otp1);
        }
        char a[] = new char[26];
        int c = 0;
        for(int i = 65; i < 65+26; i++){
            a[c++] = (char)i; 
        }
        for(int i = 0; i < a.length; i++) {
            System.out.print((int)a[i] + " ");
        }
    }
}
