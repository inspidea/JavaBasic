package Part04_Advanced;

/**
 * 静态代码块的格式是：
 *
 * public class 类名称{
 *     static{
 *         //静态代码块的内容
 *     }
 * }
 *
 * 特点：党第一次用到本类时，静态代码块执行唯一的一次；
 * 静态内容总是优先于非静态，所以静态代码块比构造方法先执行；
 *
 * 典型用途：
 * 用来一次性的对静态成员变量进行赋值；
 */

public class demo10staticSection {

    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }


}