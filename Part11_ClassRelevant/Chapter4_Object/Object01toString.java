package Part11_ClassRelevant.Chapter4_Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *   java.lang.Object类：
 *   类Object是类层次结构的根（最顶层）类，每个类都是用Object作为超（父）类；
 *   所有对象（包括数组）都实现这个类的方法；
 */
public class Object01toString {
    public static void main(String[] args) {

//      Person类默认继承了Object类，所以我们可以使用Object类中的toString方法；
//      String toString() 返回该对象的字符串表示；


        Person p = new Person("Steve", 21);
        String s =p.toString();
        System.out.println(s);

        //直接打印对象的名字，其实就是调用对象的toString方法 p = p.toString();
        //因此打印的结果是对象的地址值，若要打印具体的字面值需要在Person类中重写方法；
        System.out.println(p);

        //看一个类是否重写了toString方法，直接打印这个类对应对象的名字即可；
        //如果没有重写toString方法，那么打印的就是对象的地址值；
        //如果重写了toString方法，那么就按照重写的方法打印

        Random r = new Random();   //打印结果是地址值，说明该方法没有重写toString方法；
        System.out.println(r);

        Scanner sc = new Scanner(System.in);  //打印结果不是地址值，说明该方法重写了toString方法；
        System.out.println(sc);

        ArrayList<Integer> list = new ArrayList<>();  //打印结果是我们加入的Integer数据字面值；
        list.add(1);                                  //说明该方法重写了toString方法；
        list.add(2);
        System.out.println(list);
    }
}
