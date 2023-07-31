package Part07_IterfaceMore;

public class MyInterface01Impl /*extends Object*/ implements MyInterface01A, MyInterface01B {

    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写给了A，B接口都有的抽象方法（只覆写了一次）");
    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口中冲突的默认方法进行了覆盖重写");
    }
}
