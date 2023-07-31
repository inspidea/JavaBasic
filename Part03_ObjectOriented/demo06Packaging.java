package Part03_ObjectOriented;

/**
 * 面向对象三大特征：封装，继承，多态；
 *
 * 封装性在java中的体现：
 * 1. 方法就是一种封装
 * 2. 关键字private也是一种封装
 *
 * 封装就是将一些细节信息隐藏起来，对外界不可见
 */

public class demo06Packaging {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int max = getMax(array);              //调用方法
        System.out.println("最大值：" + max);  //输出方法返回值
    }


    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
