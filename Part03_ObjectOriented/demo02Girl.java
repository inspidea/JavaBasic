package Part03_ObjectOriented;

/**通常情况下，一个类并不能直接使用，需要根据类创建一个对象才能使用
 *
 * 1. 导包：也就是指出需要使用的类再什么位置
 * import 包名称.类名称；
 * import day06.Girl;
 * 对于和当前类同属于一个包的情况，可以省略导包语句不写
 *
 * 2. 创建
 * 类名称 对象名 = new 类名称()；
 * Girl girl = new Girl();
 *
 * 3. 使用
 * 使用成员变量：对象名.成员变量名；
 * 使用成员方法：对象名.成员方法名(参数)；
 * （也就是，想用谁，就用对象名点谁）
 *
 * 注意事项：
 * 如果成员变量没有赋值，将有一个默认值，规则和数组一样
 */

public class demo02Girl {

    public static void main(String[] args) {
        //1. 导包
        //我需要使用的Girl类，与demo02Girl同属一个包下，省略不写

        //2. 创建，格式：类名称 对象名 = new 类名称()；
        //根据Girl类，创建了一个名为girl的对象；
        Girl girl = new Girl();

        //3. 试用期中的成员变量，格式：对象名.成员变量名；
        System.out.println(girl.name);  //未赋值默认值为null
        System.out.println(girl.age);   //未赋值默认值未0

        System.out.println("=======================");

        //改变对象当中的成员变量数值内容
        girl.name = "施丹";
        girl.age = 19;
        System.out.println("猪猪的女朋友是" + girl.name);
        System.out.println("她已经" + girl.age + "岁啦");

        //使用对象的成员方法，格式：
        //对象名.成员方法名
        System.out.println("施丹丹现在在干什么呢？");
        girl.eat();
        System.out.println();
        girl.heart();



    }


}
