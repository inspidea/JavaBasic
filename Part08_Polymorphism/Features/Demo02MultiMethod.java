package Part08_Polymorphism.Features;

/**
 * 在多态的代码中，成员方法的访问规则是：
 * 看new的是谁就优先用谁，没有就向上找；
 *
 * 口诀：
 * 成员【方法】：编译看【左边】，运行看【右边】 ——— 编译不通过则报错无法运行
 * 成员【变量】：编译看【左边】，运行还看【左边】
 */

public class Demo02MultiMethod {

    public static void main(String[] args) {
        Father obj = new Son();  //多态

        obj.method();  //父子都有的情况下，优先用子类的方法
        obj.methodFather();  //子类没有，父类有，则向上找到父类的方法

        //编译看左边，左边是Father，父类Father中没有MethodSon方法，所以编译报错
//       obj.methodSon(); //错误写法，
    }
}
