package Part14_Generic;

public class Demo01Generic {

    public static void main(String[] args) {
        //不写泛型默认为Object类型
        Generic01GenericClass gc = new Generic01GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();

        //创建GenericClass对象，泛型使用Integer类型；
        Generic01GenericClass<Integer> gc2 = new Generic01GenericClass<>();
        gc2.setName(111);

        Integer name = gc2.getName();
        System.out.println(name);

        //创建GenericClass对象，泛型使用String类型；
        Generic01GenericClass<String> gc3 = new Generic01GenericClass<>();
        gc3.setName("AAA");

        String name1 = gc3.getName();
        System.out.println(name1);

    }
}
