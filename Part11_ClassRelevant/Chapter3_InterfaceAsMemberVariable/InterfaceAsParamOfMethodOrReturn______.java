package Part11_ClassRelevant.Chapter3_InterfaceAsMemberVariable;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用接口作为方法的参数或返回值------------------------------------------------待理解知识点!!!
 * import java.util.List；正是ArrayList所实现的接口；
 */

public class InterfaceAsParamOfMethodOrReturn______ {

    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这就是多态写法
        List<String> list = new ArrayList<>();

        List<String> result = addName(list);
        for (int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }

    }

    public static List<String>  addName(List<String> list){
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        return list;
    }
}
