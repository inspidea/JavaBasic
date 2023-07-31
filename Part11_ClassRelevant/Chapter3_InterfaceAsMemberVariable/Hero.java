package Part11_ClassRelevant.Chapter3_InterfaceAsMemberVariable;

//一个游戏的英雄角色类

public class Hero {

    private String name;   //英雄名字
    private Skill skill; //英雄的技能

    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public void attack(){
        System.out.println(name + "开始释放技能：");
        skill.use(); //调用接口中抽象方法
        System.out.println("释放技能完成");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
