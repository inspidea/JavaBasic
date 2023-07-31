package Part02_Array;

/**
 * 动态初始化并访问赋值；
 * 动态初始化，其中的元素会自动拥有一个默认值；
 * 整数类型默认为0；
 * 浮点类型默认为0.0；
 * 字符类型默认为'\u0000'；
 * 布尔类型默认为false；
 * 引用类型默认为null；
 */

public class demo03 {

    public static void main(String[] args) {
        int[] array = new int[3];

        array[0] = 1;

        System.out.println(array[0]);


    }
}
