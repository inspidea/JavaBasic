package Part04_Advanced;

/**
 * 定义一个数组用来存储3歌Person对象；
 *
 * 数组有一个缺点，一旦创建，程序运行期间长度无法改变；
 */

public class demo05Array_Class {

    public static void main(String[] args) {
        //创建一个长度为3的数组，用来存放Person类型的对象
        Person[] array = new Person[3];

        Person one = new Person("AAA", 11);
        Person two = new Person("BBB", 12);
        Person three = new Person("CCC", 13);

        //将地址赋值到数组的n号元素位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

    }
}
