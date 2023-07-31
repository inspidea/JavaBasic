package Part16_ListCollection;

import java.util.HashSet;

/**
 * HashSet存储自定义类型元素；
 *
 * set集合保证元素唯一：
 *     存储的元素(String, Integer,...Student,Person...),必须重写hashCode方法和equals()方法；
 *
 *     要求：
 *     同名同年龄的人，视为同一个人，只能存储一次
 *
 */
public class ListCollection07_HashSet {

    public static void main(String[] args) {
        //创建HashSet集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1= new Person("小明",19);
        Person p2= new Person("小明",19);
        System.out.println(p1.hashCode());
        //在没有重写hashCode的情况下，两个字面相同的Person类对象输出的哈希值不同；
        //即同一个人被存储了两次，此时需要重写hashCode方法；
        System.out.println(p2.hashCode());

        System.out.println(p1 == p2);  //false
        System.out.println(p1.equals(p2));  //true

        //根据上面代码输出的结果：哈希值相同 && equals方法返回true --> 两个元素是同一元素（人）
        //那么分别添加两个元素到set后，输出set的结果应该只有一个元素（两个相同的元素只被存储一次）
        set.add(p1);
        set.add(p2);
        System.out.println(set);   //[Person{name='小明', age=19}]
    }
}
