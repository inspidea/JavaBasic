package Part11_ClassRelevant.Chapter1_InnerClass;

/**   如果一个类是定义在一个方法内部的，那么这就是一个局部内部类
 *    “局部”：指的是只有当前所述方法才能使用它，出了这个方法就不能使用
 *
 *    定义格式：
 *    修饰符 class 外部类名称 {
 *        修饰符 返回值类型 外部类方法名称(参数列表) {
 *            class 局部内部类名称 {
 *                // ... （区别：局部内部类在方法内，成员内部类在方法外）
 *            }
 *        }
 *    }
 *
 */

public class Outer02LocalInnerClass {

    public void methodOuter(){
        class Inner {  //局部内部类（区别：局部内部类在方法内，成员内部类在方法外）
            int num = 10;
            public void methodInner(){
                System.out.println(num);  //10
            }
        }

        Inner inner = new Inner();    //通过在方法内部创建内部类的对象
        inner.methodInner();          //及调用内部类的方法（methodInner）
    }
}
