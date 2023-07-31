package Part07_Interface;

public class MyInterface04PrivateAImpl implements MyInterface04PrivateA {

    public void methodAnother() {
        //直接访问到了接口中的默认方法，是错误的!
        //methodCommon();

    }
}
