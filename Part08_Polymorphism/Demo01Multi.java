package Part08_Polymorphism;

/**
 * 代码中体现多态性：父类引用指向子类对象；
 * 格式：
 * 父类名称 对象名 = new 子类名称()；【或者】 接口名称 对象名 = new 实现类名称()；
 */


public class Demo01Multi {
    public static void main(String[] args) {
        //使用多态的写法
        //左侧父类的引用，指向了右侧子类的对象,这种形式即为多态；
        Father obj = new Son();

        obj.method();

        //父类独有的方法也可以被子类调用
        //举例：【动物】（父类）可以【吃鱼】（父类的方法），那么【猫】（子类）就也可以【吃鱼】；
        //     此时子类对象就被当做父类对象进行使用，因为【猫】（子类）也是一种【动物】（父类）；
        obj.methodFather();
    }
}
