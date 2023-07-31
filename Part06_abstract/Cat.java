package Part06_abstract;

public class Cat extends Animal{
//    这一行代码写好后把鼠标放在这一行代码，按Alt+Enter可以快速补全@Override方法的覆写/实现

    public Cat(){
        //super();   //"赠送"的super方法
        System.out.println("子类构造方法执行");
    }

    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }


}
