package Part03_ObjectOriented;

/**
 * 定义一个类，来模拟"学生"事物，其中有两个组成部分：
 *
 * 属性（是什么）：
 * 姓名
 * 年龄
 *
 * 行为（能做什么）：
 * 吃饭
 * 睡觉
 * 学习
 *
 * 对应到java的类中：
 *
 * 成员变量（属性）：
 *      String name；           //姓名
 *      int age；               //年龄
 * 成员方法（行为）：
 *      public void eat() {}    //吃饭
 *      public void sleep() {}  //睡觉
 *      public void study() {}  //学习
 *
 * 注意事项：
 * 1. 成员变量是直接定义在类当中，方法外边的；
 * 2. 成员方法不要写static关键字
 */

public class Girl {

    //先不写main方法

    //成员变量（没有static）
    String name; //姓名
    int age;     //年龄

    //成员方法
    public void eat(){
        System.out.println("恰饭!");
    }

    public void sleep(){
        System.out.println("睡觉觉!");
    }

    public void study(){
        System.out.println("学习!");

    }

    public void heart() {
        for (float i = 1.5f; i > -1.5f; i -= 0.15f) {
            for (float j = -1.5f; j < 1.5f; j += 0.05f) {
                float a = i * i + j * j - 1;
                String str = (a * a * a - j * j * i * i * i) <= 0.0f ? "*" : " ";
                System.out.print(str);
            }
            System.out.println("");
        }
    }

}
