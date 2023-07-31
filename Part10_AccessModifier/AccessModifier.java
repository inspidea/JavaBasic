package Part10_AccessModifier;

/**
 * Java 有4种权限修饰符：
 *               public   >   protected  >   (default)   >   private         巧记方法
 * 同一个类        YES            YES            YES            YES           --我自己
 * 同一个包        YES            YES            YES             /            --我邻居
 * 不同包子类      YES            YES             /              /            --我儿子
 * 不同包非子类    YES             /              /              /            --陌生人
 *
 * 有权限访问的前提下，注意：访问【不同包】的Class类需要【import】导包；
 */

public class AccessModifier {
}
