package Part03_ObjectOriented;

/**
 * 局部变量和成员变量：
 *
 * 1. 定义的位置不一样【重点】
 * 局部变量：在方法的内部
 * 成员变量：在方法的外部，直接写在类当中
 *
 * 2. 作用范围不一样【重点】
 * 局部变量：只有在方法当中才能使用，出了方法就不能再用
 * 成员变量：整个类全部通用
 *
 * 3. 默认值不一样【重点】
 * 局部变量：没有默认值，如果想使用，必须手动赋值
 * 成员变量：如果没有赋值，回有默认值，规则和数组一致
 *
 * 4. 内存位置不一样（了解）
 * 局部变量：（跟着方法）位于栈内存
 * 成员变量：位于堆内存
 *
 * 5. 生命周期不一样（了解）
 * 局部变量：随着方法进栈而诞生，随着方法出栈而消失
 * 成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失
 * （java程序员无法控制何时进行垃圾回收）
 */

public class demo05VariableDifference {
    String name;   //成员变量

    public void methodA() {
        int num = 20;  //局部变量
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int param){      //方法的参数就是局部变量
        //参数在方法调用的时候，必然会被赋值;
        System.out.println(param);
        int age;       //局部变量，没赋值不能用
        System.out.println(name);
    }
}
