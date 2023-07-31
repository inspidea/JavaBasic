package Part03_ObjectOriented;

/**构造方法是专门用来创建对象的方法；
 * 当我们通过关键字new来创建对象时实际上就是在调用构造方法；
 * 格式：
 * public 类名称(参数类型 参数名称){
 *     方法体
 * }
 *
 * 注意事项：
 * 1. 构造方法的名称必须和所在类的名称完全一样，连大小写也一样；
 * 2. 狗洗澡方法不要写返回值类型，连void都不屑
 * 3. 构造方法不能return返回一个具体返回值
 * 4. 如果没有编写任何构造方法，那么编译器会默认生成一个构造方法，没有参数和方法体，什么都不做
 *    public Student(){}
 * 5. 一旦编写了至少一个构造方法，编译器则不再生成
 * 6. 构造方法也可以进行重载
 */

public class Student {

    private String name;
    private int age;

    //无参数构造方法
    public Student(){
        System.out.println("执行无参构造方法·");
    }

    //全参数构造方法
    public Student(String name, int age){
        System.out.println("执行全参构造方法");
        this.name = name;
        this.age = age;
    }

    //Getters & Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
