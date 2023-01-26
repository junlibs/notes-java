package chapter01.demo13;

import java.util.Random;
import java.util.Scanner;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-14
 * @Description Random类基本应用
 */
public class RandomDemo {
    public static void main(String[] args) {
        //程序自动生成一个1~100之间的数字
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;

        //规定最多猜测次数
        int total = 5;

        //计数器，用来记录用户猜测次数
        int count = 0;

        //flag，标记用户是否猜对，true表示没有猜对
        boolean flag = true;

        //用户输入猜测数字
        Scanner scanner = new Scanner(System.in);

        //如果没有猜对，并且次数没达到上限，就可以继续猜
        while (flag && count < total) {
            System.out.println("请输入您的猜测：");
            //用户输入猜测的数字
            int guessNum = scanner.nextInt();
            //判断是否猜对
            if (guessNum == randomNum) {
                System.out.println("恭喜你，猜对了");
                flag = false;
            } else if (guessNum > randomNum) {
                System.out.println("很遗憾，您猜的数字太大了");
                count++;
                System.out.println("你还有" + (total - count) + "次机会");
            } else {
                System.out.println("很遗憾，您猜的数字太小了");
                count++;
                System.out.println("你还有" + (total - count) + "次机会");
            }
        }
    }
}
