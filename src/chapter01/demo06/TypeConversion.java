package chapter01.demo06;



/**
 * @author https://github.com/junlibs
 * @date 2023-01-13
 * @Description java程序的类型转换
 */
public class TypeConversion {
    public static void main(String[] args) throws Exception {
        //隐式转换：可以直接进行赋值
        int number = 10;
        double doubleNum = number;//发生了隐式转换
        System.out.println(number);//10
        System.out.println(doubleNum);//10.0
        //强制转换
        byte a = 11;
        int b = (byte)a;
        System.out.println(b);//11
        //byte、short、char三种数据在运算时，都会提升为int再运算。
        byte x = 1;
        byte y = 2;
        int w = x + y;
        byte m = (byte) (x + y);
        System.out.println(w);//3
        System.out.println(m);//3

        //java常量优化机制
        byte n = 3 + 4;
        System.out.println(n);//3+4先运算，结果为7，在byte范围内，编译通过
        //byte u = 127 + 4;//127+4的结果超出127，编译出错
    }
}