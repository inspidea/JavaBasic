package Part04_Advanced;

import java.util.ArrayList;

/**
 * ArrayList重的常用方法有：
 *
 * public boolean add(e e)； 相机和中添加元素，参数的类型和泛型一致；
 * public e get(int index)； 从集合中获取元素，参数是索引编号，返回值就是对应位置的元素；
 * public e remove(int index)；从集合中删除元素，参数是索引编号，返回值就是被删掉的元素；
 * public int size()； 获取集合的尺寸长度，返回值就是集合中包含的元素个数
 *
 * 泛型只能是引用类型，不能是基本类型（int等）；
 * 如何向集合中存储基本类型: 必须使用基本类型对应的包装类；
 *
 * 基本类型 包装类（引用类型，包装类都位于java.lang包下）
 * byte     byte
 * short    short
 * int      integer    【特殊】
 * long     long
 * float    float
 * double   double
 * char     character  【特殊】
 * boolean  boolean
 *
 * 从java 1.5+开始，支持自动装箱，自动拆箱；
 * 自动装箱：基本类型 --> 包装类型；
 * 自动拆箱：包装类型 --> 基本类型；
 */
public class demo07ArrayListMethods {

    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();

        list.add("AAA");

        int size = list.size();
        System.out.println(size);

        list.remove(0);
        System.out.println(list);

        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(100);
        listA.add(200);
        System.out.println(listA);
    }
}
