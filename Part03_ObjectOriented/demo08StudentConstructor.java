package Part03_ObjectOriented;

public class demo08StudentConstructor {

    public static void main(String[] args) {
        Student stu = new Student();     //最后的类名称实际上就是构造方法
        System.out.println("==================");            //无参构造
        Student stu1 = new Student("Steve", 20);  //全参构造

        System.out.println("姓名：" + stu1.getName() + ",年龄：" + stu1.getAge());

        //如果需要改变对象中的成员变量数据内容，仍需要使用setXxx方法
        stu1.setAge(21);    //改变年龄
        System.out.println("姓名：" + stu1.getName() + ",年龄：" + stu1.getAge());

    }
}
