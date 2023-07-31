package Part07_Interface;

/**
 * 从Java 8开始，接口内允许定义默认方法；
 *
 * 格式：
 * public default 返回值类型 方法名称(参数列表) {
 *    //方法体
 * }
 *
 * 备注：接口中的默认方法，可以解决接口升级的问题；
 */

public interface MyInterface02Default {

        //抽象方法
        public abstract void methodAbs();

        //新添加了一个抽象方法
        //public abstract void methodAbs2();

        //新添加的方法改为默认方法（解决：新添加方法会影响已经投入使用的接口的问题）
        public default void methodDefault(){
                System.out.println("这是新添加的默认方法");
        }


}
