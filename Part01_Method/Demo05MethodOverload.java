package Part01_Method;

/**对于功能类似的方法，因为参数列表不一样，需要记住太多不同方法很麻烦；
 * 方法的重载（Overload）：多个方法的名称一样，但参数列表不一样；
 * 只需要记住唯一一个方法名称，就可以实现类似的多个功能；
 *
 * 方法重载与下列因素相关：
 * 1. 参数个数不同
 * 2. 参数类型不同
 * 3. 参数多类型顺序不同
 *
 * 与下列因素无关：
 * 1. 参数的名称
 * 2. 与方法的返回值无关
 */

public class Demo05MethodOverload {
    public static void main(String[] args) {
//        System.out.println(sumTwo(10, 20));
//        System.out.println(sumThree(10, 20, 30));
        System.out.println(sum(10, 20));          //所有的方法名称相同，根据参数选择与之匹配的方法执行
        System.out.println(sum(10, 20, 30));
    }

    public static int sum(int a, double b){
        return (int) (a+b);                             //强行转换类型
    }

    public static int sum(double a, int b){
        return (int) (a+b);
    }
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

}
