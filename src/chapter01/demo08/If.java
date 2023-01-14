package chapter01.demo08;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-14
 * @Description
 */
public class If {
    public static void main(String[] args) {
        //if语句
        int age = 19;
        if (age >= 18) {
            System.out.println("成年了");
        }

        //if-else语句
        int num = 3;
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }

        //if-else if-else语句
        int score = 80;
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 80) {
            System.out.println("良好");
        } else if (score >=70) {
            System.out.println("中等");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
