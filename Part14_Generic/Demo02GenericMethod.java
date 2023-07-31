package Part14_Generic;

/**
 * 测试含有泛型的方法
 */


public class Demo02GenericMethod {

    public static void main(String[] args) {
        //创建GenericMethod的对象
        Generic02GenericMethod gm = new Generic02GenericMethod();

        //含有泛型的方法，再调用方法的时候确定泛型的数据类型；
        //传递什么类型的参数，泛型就是什么类型；

        gm.method01(10);
        gm.method01("abc");
        gm.method01(8.8);
        gm.method01(true);

        gm.method02(30);//静态方法，不建议创建对象使用

        //静态方法，通过：类名.方法名(参数)；可以直接使用；
        Generic02GenericMethod.method02(20);

    }
}
