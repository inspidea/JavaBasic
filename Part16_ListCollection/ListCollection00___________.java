package Part16_ListCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List Collection；
 * 接口 List<E>;        ---------------------------------------------重点知识点!!!
 *
 * List接口特点：
 * 1. 【有序】的集合，存储元素和取出元素的【顺序是一致的】；
 * 2. 有【索引】，包含了一些带索引的方法；
 * 3. 允许存储【重复】的元素；
 *
 * list接口中带索引的方法（【特有方法】）：
 *      public void add(int index, E element): 将指定的元素，添加到该集合的指定位置上；
 *      public E get(int index): 返回集合中指定位置的元素；
 *      public E remove(int index): 移除列表中指定位置的元素，【返回被移除的元素】；
 *      public E set(int index, E element): 用指定元素替换集合中指定位置的元素，【返回更新前元素】；
 *
 * 注意事项：
 * 操作索引的时候，一定要【防止索引越界异常】；
 * IndexOfBoundException：（集合）索引越界异常；
 * ArrayIndexOfBoundException：数组越界异常；
 * StringIndexOfBoundException：字符串越界异常；
 *
 * ------------------------------------------------------***字符串，数组：length，ArrayList：Size***
 *
 */

public class ListCollection00___________ {

    public static void main(String[] args){
        //创建一个List集合对象，多态
        List<String> list = new ArrayList<>();
        //使用add方法向集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //打印集合
        System.out.println(list);//打印的不是地址，说明重写了toString

        //public void add(int index, E element)： 将指定的元素添加到集合指定位置；
        //在c和d之间添加一个itheima；
        list.add(3,"itheima");   //index写的是要添加的位置
        System.out.println(list);    //[a, b, c, itheima, d, e]

        //public E remove(int index)： 移除列表中指定位置的元素，返回的是被移除的元素；
        String removeE = list.remove(3);  //通过为移除方法指定一个变量即可存放（并输出）remove方法的返回值；
        System.out.println("被移除的元素是：" + removeE);
        System.out.println(list);

        //public E set(int index, E element): 用指定元素替换集合中指定位置的元素，返回更新前元素；
        //把最后一个a替换成大写A
        String setE = list.set(4, "A");
        System.out.println("被替换的元素是" + setE);
        System.out.println(list);

        //list的【遍历】方式有三种：
        //1. 普通的for循环：
        for(int i = 0; i < list.size(); i++){      //--------------------使用for循环时，i必须定义变量数据类型(int)
            //public E get(int index): 返回集合中指定位置的元素；
            String s = list.get(i);
            System.out.println(s);
        }

//     =============================================================================

        System.out.println("========================");

        //2. 使用迭代器：
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s1 = it.next();
            System.out.println(s1);
        }

//     =============================================================================

        System.out.println("========================");

        //3. 使用增强for循环
        for (String s:list){
            System.out.println(s);
        }

        //String r = list.get(5);   //IndexOutOfBoundsException越界异常
        //System.out.println(r);


    }
}
