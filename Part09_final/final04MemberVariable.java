package Part09_final;

/**
 * 对于成员变量来说，如果使用final关键字修饰，那么这个变量也不可变；
 *
 * 1. 由于成员变量具有默认值，所以使用final时必须手动赋值，不再提供默认值；
 * 2. 对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值；
 * 3. 必须保证类当中所有的重载构造方法，都最终对final的成员变量进行赋值；
 *    否则则直接使用直接赋值，二者选其一；
 */

public class final04MemberVariable {


    //方法1，直接赋值：
    private final String name = "name";

    public final04MemberVariable() {
    }

    public final04MemberVariable(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    }


//    //方法2，构造方法赋值：
//    private final String name;
//
//    public final04MemberVariable() {
//    }
//
//    public final04MemberVariable(String name) {
//        name = "name";
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    //去掉Setter（因为final关键字修饰的变量已经在前面被赋值一次，不能再次赋值）

}
