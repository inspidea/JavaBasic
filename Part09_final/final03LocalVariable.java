package Part09_final;

public class final03LocalVariable {


    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1); //10
        num1 = 20;
        System.out.println(num1); //20

        //一旦使用final来修饰局部变量，那么这个变量就不能进行修改
        // “一次赋值，终生不变”
        final int num2 = 200;
        System.out.println(num2);
        // num2 = 300;              //错误写法!!!final修饰的局部变量不可变

        //对于【基本类型】来说，不可变指的是变量当中的【数据】不可改变
        //对于【引用类型】来说，不可变指的是变量中的【地址值】不可改变
    }
}
