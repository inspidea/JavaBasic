package Part02_Array;

/**直接打印数组名称，得到的是数组对应的内存地址哈希hash值。
 *访问数组元素的格式：数组名称[索引值]；
 * 索引值：一个int数字，代表数组中的元素的编号；
 * 【注意】索引值从0开始，一直到“数组的长度-1”为止；
 *
 * 静态初始化并访问
 */

public class demo02 {

    public static void main(String[] args) {
        int[] array = {10,20,30};    //[I@10f87f48 内存地址值

        System.out.println(array);

        System.out.println(array[0]);

    }
}
