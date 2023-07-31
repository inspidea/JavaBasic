package Part11_ClassRelevant.Chapter1_InnerClass;

public class Body {       //外部类

    public class Heart{   //成员内部类

        //内部类方法
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫：" + name);   //正确写法
        }
    }

    //外部类成员变量
    private String name;

    //外部类方法
    public void methodBody(){
        System.out.println("外部类方法");

        //在外部类方法内部创建一个内部类的对象，并调用内部类方法
        Heart heart = new Heart();
        heart.beat();

        //另一种简单写法
        new Heart().beat();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
