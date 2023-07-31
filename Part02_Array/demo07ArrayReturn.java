package Part02_Array;

/**
 * 一个方法可以有0，1，或多个参数，但只能有0或1个返回值；
 * 如果希望一个方法中产生了多个结果数据并返回：
 * 使用一个数组作为返回值类型即可；
 */

public class demo07ArrayReturn {
    public static void main(String[] args) {


        int[] result = calc(10, 20, 30);

        System.out.println("main方法接收到的返回值数组是：");
        System.out.println("地址值：" + result);   //地址值
        System.out.println("总和=" + result[0]);
        System.out.println("平均值=" +result[1]);

    }


    public static int[] calc(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum / 3;

        int[] array = {sum, avg}; //静态初始化也可以使用变量作为元素

        System.out.println("calc方法内部数组是：");
        System.out.println("地址值：" + array);     //地址值

        return array;
    }

}
