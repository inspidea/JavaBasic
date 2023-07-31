package Part16_ListCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set Collection；
 *
 * java.util.Set接口 extends Collection接口；
 * 特点：
 * 1. 不允许存储重复的元素；
 * 2. 没有索引，没有带索引的方法，也不能使用普通的for循环遍历；
 *
 * 有两个实现类：
 * A. HashSet：
 * java.util.HashSet集合 implements Set接口
 *    特点：
 *    1. 【不允许存储重复】的元素；
 *    2. 【没有索引】，没有带索引的方法，也【不能使用普通的for循环】遍历；
 *    3. 是一个【无序】的集合，存储元素和取出元素的顺序可能不一致；
 *    4. 底层是一个【哈希表】结构（查询的速度非常快）
 *
 *
 * B. LinkedHashSet：
 * java.util.LinkedHashSet集合 extends HashSet集合；
 *    特点：
 *    1. 底层是一个哈希表（数组+链表/红黑树）+【链表】，
 *       比HashSet【多了一条链表】（记录元素的存储顺序），保证元素【有序】；
 *    2. 【不允许存储重复】的元素；
 */

public class ListCollection04_Set {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //使用add方法添加元素(List集合共有方法)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //使用迭代器遍历（不能使用for循环）
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            System.out.println(n);
        }

        //使用增强for循环遍历（与前几种集合同理，省略）
    }


}
