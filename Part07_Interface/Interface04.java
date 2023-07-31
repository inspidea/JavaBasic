package Part07_Interface;

public class Interface04 {

    public static void main(String[] args) {
        MyInterface04PrivateB.methodStatic1();
        MyInterface04PrivateB.methodStatic2();

        //错误写法！因为该Common方法被设定为私有，只能被接口内方法调用
//        MyInterfacePrivateB.methodStaticCommon();
    }
}
