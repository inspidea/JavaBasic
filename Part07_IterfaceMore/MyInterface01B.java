package Part07_IterfaceMore;

public interface MyInterface01B {

    //接口不能有静态代码块
    //接口不能有构造方法

    public abstract void methodB();

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法BBB");
    }
}
