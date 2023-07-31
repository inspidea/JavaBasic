package Part05_extends;

/**
 * 父类不能使用子类的内容；
 * 子类可以使用父类和子类的内容；
 *
 * 在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式：
 *
 * 1. 直接通过子类对象访问成员变量：
 * 等号左边是谁，就先用谁，没有则向上（子类 -> 父类）找；
 *
 * 2. 间接通过成员方法访问成员变量：
 * 在子类中可以定义成员方法，此时创建的方法不会向下找子类；
 * 方法属于谁（定义在哪里：子类或父类），就先用谁，没有则向上找；
 *
 */

public class demo02ExtendsField {

    public static void main(String[] args) {
        Teachers teacher = new Teachers();
        teacher.method();
    }
}
