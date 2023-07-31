package Part04_Advanced;

/**----------------------------------------------------------------需要进一步理解的知识点
 *
 * 匿名对象作为方法的参数
 *
 */

import java.util.Scanner;

public class demo03AnonymousParam_________ {
    public static void main(String[] args) {
        //普通使用方式
        //Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();

        //匿名对象的方式
        //int num = new Scanner(System.in).nextInt();
        //System.out.println(num);

        //使用一般写法传入参数
        //Scanner sc = new Scanner(System.in);
//        methodParam(sc) = new Scanner(System.in);
//        methodParam(sc);

        //使用匿名对象来传参
//        methodParam（new Scanner(System.in));
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println(num);

    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println(num);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }

}
