package Part05_extends.demoC;

public class Son extends Father {

    @Override                    //@... 表示注解，该注解用于检测覆盖重写是否正确有效
    public Object method() {
        super.method();          //super.方法名：调用（重复利用）父类的方法（使用父类方法中的内容）
        //子类再来添加更多（父类不包含的）内容↓
        return null;
    }
}
