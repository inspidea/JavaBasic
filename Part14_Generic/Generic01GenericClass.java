package Part14_Generic;

/**
 * 定义一个含有泛型的类，模拟ArrayList集合；
 * 反省是一个位置的数据类型，当我们不确定是什么数据类型的时候，可以使用泛型；
 * 泛型可以接收任意的数据类型，可以使用Integer，String，Student...
 * 创建对象的时候确定泛型的数据类型；
 */


//    非泛型的写法（使用String作为数据类型）
// public class Generic01 {
//     public String name;
//
//     public String getName() {
//         return name;
//     }
//
//     public void setName(String name) {
//         this.name = name;
//    }

//  ============================================================================

//    泛型写法
public class Generic01GenericClass<E>{           //在类名称后面加<E>，把所有的数据类型String改成E
    public E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
