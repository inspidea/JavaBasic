package Part02_Array;

/**数组作为方法的返回值
 *
 */

public class demo06ArrayParam {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};  //地址值

        printArray(array);      //传递进去的是array当中保存的地址值
        System.out.println("=================");
        printArray(array);
    }

    /**
     * 通过创建方法并调用的方式来完成多次重复的工作
     *
     * 三要素：
     * 返回值类型：只是打印，不需要计算，没有结果，用void；
     * 方法名称：printArray；
     * 参数列表：必须给出数组，才能打印其中元素： int[] array；
     */
    public static void printArray(int[] array){
        System.out.println("printArray方法接收到的参数是：");
        System.out.println("地址值：" + array);
        for (int i = 0; i < array.length; i++){

            System.out.println(array[i]);
        }
    }
}
