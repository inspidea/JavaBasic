package Part07_IterfaceMore;

public abstract class MyInterface02Abstract implements MyInterface01A, MyInterface01B{
    @Override
    public void methodA() {

    }

    //一个覆写被略过，则该实现类必须是一个抽象类（与继承同理）；

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口中冲突的默认方法进行了覆盖重写");
    }
}
