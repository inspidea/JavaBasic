package Part11_ClassRelevant.Chapter1_InnerClass;

//如果出现了重名现象，那么格式是： 外部类名称.this.外部类成员变量名

public class Outer01SameName_This {

    int num = 10;  //外部类成员变量

    public class Inner {
        int num = 20;  //内部类成员变量

        public void methodInner(){
            int num = 30;  //内部类方法的局部变量
            System.out.println(num);   //就近原则，输出结果是局部变量：30
            System.out.println(this.num);   //20

            //新知识点【对外部类成员变量的调用】
            System.out.println(Outer01SameName_This.this.num);      //10，此时不能用super调用，因为内外部类不是父子类继承关系
        }
    }
}
