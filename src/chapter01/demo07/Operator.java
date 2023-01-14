package chapter01.demo07;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-14
 * @Description
 */
public class Operator {
    public static void main(String[] args) {
        //算术运算符有 +、-、*、/、%
        //字符的“+”运算，字符类型要先提升为int再参与运算
        int a = 1;
        char b = 'a';
        System.out.println(a + b);//98
        //字符串的“+”
        System.out.println(1 + 1 + "java");//2java
        System.out.println("1 + 1 = " + 2 + 2);//1+1=22

        //自增自减运算符，可以放变量后，也可以放变量前。可以单独使用，也可以在表达式中使用
        int num = 10;
        System.out.println(num + num++);//20
        System.out.println(num);//11

        //+=、-=、/=、%= 这类复合的赋值运算符，可以避免类型转换错误
        short numShort = 10;
        numShort += 4;
        System.out.println(numShort);

        //关系运算符，返回值为boolean值
        System.out.println(4 == 5);//falsle

        //逻辑运算符，&、|、！、^ 。返回值为boolean值
        System.out.println(true & false);//false

        //短路逻辑运算符：&&、||
        int x = 3;
        int y = 4;
        System.out.println(++x > 4 && y-- < 5);//false
        System.out.println("x:" + x);//4
        System.out.println("y:" + y);//4

        //三元运算符
        int num1 = 10;
        int num2 = 20;
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
}
