package Part03_ObjectOriented;

/**问题：定义Person的年龄时，无法阻止不合理的数值背设置进来；
 * 解决方案：用private关键字将需要保护的成员变量进行修饰；
 *
 * 一旦使用了private进行修饰，那么本类中依然可以随意访问；
 * 但是！超出本类范围外就不能直接访问了；
 *
 * 间接访问private成员变量，就是定义一对Getter，Setter方法；
 * 必须用setXxx或者getXxx命名规则；
 * Getter不能有参数，返回值类型与成员变量对应；
 * Stter不能有返回值，参数类型与成员变量对应；
 *
 * 对于基本类型中的boolean值，Getter方法一定要写成isXxx形式，SetXXX规则变；
 *
 * 党方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量；
 * 如果需要访问本类中的成员变量，需要使用格式：
 * this.成员变量名；
 *
 * 通过谁调用的方法，谁就是this；
 *
 */

public class Person {

    private String name;
    private int age;
    private boolean male;

    public void showInfo(){
        System.out.println("我叫" + name + ",年龄是" + age);
    }

    //这个成员方法，专门用于向age设置数据（间接访问）
    public void setAge(int age){  //有参数无返回
        if (age < 100 && age >= 0){
            this.age = age;
        } else {
            System.out.println("invalid input！");
        }
    }

    public int getAge(){          //无参数无返回
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isMale() {
        return male;
    }
}
