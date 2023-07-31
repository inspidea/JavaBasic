package Part17_JavaException;

/**
 *  finally 关键字
 *
 *  用来创建在 try 代码块后面执行的代码块。
 *  无论是否发生异常，finally 代码块中的代码总会被执行。
 *  在 finally 代码块中，可以运行清理类型等收尾善后性质的语句。
 *  finally 代码块出现在 catch 代码块最后，语法如下：
 *
 * try{
 *   // 程序代码
 * }catch(异常类型1 异常的变量名1){
 *   // 程序代码
 * }catch(异常类型2 异常的变量名2){
 *   // 程序代码
 * }finally{
 *   // 程序代码
 * }
 *
 */


public class  JavaException003_finally {
    public static void main(String args[]){
        int a[] = new int[2];
        try{
            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
            //Exception thrown  :java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
        }
        finally{
            a[0] = 6;
            System.out.println("First element value: " +a[0]);  //First element value: 6
            System.out.println("The finally statement is executed");//The finally statement is executed
        }
    }
}

