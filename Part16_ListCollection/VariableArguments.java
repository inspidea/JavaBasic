package Part16_ListCollection;

/**
 * 可变参数：是JDK1.5之后出现的新特性：
 * 使用前提：
 *     当方法的参数列表数据类型已经确定，但参数的个数不确定，可以使用可变参数；
 *  使用格式：定义方法时使用
 *     修饰符 返回值类型 方法名(数据类型... 变量名){}
 *  原理：
 *      可变参数的底层就是一个数组，根据传递参数的个数不同，会创建不同长度的数组；
 *      来存储这些参数，传递的参数的个数可以实0,...,n个;
 *
 *  注意事项：
 *      1. 一个方法的参数列表，只能有一个可变参数；
 *      2. 如果方法的参数有多个，那么可变参数必须写在参数列表的末尾；
 *         如：public static void method(String b, double c, int d, int...a){}
 *
 *  可变参数的特殊（终极）写法：
 *  public static void method（Object...obj){}     //可以接收任意数据类型的参数；
 */
public class VariableArguments {

    public static void main(String[] args) {
        //int i = add();
        //int i = add(10);
        //int i = add(10,20);
        int i = add(10,20,30,40,50,60,70,80,90,100);


        System.out.println(i);  //550
    }

    //定义一个方法，计算n(未知)个int类型的整数和；
    //已知要求为计算整数的和，因此已经【确定数据类型】int；
    //但【参数个数不确定】；
    //add()；就会创建一个长度为0的数组，new int[0];
    //add(10)；就会创建一个长度为1的数组，存储传递过来的参数，new int[]{10};
    //add(10,20);就会创建一个长度为2的数组，存储传递过来的参数，new int[]{10,20};

    public static int add(int...arr){//-----------------=----------可变参数的写法(变量和类型...变量名）
        //System.out.println(arr);  //[I@10f87f48   //底层是一个数组
        //System.out.println(arr.length);      //0;1;2;

        //定义一个初始化变量，记录累加求和；
        int sum = 0;
        //遍历数组，获取数组中的每一个元素
        for (int i : arr){
            sum += i;
        }
        //把求和结果返回
        return sum;
    }
}
