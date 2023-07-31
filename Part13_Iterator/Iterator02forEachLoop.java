package Part13_Iterator;

import Part02_Array.demo02;

import java.util.ArrayList;

/**
 * 增强for循环：底层是用的也是迭代器，使用for循环的格式，简化了迭代器的书写；
 * 是JDK1.5之后出现的新特性；
 * Collection<E> extends Iterable<e>;
 *
 * 增强for循环：用来遍历集合和数组
 *
 * 格式：
 * for(集合/数组的数据类型 变量名: 集合名/数组名）{     //（注意! 变量名后用的是冒号：）
 *     sout(变量名);
 * }
 */

public class Iterator02forEachLoop {

    public static void main(String[] args) {
        demo01();
        System.out.println("===================");
        demo02();
    }

    //使用增强for循环遍历集合
    private static void demo02(){
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        for(String s : list){
            System.out.println(s);
        }
    }

    //使用增强for循环遍历数组
    private static void demo01(){
        int[] arr = {1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }
    }
}
