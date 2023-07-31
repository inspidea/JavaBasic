package Part11_ClassRelevant.Chapter4_Object;

import java.util.ArrayList;

/**
 * Person类默认继承了Object类，所以可以使用Object类的equals方法；
 *      boolean equals(Object obj); 指示其他某个对象是否与此对象相等；
 * equals方法源码：
 *      public boolean equals(Object obj){
 *             return (this == obj);
 *         }
 * 参数：
 *       Object obj: 可以传递任意的对象；
 *       == 比较运算符：返回的是一个布尔值：true或false
 *       基本数据类型：比较的是值；
 *       引用数据类型:比较的是【两个对象的地址值】!!!
 *       this指的是：哪个对象调用的方法，this就是哪个对象；
 *       p1调用的equals方法，所以this在此时是p1;
 *       obj指的是：传递过来的参数p2;
 *       this == obj --> p1 == p2;
 *
 * 两个对象的地址值多数情况下一定不一样；
 * Object类的equals方法默认比较的是两个对象的地址值，没有意义；
 * 因此我们要重写equals方法以便于比较两个对象的属性(name, age)；
 * 存在一个问题:
 *       隐含着一个多态；
 *       多态的弊端：无法使用子类特有的内容（属性和方法）；
 *
 */


public class Object02equals {
    public static void main(String[] args) {
        Person p1 = new Person("Steve",21);
        Person p2 = new Person("Steve",21);
        System.out.println("p1" + p1);   //不改写toString方法的情况下返回的应该是地址值
        System.out.println("p2" + p2);

        // p1 = p2  //指的是把p2的地址值赋给p1
        ArrayList<String> list = new ArrayList<>();

        boolean b = p1.equals(p2);
        System.out.println(b);

    }
}
