package Part07_IterfaceMore;

/**
 *  接口与接口之间的多继承-------------------------------------重点知识点!!!
 *
 *
 * 1. 类与类之间是单继承的，直接父类只有一个；
 * 2. 类与接口是多实现的，一个类可以实现多个接口；
 * 3. 接口与接口之间是多继承的；
 *
 * 当一个接口继承的多个的接口中有重复的方法时，当前的接口中含有所有的方法（重复的也被多次算入）；
 *
 * 一个接口中可以有：
 * 1. 来源于自身的方法；
 * 2. 来源于被实现的接口的方法（可以来源于多个不同的接口）；
 * 3. 来源于多个接口的，重复的方法（可以来源于不同的接口）；
 *
 * 注意事项：
 * 1. 多个父接口中的抽象方法如果重复，【没关系】；
 * 2. 多个父接口中的默认方法如果重复，【有关系】；
 *    那么子接口必须进行默认方法的覆盖重写，【而且必须带着default关键字】；
 */

public class Relations_________ {
}
