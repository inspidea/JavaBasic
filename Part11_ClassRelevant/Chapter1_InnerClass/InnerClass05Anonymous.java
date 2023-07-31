package Part11_ClassRelevant.Chapter1_InnerClass;

/**
 * 匿名内部类：
 *
 * 如果接口的实现类（或者是父类的子类），只需要使用唯一一次；
 * 那么这种情况下就可以省略掉该类的定义，改为使用【匿名内部类】；
 *
 * 定义格式：
 * 接口名称 对象名称 = new 接口名称(){
 *     //覆盖重写所有抽象方法
 * };  --------------------------注意，特殊写法：这里大括号后有一个分号!!!
 *
 * 注意事项：
 * 对格式“new 接口名称 () {。。。}”进行解析：
 * 1. new代表创建对象的动作；
 * 2. 接口名称就是匿名内部类需要实现哪个接口；
 * 3. {...} 才是匿名内部类的内容；
 *
 * 另外还要注意：
 * 1. 匿名内部类，在【创建对象】的时候，只能使用唯一一次；
 *    如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了；
 * 2. 匿名对象，在【调用方法】的时候，只能调用唯一一次；
 *    如果希望同一个对象，调用多次方法，那么就必须给对象起一个名字；
 * 3. 匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】；
 *    强调：匿名内部类和匿名对象不是一回事
 *
 *
 */

public class InnerClass05Anonymous {
}