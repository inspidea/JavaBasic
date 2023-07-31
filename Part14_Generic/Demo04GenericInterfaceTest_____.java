package Part14_Generic;

//测试含有泛型的接口---------------------------------------------------------待分析!!!

public class Demo04GenericInterfaceTest_____ {

    public static void main(String[] args) {
        //创建Demo03GenericInterfaceImpl1对象
        Demo03GenericInterfaceImpl1 gi1 = new Demo03GenericInterfaceImpl1();
        gi1.method("字符串");

        //创建Demo03GenericInterfaceImpl2对象                    //----------------------------------------有困惑
        Demo03GenericInterfaceImpl2<Integer> gi2 = new Demo03GenericInterfaceImpl2<>();     //问题？<>怎么用
        gi2.method(10);

        Demo03GenericInterfaceImpl2 <Double> gi3 = new Demo03GenericInterfaceImpl2<>();     //问题？<>怎么用
        gi2.method(20);
    }
}
