package Part07_IterfaceMore;

public interface MyInterface01A {

    //接口不能有静态代码块
    //接口不能有构造方法

    public abstract void methodA();

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }
}
