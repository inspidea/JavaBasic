package Part05_extends.demoB;

/**在父子类的继承关系中，创建子类对象，访问成员方法的规则：---------------------------重点知识点!!!
 * 创建的对象是谁，就先用谁，没有则想上找；
 *
 * 注意：无论是成员方法还是成员变量，如果没有都是想上找父类，不会向下找子类；
 *
 */

public class demo01ExtendsMethod________ {
    public static void main(String[] args) {
        Son son = new Son();

        son.methodSon();
        son.methodFather();     //----------------------------------复习 对象名.方法名()；概念!!!

        //创建的是new的子类对象，所以先用子类方法
        son.method();


    }


}
