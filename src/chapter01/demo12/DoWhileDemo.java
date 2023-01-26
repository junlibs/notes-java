package chapter01.demo12;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-14
 * @Description do-while 循环语句
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        //while循环打印9*9乘法表
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
                j++;
            } while (j <= i);
            i++;
            System.out.println();
        } while (i < 10);
    }
}
