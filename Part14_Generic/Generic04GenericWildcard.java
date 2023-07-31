package Part14_Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型通配符
 * ？：代表任意的数据类型
 *
 * 使用方式：不能创建对象使用，只能作为方法的参数使用；
 *
 */

public class Generic04GenericWildcard {

    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        printArray(list02);

//      ArrayList<?> list03 = new ArrayList<?>();    //错误写法！定义的时候不能用？，只有参数传递时可用

        //定义一个方法，能遍历所有类型的ArrayList集合；
        //此时我们不知道ArrayList集合使用什么数据类型；
        //因此可以使用泛型的通配符？来接收数据类型；
        //注意：
        //  泛型没有继承的概念；
    }

    public static void printArray(ArrayList<?> list){
        //使用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            //it.next()方法取出的元素是Object类型,可以接收任意类型的数据；
            Object o = it.next();
            System.out.println(o);
        }
    }
}
