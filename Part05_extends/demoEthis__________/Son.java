package Part05_extends.demoEthis__________;

/**
 * this关键字：
 *
 * super关键字用来访问父类的内容；
 * this关键字用来访问本类内容；
 *
 * 方法有三：
 * 1. 在本类的成员方法中，访问本类的成员变量；
 * 2. 在本类的成员方法中，访问本类的另一个成员方法；
 * 3. 在本类的成员方法中，访问本类的成员方法；
 *
 * 注意：
 * 1. 在地三种用法中，this(...) 也必须是构造方法的第一个语句, 且必须是唯一一个
 * 2. super和this两种构造调用不能同时使用
 */

public class Son extends Father {
    int num = 20;                    //本类的成员方法；

    //--------------------------------------------------------------------this关键字方法3

    public Son(){        //本类的无参构造
        this(111);    //本类的无参构造，调用本类的有参构造
    }

    public Son(int n){   //本类的有参构造
        this(1,2);
    }

    public Son(int n, int m){   //本类的有参构造
    }

    //--------------------------------------------------------------------this关键字方法1

    public void shoNum(){

        int num = 10;

        System.out.println(num);   //局部变量；
        System.out.println(this.num);   //本类中的成员变量
        System.out.println(super.num);  //父类中的成员变量
    }

    //--------------------------------------------------------------------this关键字方法2

    public void methodA(){
        System.out.println("AAA");   //本类的构造方法
    }

    public void methodB() {
        this.methodA();       //调用本类构造方法
        System.out.println("BBB");
    }








}
