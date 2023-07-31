package Part12_Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection接口；
 *      所有单列集合的【最顶层的接口】，里面定义了所有单列集合【共性】的方法；
 *      【任意的单列集合】都可以使用【Collection接口】中的方法；
 *
 * Collection接口及其下层的集合【共性】的方法：
 *      public boolean add(E e)；     把指定的对象添加到当前集合中；
 *      public void clear()；         清空集合中的所有元素；
 *      public boolean remove(E e)；  把给定的对象在当前集合中删除；
 *      public boolean contains(E e)；判断当前集合中是否包含给定对象；
 *      public boolean isEmpty()；    判断当前集合是否为空；
 *      public int size()；           返回集合中元素的格式；
 *      public Object[] toArray()；   把集合中的元素，存储到数组中；
 *
 *
 */

public class Collection01 {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态；
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);   //重写了toString方法，打印结果：[]

        //public boolean add(E e)；     把指定的对象添加到当前集合中；
        //返回值是一个boolean值，一般返回true,可以不用接收
        boolean b1 = coll.add("Venus");
        System.out.println("b1:" +b1);  //b1:true
        coll.add("AAA");
        coll.add("BBB");
        coll.add("CCC");
        System.out.println(coll);

        //public boolean remove(E e)；  把给定的对象在当前集合中删除；
        //返回值是一个boolean值，集合中存在元素，删除元素，返回true；不存在元素，返回false；
        boolean b2 = coll.remove("AAA");
        System.out.println("b2:" + b2);
        System.out.println(coll);

        //public boolean contains(E e)；判断当前集合中是否包含给定对象；
        //包含返回true，反之返回false；
        boolean b3 = coll.contains("AAA");
        boolean b4 = coll.contains("BBB");
        System.out.println("b3:" + b3 + "," + "b4:" + b4);

        //public boolean isEmpty()；    判断当前集合是否为空；
        //为空返回true，不为空返回false；
        boolean b5 = coll.isEmpty();
        System.out.println("b5:" + b5);

        //public int size();            返回集合中元素的格式；
        int size = coll.size();
        System.out.println(size);  // 3

        //public Object[] toArray();    把集合中的元素，存储到数组中；
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++){       //遍历数组arr.length不需要减去1；
            System.out.println(arr[i]);
        }

        //public void clear()；         清空集合中的所有元素，但是不删除集合；
        coll.clear();
        System.out.println(coll);





    }



}
