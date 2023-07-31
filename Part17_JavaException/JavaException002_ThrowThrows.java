package Part17_JavaException;
import java.io.*;   //使用处理异常的方法时需要导包
import java.rmi.RemoteException;

/**
 * throws/throw关键字
 *
 * 如果一个方法没有捕获到一个检查性异常，那么该方法必须使用 throws 关键字来声明。throws 关键字放在方法签名的尾部。
 * 也可以使用 throw 关键字抛出一个异常，无论它是新实例化的还是刚捕获到的。
 */

public class JavaException002_ThrowThrows {

    public void deposit(double amount) throws RemoteException {
        // Method implementation
        throw new RemoteException();
    }
    //Remainder of class definition

    public void withdraw(double amount) throws RemoteException, RemoteException {   //抛出多个异常用逗号隔开；
        // Method implementation
    }
    //Remainder of class definition
}
