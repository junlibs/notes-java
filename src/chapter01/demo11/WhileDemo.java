package chapter01.demo11;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-14
 * @Description
 */
public class WhileDemo {
    public static void main(String[] args) {
        //while循环打印9*9乘法表
        int i = 1;
        while( i < 10) {
            int j = 1;
            while (j <= i) {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
