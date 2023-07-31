package Part11_ClassRelevant.Chapter8_ClassWrapper;

/**
 * Wrapper Class包装类；
 *
 * 装箱与拆箱的概念:
 * 装箱：把基本类型的数据，包装到包装类中（基本类型的数据 --> 包装类）
 *
 * 以Integer为例，
 *      构造方法：
 *      Integer(int value)；
 *      构造一个新分配的Integer对象，它表示指定的int值；
 *      Integer(String s)；
 *      构造一个新分配的Integer对象，他表示String参数所指示的int值；
 *      静态方法:
 *      static Integer valueOf(int i);
 *      返回一个指定的int值的Integer实例；
 *      static Integer valueOf(String s);
 *      返回保存指定的String的值的Integer对象；
 *
 * 拆箱：在包装类中取出基本类型的数据(包装类 --> 基本类型的数据)
 *       成员方法：
 *       int intValue()；
 *       以 int类型返回该Integer的值；
 *
 */

public class WrapperClass {
    public static void main(String[] args) {

        //装箱：
        //构造方法
        Integer in1 = new Integer(1);    //方法上有横线说明已经过时
        System.out.println(in1);    //重写了toString方法

        //静态方法
        Integer in2 = Integer.valueOf(1);
        System.out.println(in2);

        //Integer in3 = Integer.valueOf("a");   //会造成NumberFormatException数字格式化异常；

        //==============================================================

        //拆箱
        //成员方法
        int i = in1.intValue();
    }

}
