package chapter01.demo10;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-14
 * @Description
 */
public class ForDemo {
    public static void main(String[] args) {
        //for循环打印9*9乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
            }
            System.out.println();
        }
    }
}
