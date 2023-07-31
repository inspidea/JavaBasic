package Part11_ClassRelevant.Chapter8_ClassWrapper;

import java.util.ArrayList;

/**
 * 自动装箱和自动拆箱： 基本类型的数据和包装类之间可以自动的相互转换；
 * JDK 1.5之后出现的新特性；
 */

public class WrapperClass02 {

    public static void main(String[] args) {

        /**
         * 自动装箱：直接把int类型的整数赋值包装类
         * Integer in = 1； 相当于Integer in = new Integer(1):
         */
        Integer in = 1;

        /**
         * 自动拆箱： in是包装类，无法直接参与运算，可以自动转换为基本数据类型进行计算；
         * in+2； 就相当于 in.intValue() + 2 = 3；
         * in = in.inValue() + 2 = 3； 又是一个自动装箱
         */

        in = in + 2;

        ArrayList<Integer> list = new ArrayList<>();

        /**
         * ArrayList集合无法直接存储整数，但可以存储Integer包装类；
         */

        list.add(1); //->>自动装箱 list.add(new Integer(1));

        int a = list.get(0);   //--> 自动拆箱list.get(0).intValue();
    }


}
