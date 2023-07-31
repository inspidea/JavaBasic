package Part14_Generic;

/**
 * Generic泛型      --------------------------------------------重点知识点!!!
 *
 * 泛型：是一种未知数据类型，当我们不知道是用什么数据类型的时候可以使用泛型；
 *      E e： Element 元素；
 *      T t： Type 类型；
 *
 * ArrayList集合定义的时候，不知道集合中都会存储什么类型的数据，所以类型使用泛型；
 *
 * E：未知的数据类型：
 * public class ArrayList<E>{
 *     public boolean add(E e){}
 *     public E get(int index){}
 * }
 *
 * public class ArrayList<String>{
 *     public boolean add(String e){}
 *     public String get(int index){}
 * }
 *
 * //创建集合对象的时候，就会确定泛型的数据类型:
 * //ArrayList<String> list = new ArrayList<String>()；
 * //此时会把数据类型作为参数传递，(把String)赋值给泛型E；
 * public class ArrayList<String>{
 *     public boolean add(String e){}
 *     public String get(int index){}
 * }
 *
 *  //ArrayList<Student> list = new ArrayList<Student>()；
 *  //同理，此时会把数据类型作为参数传递，(把Student)赋值给泛型E；
 *  public class ArrayList<Student>{
 *     public boolean add(Student e){}
 *     public Student get(int index){}
 * }
 */



public class Generic00___________ {
}
