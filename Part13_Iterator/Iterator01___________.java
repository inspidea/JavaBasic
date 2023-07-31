package Part13_Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator迭代器接口
 *
 * java.util.Iterator接口：迭代器，对集合进行遍历
 * 迭代：即Collection集合元素的通用获取方式，在去元素之前先要判断集合中有没有元素；
 *      如果有，就把这个元素取出来，继续判断，如果还有就再取出来，直到所有元素被取出；
 *
 * 常用方法:
 * 1. boolean hasNext();   如果仍有元素可以迭代，返回true；
 *                         判断集合中还有没有下一个元素；
 * 2. E next();            返回迭代的下一个元素；
 *                         取出集合的下一个元素；
 *
 * Iterator迭代器是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象；
 * 获取实现类的方式比较特殊：
 * Collection接口中有一个方法，叫iterator()； 这个方法返回的就是迭代器的实现类对象：
 *      Iterator<E> iterator()； 返回在此collection的元素上进行迭代的迭代器；
 *
 * 迭代器的使用步骤------------------------------------------------------------------------重点知识点!!!
 * 1. 使用集合中的方法iterator()获取迭代器的实现类对想，使用Iterator接口接收(多态)；
 * 2. 使用Iterator接口中的方法hasNext判断还有没有下一个元素；
 * 3. 使用Iterator接口中的方法next取出集合的下一个元素；
 *
 */

public class Iterator01___________ {

    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        //向集合中添加元素
        coll.add("AAA");
        coll.add("BBB");
        coll.add("CCC");
        coll.add("DDD");
        coll.add("EEE");

        //1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收(多态)；
        // 注意：
        //    Iterator<E>；接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器也一样；
        //多态     接口          实现类对象
        Iterator<String> it = coll.iterator();

        /**
         * 发现使用迭代器去除剂和中的元素的代码，是一个重复的过程；
         * 所以我们可以使用循环优化；
         * 不知道集合中有多少个元素则使用while循环；
         * 循环结束的条件：hasNext方法返回false；
         */

        //高效的写法：
        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }

//      ========================================================================

        System.out.println("==============================");

        //for循环写法（了解即可）：
        for(Iterator<String> it2 = coll.iterator(); it2.hasNext();){
            String e = it2.next();
            System.out.println(e);
        }

//      ========================================================================

//        //低效的写法：
//        //2. 使用Iterator接口中的方法hasNext判断还有没有下一个元素；
//        boolean b = it.hasNext();
//        System.out.println(b);   //true
//
//        //3. 使用Iterator接口中的方法next取出集合的下一个元素；
//        String s = it.next();
//        System.out.println(s);  //AAA
//
//        //重复上述步骤2，3：
//        b = it.hasNext();      //备忘提示：已经定义过数据类型的变量不需要重新定义类型
//        System.out.println(b);   //true
//        s = it.next();                  //已经定义过数据类型的变量不需要重新定义类型
//        System.out.println(s);  //BBB
//
//        b = it.hasNext();
//        System.out.println(b);   //true
//        s = it.next();
//        System.out.println(s);  //CCC
//
//        b = it.hasNext();
//        System.out.println(b);   //true
//        s = it.next();
//        System.out.println(s);  //DDD
//
//        b = it.hasNext();
//        System.out.println(b);   //true
//        s = it.next();
//        System.out.println(s);  //EEE
//
//        b = it.hasNext();
//        System.out.println(b);   //false
//        s = it.next();
//        System.out.println(s);  //没有元素再取出元素会抛出NoSuchElement没有元素异常

    }
}
