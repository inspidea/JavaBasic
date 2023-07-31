package Part17_JavaException;
import java.io.*;   //使用处理异常的方法时需要导包

/**
 * try/catch关键字
 * 捕获异常
 * try
 * {
 *    // 程序代码
 * }catch(ExceptionName e1)
 * {
 *    //Catch 块
 * }
 *   //Catch 语句包含要捕获异常类型的声明。当保护代码块中发生一个异常时，try 后面的 catch 块就会被检查。
 *   //如果发生的异常包含在 catch 块中，异常会被传递到该 catch 块，这和传递一个参数到方法是一样。
 *
 * 多重捕获块
 *     try{
 *         // 程序代码
 *     }catch(异常类型1 异常的变量名1){
 *         // 程序代码
 *     }catch(异常类型2 异常的变量名2){
 *         // 程序代码
 *     }catch(异常类型2 异常的变量名2){
 *         // 程序代码
 *     }
 *
 *     //可以在 try 语句后面添加任意数量的 catch 块。
 *     //如果保护代码中发生异常，异常被抛给第一个 catch 块。
 *     //如果抛出异常的数据类型与 ExceptionType1 匹配，它在这里就会被捕获。
 *     //如果不匹配，它会被传递给第二个 catch 块。
 *     //如此，直到异常被捕获或者通过所有的 catch 块。
 */


public class JavaException001_TryCatch {

    //捕获异常实例
    public static void main(String args[]){
        try{
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
            //Exception thrown  :java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
        }
        System.out.println("Out of the block"); //Out of the block
    }
}
