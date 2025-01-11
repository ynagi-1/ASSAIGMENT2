public class Assaigment2_2_Task6 {
    public static void main(String[] args) {
        universalMethod();
        universalMethod(10);
        universalMethod("Hello");
        universalMethod(3.14);
        universalMethod(5, "World");
        universalMethod(new int[]{1, 2, 3});
        universalMethod(true);
        universalMethod(10L, 20L);
        universalMethod("Hi", "Everyone");
        universalMethod(42, 3.14);
    }

    public static void universalMethod() {
        System.out.println("Method with no parameters");
    }

    public static void universalMethod(int x) {
        System.out.println("Method with an int: " + x);
    }

    public static void universalMethod(String str) {
        System.out.println("Method with a String: " + str);
    }

    public static void universalMethod(double d) {
        System.out.println("Method with a double: " + d);
    }

    public static void universalMethod(int x, String str) {
        System.out.println("Method with an int and a String: " + x + ", " + str);
    }

    public static void universalMethod(int[] array) {
        System.out.println("Method with an int array: " + java.util.Arrays.toString(array));
    }

    public static void universalMethod(boolean b) {
        System.out.println("Method with a boolean: " + b);
    }

    public static void universalMethod(long a, long b) {
        System.out.println("Method with two longs: " + a + ", " + b);
    }

    public static void universalMethod(String a, String b) {
        System.out.println("Method with two Strings: " + a + ", " + b);
    }

    public static void universalMethod(int x, double d) {
        System.out.println("Method with an int and a double: " + x + ", " + d);
    }
}
