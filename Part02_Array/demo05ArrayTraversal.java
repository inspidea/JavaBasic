package Part02_Array;

/**
 * 遍历 traversal， 数组的遍历即为将数组中的每个元素逐一（默认是）打印输出；
 *
 * 使用int temp = a; a = b; b = temp; 的方法进行数组元素的反转
 */

public class demo05ArrayTraversal {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        //使用for循环
        for (int i = 0; i < array.length; i++){//使用获取数组长度避免反复修改循环次数的限定值，【使用分号；间隔条件】
            System.out.println(array[i]);
        }
    }
}
