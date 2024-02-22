public class Default {
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static boolean defaultBoolean;
    static char defaultChar;
    static String s = new String();
    static Object defaultObject;

    public static void main(String[] args) {
        System.out.println("Default values:");
        System.out.println("byte: " + defaultByte);
        System.out.println("short: " + defaultShort);
        System.out.println("int: " + defaultInt);
        System.out.println("long: " + defaultLong);
        System.out.println("float: " + defaultFloat);
        System.out.println("double: " + defaultDouble);
        System.out.println("boolean: " + defaultBoolean);
        System.out.println("char: " + defaultChar);
        System.out.println("String: " + s); 
        System.out.println("Object: " + defaultObject);
    }
}
