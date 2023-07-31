package Part08_Polymorphism.Features;

public class Son extends Father {

    int num = 20;

    int age = 16;

    public void method(){
        System.out.println("子类方法");
    }

    public void methodSon(){
        System.out.println("子类特有方法");
    }
}
