package chapter01.demo15;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-26
 * @Description 方法重载
 */
public class MethodOverload {
    public static void main(String[] args) {
        boolean result1 = compare(10, 20);
        boolean result2 = compare(10.1, 20.1);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(double a, double b) {
        return a == b;
    }
}
