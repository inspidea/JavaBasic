package Part04_Advanced;

/**一旦使用static修饰成员方法，那么就成了静态方法;------------------------------重点知识点!!!
 * 静态方法不属于对象而属于类；
 *
 * 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它；
 * 如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它；
 *
 * 无论是成员变量还是成员方法，如果有了static，都推荐使用类名称来进行调用；
 * 成员变量：类名称.静态变量；
 * 静态方法: 类名称.静态方法()；
 *
 * 注意事项：
 * 1. 静态不能直接访问非静态
 * 原因：因为在内存中是【线】有的静态内容，【后】有的非静态内容。
 * 2.
 */

public class demo09static_________Important {

    public static void main(String[] args) {
        MyClass obj = new MyClass();   //首先创建对象
        //然后才能使用没有static关键字的内容
        obj.method();

        //对于静态方法来说，可以通过对象名进行调用（不推荐）,也可以通过类名称类调用；
        MyClass.methodStatic();

        //对于本类中的静态方法，可以省略类名称
        myMethod();
        demo09static_________Important.myMethod();   //(不省略类名称，等效写法)
    }

    public static void myMethod() {
        System.out.println("自己的方法");
    }

}
