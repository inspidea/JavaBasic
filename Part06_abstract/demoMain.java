package Part06_abstract;

public class demoMain {

    public static void main(String[] args) {
        // Animal animal = new Animal()；  //错误写法!!! 不能直接new创建抽象类对象;

        Cat cat = new Cat();
        cat.eat();

    }
}
