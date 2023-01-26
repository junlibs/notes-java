package chapter01.demo05;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-13
 * @Description java中的基本数据类型
 */
public class Datatype {
    static int staticNum;//类的成员变量，如果不给初值，JVM会赋默认值
    public static void main(String[] args) {
        //局部变量在使用之前必须进行赋值
        byte byteNum1 = -128, byteNum2 = 127;//一条语句定义多个变量，用逗号分隔
        short shortNum = 128;
        int intNum = 10;
        long longNum = 100;
        float floatNum = 10.1f;//值后必须加f
        double doubleNum = 200.1;
        char charNum = 'a';
        boolean booleanNum = false;
        System.out.println(byteNum1);
        System.out.println(byteNum2);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(charNum);
        System.out.println(booleanNum);
        //类的成员变量在使用前可以不赋值，由JVM赋默认值
        System.out.println(staticNum);
    }
}
