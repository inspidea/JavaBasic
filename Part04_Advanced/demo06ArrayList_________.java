package Part04_Advanced;

import java.util.ArrayList;

/**
 * 集合类ArrayList；---------------------------------------------------------重点知识点!!!
 *
 * 与数组的区别：
 * Array数组的长度不可以发生改变；
 * ArrayList集合的长度可以改变；
 *
 * 对于ArrayList来说，有一个尖括号<E>代表泛型；
 * 泛型：也就是在集合中的所有元素，全都是统一的某一种类型；
 *
 * 注意：对于ArrayList来说，直接打印得到的不是地址值而是内容；
 * 如果内容是空的，得到的是空的中括号[]；
 */

public class demo06ArrayList_________ {

    public static void main(String[] args) {
        //创建了一个ArrayList集合，名称为list，里面的数据全部是String类型
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合重添加一些数据，用add方法；
        list.add("Steve");
        System.out.println(list);

        list.add("AAA");
        list.add("BBB");
        System.out.println(list);
    }
}
