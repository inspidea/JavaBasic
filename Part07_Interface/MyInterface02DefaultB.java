package Part07_Interface;

public class MyInterface02DefaultB implements MyInterface02Default {
    //这一行代码写好后把鼠标放在这一行代码，按Alt+Enter可以快速补全@Override方法的覆写/实现

    //当接口新添加了一个抽象方法后，重新添加覆写的方法会影响到已经投入使用的方法，此时可以使用默认方法

    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBB");   //这是新添加的默认方法（没有被覆盖重写的默认方法）
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写了接口的默认方法");  //实现类B覆盖重写了接口的默认方法（默认方法被覆盖重写）
    }
}
