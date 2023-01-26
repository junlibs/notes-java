package chapter01.demo03;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-13
 * @Description 标识符及命名规范
 */
public class Identifier {
    public static void main(String[] args) {
        int $money = 10;//可以以$开头
        int _money = 20;//可以以_开头
        int money = 30;//可以以字母开头
        int money_66_$ = 40;//标识符可以由字母、数字、下划线、$符组成
        System.out.println($money);
        System.out.println(_money);
        System.out.println(money);
        System.out.println(money_66_$);
    }
}
