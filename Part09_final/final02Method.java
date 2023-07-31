package Part09_final;

/**
 * 当final关键字用来修饰一个方法的时候，这个方法就是最终方法，不能被覆盖重写；
 * 格式：
 * 修饰符 final 返回值类型 方法名称(参数列表) {
 *     //方法体
 * }
 *
 * 注意事项：
 * 对于类和方法来说，abstract关键字和final关键字是不能同时使用的，因为矛盾；
 * 解释为：abstract子类必须覆盖重写方法体，而final关键字不允许方法被覆盖重写；
 */

public class final02Method {
    public final void method() {
        System.out.println("父类方法");
    }
}
