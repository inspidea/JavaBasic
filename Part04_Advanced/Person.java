package Part04_Advanced;

public class Person {

    private String name;
    private int age;

    public void showName(){
        System.out.println("我叫" + name);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    static {
        System.out.println("静态代码块执行");
    }

    public Person(){
        System.out.println("构造方法执行");
    }
}
