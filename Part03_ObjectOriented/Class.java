package Part03_ObjectOriented;

/**一个标准的类Class通常拥有下面四个组成部分
 *
 * 1. 所有成员变量都要使用private关键词修饰
 * 2. 为每一个成员变量编写一对Getter/Setter方法
 * 3. 编写一个无参数的构造方法
 * 4. 编写一个全参数的构造方法（也可能有包含部分参数的方法）
 *
 * 这样的标准的类叫做Java Bean
 */

public class Class {

    private String name;
    private int num;

    //使用Generate工具快速创建Getter&Setter和构造方法，顺序无影响

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Class(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
