
public class Variable {
    int a; // instance variable
    static int b = 10; // static variable
    
    public static void main(String[] args) {
        int c = 30; // local variable
        System.out.println(c);
        System.out.println(b);
        System.out.println(new Variable().a);
        b = 20;
        callMain();    
    }

    static void callMain(){
        System.out.println(b);
    }
}
