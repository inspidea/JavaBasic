package Part07_Interface;


/**
 * 接口当中也可以定义成员变量，但是必须使用public static final三个关键字进行修饰；
 * 从效果上看，这其实就是接口的【常量】；
 *
 * 格式：
 * public static final 数据类型 常量名称 = 数据值；
 *
 * 一旦使用final关键字进行修饰，说明不可改变
 *
 * 注意；
 *
 *
 * 1. 接口当中的常量可以省略public static final;
 *   【不写也是相同的效果】，因此可以选择性省略，与抽象方法省略关键字同理；
 *
 * 2. 接口中的常量，必须进行赋值，不能不赋值；
 *
 * 3. 接口中常量的名称，要求使用完全大写的字母，用下划线进行单词分割；
 */
public interface MyInterface05Constant {

    //这就是一个常量，一旦赋值就不可修改，对于常量一定要进行明确的赋值
    public static final int NUM_OF_CONSTANT = 10;
}
