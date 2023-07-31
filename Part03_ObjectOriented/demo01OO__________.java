package Part03_ObjectOriented;

import java.util.Arrays;

/**
 * 面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲历亲为，详细处理每一个细节；
 * 面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具备该功能的人来完成；
 *
 *
 * 面向对象三大特征-----------------------------------------------------------------重点知识点!!!
 * 1. 封装性，封装(Packaging)
 * 2. 继承性，继承(Extends)
 * 3. 多态性，多态(Polymorphism)
 */

public class demo01OO__________ {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        //要求打印格式为：[1,2,3,4,5]；
        //使用面向过程：
        System.out.print("[");             //使用print（而不是println）将for循环每次结果打印在同一行
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {     //如果是最后一个元素
                System.out.println(array[i] + "]");                 //最后一项换回println准备换行
            } else {                         //如果不是最后一个元素
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println("===============");

        //使用面向对象：
        //找一个JDK给我们提供好的Arrays类；
        //其中有一个toString方法，直接能把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(array));     //

    }
}
