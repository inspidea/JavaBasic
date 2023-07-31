package Part11_ClassRelevant.Chapter1_InnerClass;

public class InnerClass02MemberInnerClass {

    public static void main(String[] args) {
        //外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Outer01SameName_This.Inner obj = new Outer01SameName_This().new Inner();
        obj.methodInner();
    }
}
