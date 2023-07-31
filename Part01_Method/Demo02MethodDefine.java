package Part01_Method;

/**
 * 定义方法的完整格式：
 * 修饰符 返回值类型 方法名称（参数类型 参数名称, ...){
 *     方法体
 *     return 返回值;
 * }
 *
 * 修饰符：现阶段的固定写法：public static
 * 返回值类型：也就是方法最终产生的数据结果是什么类型
 * 方法名称：方法的名字
 * 参数类型：进入方法的数据是什么类型
 * 参数名称：进入方法的数据对应的变量名称
 * PS：参数如果有多个，使用逗号进行分割
 * 方法体：方法执行的内容，若干行代码
 * return：停止当前方法，并将结果数据返回给调用处
 * return后面的返回值，必须和方法名称前面的“返回值类型”保持对应
 */

/**
 * 方法的三种调用格式：
 * 1.单独调用:方法名称(参数)
 * 2.打印调用：System.out.println(方法名称(参数))；
 * 3.赋值调用：数据类型 变量名称 = 方法名称(参数);
 */
public class Demo02MethodDefine {

    public static void main(String[] args) {
        //单独调用
        sum(10,20);
        System.out.println("=======");

        //打印调用
        System.out.println(sum(10,20));
        System.out.println("=======");

        //赋值调用
        int num = sum(15,25);
        System.out.println("变量的值：" + num);
    }

    public static int sum(int a, int b){
        int result = a+b;
        return result;
    }
}
