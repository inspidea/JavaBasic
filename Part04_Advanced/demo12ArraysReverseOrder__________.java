package Part04_Advanced;

import java.util.Arrays;

/**
 * 使用Arrays相关API，将穗子字符串中所有字符升序排列并倒序打印
 */
public class demo12ArraysReverseOrder__________ {

    public static void main(String[] args) {
        String str = "asv869ca7vd0afd8g07s8f9d0";

        //升序排列：sort；
        //必须是一个数组，才能用Arrays.sort方法
        //String --> 数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);  //升序排列

        //需要倒序遍历----------------------------------------for循环倒叙写法!!!
        for (int i = chars.length - 1 ; i >= 0; i--){
            System.out.print(chars[i]);
        }
    }
}
