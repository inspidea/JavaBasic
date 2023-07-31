package Part11_ClassRelevant.Chapter4_Object;

import java.util.Objects;

public class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//   接打印对象的地址值没有意义，因此需要重写Object类的toString方法；
//   打印对象属性（name, age);

    //1. 手动输入写法重写
//    @Override
//    public String toString(){
//        return "Person{name = " + name + ", age = " + age + "}";
//    }

    //2. 自动补全方法重写：Alt+Home（程序默认Alt+Insert），选用toString()方法；
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

//   两个对象的地址值多数情况下一定不一样；
//   Object类的equals方法默认比较的是两个对象的地址值，没有意义；
//   因此我们要重写equals方法以便于比较两个对象的属性(name, age)；
//   存在一个问题:
//       隐含着一个多态；
//       多态的弊端：无法使用子类特有的内容（属性和方法）；
//    解决：可以使用向下转型(强转)把obj类型转换为Person



    //============================================================================

//    1. 手动输入写法（可不记忆）：
//    @Override
//    public boolean equals(Object obj){
//        //增加一个判断，传递的参数obj如果是this本身，直接返回true； -------------为了提高程序效率，可选省略
//        if(obj == this){
//            return true;
//        }
//
//        //增加一个判断，传递的参数obj如果是null，直接返回null；     -------------为了提高程序效率，可选省略
//        if(obj == null){
//            return false;
//        }
//
//        //在使用强转之前，要增加一个判断，防止类型转换异常ClassCastException； ---为了避免程序报错，不可省略
//        if(obj instanceof Person){    //若判断是Person类型，则进行强转操作；
//
//            //使用向下转型(强转)把obj类型转换为Person；
//            Person p = (Person)obj;
//            //equals方法有一个boolean返回值，因此必须设定一个boolean变量用于存放该方法的返回值；
//            //不能单独只写一个equals方法；
//            boolean b = this.name.equals(p.name) && this.age==p.age;
//            return b;
//        }
//        //若不是Person类型则直接返回false
//        return false;
//    }

    //============================================================================

//    2. 自动补全方法：Alt+Home（软件默认Alt+Insert），选择equals() and hashCode();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // 使用反射技术，判断o是否是Person类型：    //------------------------（未来知识点）
        // 等效于obj instanceof Person
        // if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);    //---------(Object03Objects知识点)
    }

    @Override
    public int hashCode() {                     //------------------（未来关于集合的知识点)
        return Objects.hash(name, age);
    }

    //==============================================================================

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
