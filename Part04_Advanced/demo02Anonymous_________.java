package Part04_Advanced;

/**
 * 创建对象的标准格式：
 * 类名称 对象名 = new 类名称；
 *
 * 注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象；-------------------------需深入理解知识点
 * 使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象；
 *
 */

public class demo02Anonymous_________ {

    public static void main(String[] args) {
        //左边的one就是对象的名字；
        //Person one = new Person();
        //one.name = "Steve";
        //one.showName();

        //匿名对象----------------------------------------------只能用一次
        //new Person().name = "Venus";
        //new Person().showName();      //打印结果 我叫null

    }


}
