package Part07_Interface;

/**
 * 问题描述：-------对于【静态】方法，与前面同理的问题
 * 我们需要抽取一个公有静态方法，用来解决两个默认方法之间重复代码的问题；
 * 但这个公有方法不应该让实现类使用，应该是私有化的；
 *
 * 解决方法：
 * 从Java 9开始，允许接口当中定义私有方法；
 * 1. 普通私有方法，解决多个默认方法之间重复代码问题：
 * 格式：
 * private 返回值类型 方法名称(参数列表){
 *     方法体
 * }
 *
 * 2. 静态私有方法，解决多个静态方法之间代码重复的问题
 * 格式：
 * private static 返回值类型 方法名称(参数列表){
 *     方法体
 * }
 */

public interface MyInterface04PrivateB {

    public static void methodStatic1(){

        System.out.println("静态方法1");
        methodStaticCommon();

    }

    public static void methodStatic2(){

        System.out.println("静态方法2");
        methodStaticCommon();
    }

    private static void methodStaticCommon(){  //对静态方法使用私有方法，此时只有接口中的默认方法才可以使用，与前面同理
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");

    }
}
