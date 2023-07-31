package Part07_IterfaceMore;

/**
 * 使用接口时应注意：
 * 1. 接口不能有静态代码块，接口不能有构造方法;
 * 2. 一个类的直接父类是唯一的，但一个类可以同时实现多个接口；
 *    格式：
 *    public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
 *    //覆写所有抽象方法
 *    }
 *
 * 3. 如果实现类所实现的多个接口当中，存在重复的抽象方法，只需要覆盖重写一次即可；
 *
 * 4. 如果实现类没有覆写所有接口当中的所有抽象方法，那么实现类就必须是一个抽象类；
 *
 * 5. 如果实现类所实现的多个接口中，存在重复的默认方法；
 *   （无论抽象类与否）那么实现类一定要对冲突的默认方法进行覆盖重写；
 *
 * 6. 一个类如果直接父类当中的方法和接口当中的默认方法产生了冲突，会优先使用父类当中的方法；
 *
 */
public class InterfaceMore01 {
    public static void main(String[] args) {
        Son son = new Son();
        son.method();  //此时运行，父类方法优先
    }
}
