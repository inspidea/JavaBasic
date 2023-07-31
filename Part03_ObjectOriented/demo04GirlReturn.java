package Part03_ObjectOriented;

/**使用对象类型作为方法的返回值；
 *
 */
public class demo04GirlReturn {

    public static void main(String[] args) {
        Girl girlA = getGirl();
        System.out.println(girlA.name);
        System.out.println(girlA.age);
    }

    public static Girl getGirl(){
        Girl girl2 = new Girl();
        girl2.name = "施丹";
        girl2.age = 19;
        return girl2;
    }
}
