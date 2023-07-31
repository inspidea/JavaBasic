package Part03_ObjectOriented;

public class demo07Person {

    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Steve");
        //person.age=20; (若不用private修饰）此处可以赋值负数，不报错但不合理
        person.setAge(20);
        person.setMale(true);

        System.out.println("姓名：" + person.getName());
        System.out.println("年龄：" + person.getAge());
        System.out.println("是不是男生：" + person.isMale());
    }


}
