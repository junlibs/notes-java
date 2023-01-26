package chapter01.demo14;

/**
 * @author https://github.com/junlibs
 * @date 2023-01-16
 * @Description 数组
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[3];//动态初始化
        System.out.println(arr);//[I@1b6d3586
        System.out.println(arr[0]);//0
        System.out.println(arr[1]);//0
        System.out.println(arr[2]);//0
        arr[2] = 11;
        System.out.println(arr[2]);//11

        int[] arrInt = {11, 22,33};//静态初始化
        System.out.println(arrInt[0]);//11
        System.out.println(arrInt[1]);//22
        System.out.println(arrInt.length);//3
    }
}
