package Part07_Interface;

/**
 * 1. 接口的默认方法，可以通过接口实现类对象，直接调用；
 * 2. 接口的默认方法，也可以被接口实现类进行覆盖重写；
 */

public class Interface02 {

    public static void main(String[] args) {
        //创建了实现类对象;
        MyInterface02Default a = new MyInterface02DefaultA();
        a.methodAbs();   //调用抽象方法，实际运行的是↑右侧实现类;

        //调用默认方法，如果实现类中没有，就向上找接口;
        a.methodDefault();

        System.out.println("=====================");

        MyInterface02DefaultB b = new MyInterface02DefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
