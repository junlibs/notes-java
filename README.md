# java核心基础学习笔记

该笔记包含以下部分：

1. java基础语法
2. 面向对象基础
3. 常用API
4. 面向对象进阶
5. 集合
6. IO流
7. 多线程
8. 网络编程
9. 反射
10. 单元测试
11. 日志
12. java新版本更新介绍



## chapter01-java语法基础

### 1.1环境搭建与HelloWorld

#### 1.1.1环境搭建

在Oracle官网http://www.oracle.com下载JDK进行安装，具体安装步骤以及环境配置步骤网上教程很多，不再赘述。

JDK包含JRE和开发工具；JRE包含JVM和核心类库。

JDK：Java Development Kit缩写，是java语言的软件开发工具包，内部包含了代码的编译工具和运行工具（JRE）。

JRE：Java Runtime Environment缩写，指的是java运行环境，包含JVM虚拟机和Java核心类库。



#### 1..1.2HelloWorld

```java
package chapter01.demo01;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-13
 * @Description
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

public 为类或类的成员的访问修饰符。在同一个java源文件中可以包含多个类定义，但是最多只能包含一个public类定义。

| 修饰符          | 同类 | 同包 | 子类 | 不同包 |
| --------------- | ---- | ---- | ---- | ------ |
| public          | √    | √    | √    | √      |
| protected       | √    | √    | √    | ×      |
| default（不写） | √    | √    | ×    | ×      |
| private         | √    | ×    | ×    | ×      |

class 为类声明，其后跟类名，类名的首字母要大写，类名需要与文件名保持一致。

static 为静态声明关键字，可以修饰类的成员变量称为静态变量，可以修饰类的成员方法称为成员方法，也可以用来修饰代码块成为静态代码块或静态初始化器，还可以修饰内部类称为静态内部类。

void 为返回值，表示该方法没有返回值。

main(String[] args)为程序的入口方法，括号中为形参列表，String[] args即字符串数组，用来接收传进来的参数。

System为java.lang包下的类，在java.lang包下的类不用手动导入，可以直接用。System类中有3个静态成员变量，分别是，标准输出流PrintStream out、标准输入流InputStream in、标准的错误输出流PrintStream err。

println为标准输出流中的方法，用来在控制台打印内容。



### 1.2基础语法

#### 1.2.1注释

java中分三种注释：单行注释、多行注释、文档注释。

```java
package chapter01.demo02;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-13
 * @Description 此处就是文档注释，用来说明程序的一些信息，在方法上也可以添加文档注释
 */
public class Comments {
    public static void main(String[] args) {
        //这是单行注释，用两个斜线表示

        /*
        * 这是多行注释，开头用/和*，结尾用*和/
        * */
    }
}
```



#### 1.2.2关键字和标识符

java中有一些特殊用途的单词被称为关键字，比如，new、if、public、static等。java中所有的关键字都是小写的。

注，java10中引入的var并不是关键字，它相当于一个可变的类型名。

标识符就是用于给变量、类、方法命名的符号。

java中的标识符，由字母、数字、下划线、$符组成，且不能以数字开头。且不能以关键字命名。

注，由于var不是关键字，因此var可作为标识符，但是不建议使用它来作为标识符。

```java
package chapter01.demo03;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-13
 * @Description 标识符和关键字
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
```



#### 1.2.3变量和常量

变量，就是内存中的存储空间。变量的作用域，只在它所在的大括号中有效。

常量，即在程序的执行过程中，其值不会改变的数据，一旦初始化就不可以被修改。java中使用final关键字来定义一个常量。final的具体用法参见面向对象中的讲解。

```java
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
```



#### 1.2.4 数据类型

java中的的数据类型分为基本数据类型和引用数据类型。

- 基本数据类型：

  有：byte、short、int、long、float、double、char、boolean，它们所占内存空间大小依次为(单位:字节)，1,、2、4、8、4、8、2、1。

  byte取值范围是[-128, 127]；默认值是0。

  short的取值范围是[-2^15, 2^15 - 1]；默认值是0。

  int的取值范围是[-2^31, 2^31 -1]；默认值是0.

  long的默认值是0L。

  float的默认值是0.0f。

  char的默认值是\u0000。

  double的默认值是0.0d。

  boolean的默认值是false。

- 引用数据类型：

  有：类class、接口interface、数组[]。关于引用数据类型的具体介绍参见面向对象中的讲解。

```java
package chapter01.demo05;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-13
 * @Description 基本数据类型
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
```



#### 1.2.5 类型转换

java支持隐式类型转换和显式类型转换。

隐式类型转换：取值范围小的类型给取值范围大的类型，可以直接给。

注，byte、short、char三种数据在运算的时候，不管是否有更高的数据类型，都会提升为int，然后再进行运算。

- byte ——> int
- short ——> int
- char ——> int
- int ——> long；int ——> float；int ——> double
- long ——> float；long ——> double
- float ——> double







## chapter02-面向对象基础

## chapter03-常用API

## chapter04-面向对象进阶

## chapter05-集合

## chapter06-IO流

## chapter07-多线程

## chapter08-网络编程

## chapter09-反射

## chapter10-单元测试

## chapter11-日志

