package Part03_ObjectOriented;

/**使用对象类型作为方法的参；
 *
 */
public class demo03GirlParam {

    public static void main(String[] args) {
        Girl girl1 = new Girl();
        girl1.name = "施丹";
        girl1.age = 19;

        method(girl1);
    }

    public static void method(Girl param){
        System.out.println(param.name);
        System.out.println(param.age);
    }
}
