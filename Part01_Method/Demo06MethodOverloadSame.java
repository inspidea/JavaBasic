package Part01_Method;

/**比较两个数据是否相等：
 * 参数类型分别为byte，short，int和long；
 * 在main方法中测试；
 */

public class Demo06MethodOverloadSame {

    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a, b));
        System.out.println(isSame((short) 20, (short) 20 ));
        System.out.println(isSame(11, 12));
        System.out.println(isSame(10L, 10L));    //将根据数据类型自动找匹配的方法执行
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("两个byte参数方法的执行：");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("两个short参数方法的执行：");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("两个int参数方法的执行：");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("两个long参数方法的执行：");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
