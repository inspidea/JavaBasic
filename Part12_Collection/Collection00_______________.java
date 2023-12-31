package Part12_Collection;

/**
 * 集合：是Java中提供的一种容器，可以用来存储多个数据；  -----------------------重点知识点!!!
 * 与数组的区别：
 * 1. 数组的长度是固定的，集合的长度是可变的；
 * 2. 数组中存储的是同一类型的元素，可以存储基本数据类型值；
 *    集合存储的都是对象，而且对象的类型可以不一致；
 *    在开发中一般当对象多的时候，使用集合进行存储
 *
 * 集合框架的学习方式：
 * 1. 学习顶层：学习顶层接口/抽象类中的共性方法，所有的子类都可以使用；
 * 2. 使用底层：底层不是接口就是抽象类，无法创建对象使用，需要使用底层的子类创建对象使用；
 *
 *  集合框架图：
 *                               --------------------------------------------------------
 *                               |                   1.定义的是所有单列集合中共性的方法      |
 *                               |  Collection接口   2.所有的单列集合都可以使用共性的方法     |
 *                               |                  3.没有带索引的方法                     |
 *                               --------------------------------------------------------
 *    (继承：子类共性抽取形成父类接口)             ↓                              ↓
 * ----------------------------------------------------      --------------------------------------
 * |                1. 有序的集合（存储和取出元素顺序相同）|      |                1. 不允许存储重复元素 |
 * |    List接口    2. 允许存储重复的元素                |      |    Set接口     2. 没有索引，不能使用  |
 * |               3. 有索引，可以使用普通的for循环遍历   |      |                  普通的for循环遍历   |
 * ----------------------------------------------------       -------------------------------------
 *        ↓                 ↓                 ↓                      ↓          ↓
 *  ---------------   ---------------   ---------------      ---------------   ---------------
 *  |   Vector    |   |   ArrayList |   |  LinkedList |      |   TreeSet   |   |   HashSet   |
 *  |    集合     |   |     集合     |   |     集合     |     |     集合     |   |     集合     |
 *  ---------------   ---------------   ---------------      ---------------   ---------------
 *                                              （无序集合：存储取出元素的顺序可能不一致）  ↓
 *                                                                             ----------------
 *                                                                             | LinkedHashSet|
 *                                                                             |     集合      |
 *                                                                             ----------------
 *                                                                                   （有序集合）
 */

public class Collection00_______________ {
}
