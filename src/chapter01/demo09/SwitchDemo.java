package chapter01.demo09;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-14
 * @Description
 */
public class SwitchDemo {
    public static void main(String[] args) {
        //jdk12之前
        int number = 1;
        switch (number) {
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            default:
                System.out.println("没有这种选项");
                break;
        }

        //JDK12及其之后，可以使用Lamda表达式进行简化书写。要把idea中的jdk切换成jdk12之后才能编译通过
 /*       switch (number) {
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> {
                System.out.println("三");
            }
            default -> {
                System.out.println("没有这种选项");
            }
        }

        //如果case后面的语句体中只有一行代码，也可以把大括号进行省略
        switch (number) {
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("没有这种选项");
        }

  */
    }
}
