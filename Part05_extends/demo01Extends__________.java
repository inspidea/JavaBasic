package Part05_extends;

/**
 * 在继承关系中，子类就是一个父类，也就是说，子类可以被当作父类看待；
 *
 * 定义父类的格式：（一个普通的类定义）-------------------------------------重点知识点!!!
 * public class 父类名称{
 *     // ...
 * }
 *
 * 定义子类的格式：
 * public class 子类名称 extends 父类名称{
 *     // ...
 * }
 *
 * Java语言是单继承的；
 * 一个类的直接父类只能由唯一一个；
 *
 * class A{}
 * class B extends A{}  //正确写法
 *
 * class C{}
 * class D extends A,C{}  //错误写法
 *
 * java语言可以多级继承：
 *
 * class A{}
 * class B extends A{}
 * class C extends B{}    //正确写法
 *
 *总结：一个子类的直接父类是唯一的；
 * 但是一个父类可以有多个子类；
 */

public class demo01Extends__________ {

    public static void main(String[] args) {
        //创建一个子类老师的对象
        Teachers teacher = new Teachers();

        teacher.method();  //可以调用Teacher类中不存在的，而是继承自父类Employees的方法；

        //创建一个子类助教的对象
        Assistants assistant = new Assistants();
     }
}
