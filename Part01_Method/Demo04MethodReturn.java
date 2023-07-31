package Part01_Method;

/**
 * 有返回值：定义一个方法，用来【求出】两个数字之和；
 * 可以使用单独调用，打印调用或赋值调用；方法中必须有“return 返回值”；
 * 无返回值：定义一个方法，用来【打印】两个数字之和；不需要写return；
 * 只能使用单独调用；
 */

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(10,20);

        System.out.println(getSum(2, 3));//正确写法
        getSum(2, 3);//正确写法，但是返回值没有被用到

//        System.out.println(printSum(2, 3); //错误写法,相当于：
//        System.out.println(void);
    }

    public static int getSum(int a, int b){
        int result = a+b;
        return result;                              //有返回值int
    }

    public static void printSum(int c, int d) {      //使用void修饰无返回值方法
        int result = c + d;
        System.out.println("结果是：" + result);     //无返回值
    }
}


