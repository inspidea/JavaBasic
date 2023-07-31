package Part08_Polymorphism.Features;

/**
 * 访问成员变量的两种方式：
 * 1. 直接通过对象名称访问成员变量；看等号左边是谁，优先用谁，没有则向上找；
 * 2. 间接通过成员方法访问成员变量：该方法属于谁，则优先用谁，没有则向上找；
 */


public class Demo01MultiField {
    public static void main(String[] args) {
        //使用多态的写法，父类引用指向子类对象；
        Father obj = new Son();
        System.out.println(obj.num);
//      System.out.println(obj.age);  //错误写法，因为父类中没有，而且无法向下找

        System.out.println("===========");

        obj.showNum();  //子类如果没有覆写，结果就是父类的num值：10；
              //若子类已经覆盖重写，则向上找，结果就是子类的num值：20；
    }
}
