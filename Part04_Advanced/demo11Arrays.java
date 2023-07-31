package Part04_Advanced;

import java.util.Arrays;

/**
 * Arrays（有s），即java.util.Arrays是一个与数组相关的工具类，
 * 里面提供了大量静态方法，用来实现常见的数组操作；
 * public static String toString(数组)：将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3...]；
 * public static void sort(数组）：按照升序（从小到大)对数组排序；
 *
 * 备注:
 * 1. 如果是数值：sort默认按照升序
 * 2. 如果是字符串，sort默认按照字母升序
 * 3. 如果是自定义类型，如中文。那么这个自定义类需要Comparable或者Comparator接口支持（未来学习）
 */
public class demo11Arrays {

    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {6,5,7,1,7};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"aaa","ccc","bbb","qqq","eee"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

    }
}
