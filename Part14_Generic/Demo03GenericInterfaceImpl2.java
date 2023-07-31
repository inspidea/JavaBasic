package Part14_Generic;

/**
 * 含有泛型的接口；
 * 第二种使用方法：
 * 接口使用什么泛型，实现类就使用什么泛型，类跟着接口走；
 * 就相当于定义了一个含有泛型的类。创建对象的时候确定泛型的类型；
 *
 * public interface List<E>>{
 *     boolean add(E e);
 *     E get(int index);
 * }
 *
 * public class ArrayList<E> implements List<e>{
 *     public boolean add(E e){}
 *     public E get(int index){}
 * }
 *
 */

public class Demo03GenericInterfaceImpl2<I> implements Generic03GenericInterface<I> {
    //在写含有泛型的接口的实现类的时候，不要忘记在【类名称】和【接口名称】后面都【加<泛型>】；
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
