package Part05_extends;

/** 区分子类方法中重名的三种方法：
 *
 *
 */

//定义一个子类：老师
public class Teachers extends Employees {
    int num = 20;  //本类的成员变量

    public void method() {
        int num = 30;  //局部变量
        System.out.println(num);       // 30，局部变量；
        System.out.println(this.num);  // 20，本类的成员变量
        System.out.println(super.num); // 10，父类的成员变量
    }
}
