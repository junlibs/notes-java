package tmp;

import java.lang.reflect.Field;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-13
 * @Description
 */
public class TypeTest {
    double x = 100.9;

    public static void main(String[] args) throws Exception {
        Integer integer = 20;
        //检查对象的数据类型：注意，以下三种都不能用于基本类型。
        // 方式一：可以通过Object类的getClass()方法
        System.out.println(integer.getClass().toString());//
        // 方式二：通过instanceof运算符判断实例是否为某个类的实例，返回的是布尔值
        System.out.println(integer instanceof Integer);//true
//        System.out.println(integer.class);

        Class classInt = int.class;
        System.out.println(classInt);

        System.out.println(integer instanceof Integer);


        Class<? extends Object> typeConversion = Class.forName("tmp.TypeTest");
        Field[] fieldList = typeConversion.getDeclaredFields();
        for (Field f : fieldList) {
            System.out.println(f.getName() + ": " + f.getType());

        }
    }
}
