package Part11_ClassRelevant.Chapter3_InterfaceAsMemberVariable;

//接口作为成员变量类型

public class Game {

    public static void main(String[] args) {

        //创建一个英雄角色
        Hero hero = new Hero();
        hero.setName("艾希");

        //设置英雄技能

        //1. 使用单独定义的实现类
//        hero.setSkill(new SkillImpl());


        //2. 还可以改成使用匿名内部类

//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("pia~pia~pia~");
//            }
//        };                                //-------------------------注意匿名内部类大括号后面有分号
//        hero.setSkill(skill);
//
//        hero.attack();

        //3. 进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("biu~pia~");
            }
        });

        hero.attack();
    }
}
