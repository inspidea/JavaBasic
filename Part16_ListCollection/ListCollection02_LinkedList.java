package Part16_ListCollection;

import java.util.LinkedList;

/**
 * LinkedList Collection
 *
 * java.util.LinkedList impelments List接口；
 * 集合数据存储的结构是链表结构，方便元素添加，删除的集合；
 * LinkedList是一个双向链表；
 *
 * 特点：
 * 1. 底层是一个链表结构：查询慢，增删快；
 * 2. 里面包含了大量操作首尾元素的方法；
 * 注意：使用了LinkedList集合持有的方法，不能使用多态
 *
 * public void addFirst(E e):将指定元素插入此列表的开头；
 * public void addLast(E e) :将指定元素添加到此列表的结尾；
 * public void push(E e) :将元素推入此列表所表示的堆栈；
 *
 * public E getFirst() :返回此列来的第一个元素；
 * public E getLast():返回此列表的最后一个元素；
 *
 * public E removeFirst():移除并返回此列表的第一个元素 ；
 * public E removeLast():移除并返回此列表的最后一个元素；
 * public E pop():从此列表所表示的堆栈处弹出一个元素；
 *
 * public boolean isEmpty(): 如果列表不包含元素，则返回true；

 *
 */



public class ListCollection02_LinkedList {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }

    private static void show01(){
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法添加元素(List集合共有方法)
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);   //[a,b,c]

        //public void addFirst(E e):将指定元素插入此列表的开头；
        linked.addFirst("www");
        System.out.println(linked);
        //public void push(E e) :将元素推入此列表所表示的堆栈；
        linked.addFirst("xxx");   //与上一个addFirst()方法等效；
        System.out.println(linked);

        //public void addLast(E e) :将指定元素添加到此列表的结尾，此方法等效于add()；
        linked.addLast("yyy");
        System.out.println(linked);
    }

    private static void show02() {
        //创建LinkedList集合对象
        LinkedList<String> linked2 = new LinkedList<>();
        //使用add方法添加元素(List集合共有方法)
        linked2.add("a");
        linked2.add("b");
        linked2.add("c");

        linked2.clear();   //清空集合中的元素；

        // 清空后再执行获取元素的方法会抛出NoSuchElementException异常；
        if(!linked2.isEmpty()){//因此增加一个判断来确定集合是否为空，此处用【!】来做【方法的否】；
            //public E getLast():返回此列表的最后一个元素；
            String first = linked2.getFirst();
            System.out.println(first);  //a
            //public E getLast():返回此列表的最后一个元素；
            String Last = linked2.getLast();
            System.out.println(Last);   //c
        }
    }

    private static void show03() {
        //创建LinkedList集合对象
        LinkedList<String> linked03 = new LinkedList<>();
        //使用add方法添加元素(List集合共有方法)
        linked03.add("a");
        linked03.add("b");
        linked03.add("c");
        System.out.println(linked03);

        //public E removeFirst():移除并返回此列表的第一个元素 ；
        String first1 = linked03.removeFirst();
        System.out.println("被移除的第一个元素是：" + first1);

        //public E pop():从此列表所表示的堆栈处弹出一个元素；
        //String first1 = linked03.pop();  //等效于上一种removeFirst方法；

        //public E removeLast():移除并返回此列表的最后一个元素；
        String last1 = linked03.removeLast();
        System.out.println("被移除的最后一个元素是：" + last1);

        System.out.println(linked03);
    }
}
