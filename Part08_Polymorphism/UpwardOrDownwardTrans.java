package Part08_Polymorphism;

/**
 * 1. 对象的向上转型，其实就是多态写法：
 * 格式： 父类名称 对象名 = new 子类名称()；                  Animal animal = new Cat()；
 * 含义：右侧创建一个子类对象，把它当作父类来看待使用；         创建了一只猫，当作动物看待；
 * 注意事项：【向上转型一定是安全的】，从小范围转向了大范围      从小范围的猫，向上转换成更大范围的动物
 *
 * 类似于 double num = 100； //正确，int --> double, 自动转换类型；
 *
 * 对象的向上转型，就是：父类引用对象指向子类对象；
 *
 * 有弊端：转型到更大范围的父类，那么无法调用子类原有的特有方法
 *
 * 解决方法:
 * 2. 对象的向下转型，其实是还原的动作；
 * 格式： 子类名称 对象名 = (子类名称) 父类对象；
 * 含义：将父类对象，【还原】成为本来的子类对象；
 *
 * Animal animal = new Cat()； //本来是猫，向上转型成为动物；
 * Cat cat = (Cat) animal;     //本来是猫，已经被当做动物，还原成本来的猫；
 *
 * 注意事项：
 * 1. 必须保证对象本来创建的时候就是猫，才能向下转型成为猫；
 * 2. 如果对象创建的时候本来不是猫，现在非要向下转型成为猫，就会报错 (ClassCastException)；
 *
 * 类似于基本数据类型中的强制类型转换：
 * int num = (int) 10.0; //可以；    int num = (int) 10.5;  //不可以，精度损失；
 *
 *
 * 使用以下方法：
 * 格式：对象 instanceof 类名称；
 * 可以判断父类引用对象本来是什么子类，并得到一个boolean值；
 * 写法例如： if(animal instanceof Cat){}
 */

public class UpwardOrDownwardTrans {
}