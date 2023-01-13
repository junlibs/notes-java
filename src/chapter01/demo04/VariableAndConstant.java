package chapter01.demo04;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-13
 * @Description 常量和变量
 */
public class VariableAndConstant {
    //静态常量（类变量）
    public static final double PI = 3.14;

    //成员常量
    final int x = 10;

    public static void main(String[] args) {
        //局部常量
        final int age = 18;

        System.out.println(PI);//3.14
        //System.out.println(x);//编译报错，x未用static修饰，不能在静态方法中访问。
        System.out.println(age);//18

        //局部变量，使用前必须手动赋值
        String name = "张三";
        System.out.println(name);//张三
        name = "李四";
        System.out.println(name);//李四
    }
}
