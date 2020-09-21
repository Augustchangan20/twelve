/**
 * 内部类：
 * 1>实例内部类
 * 2>静态内部类
 * 3>匿名内部类
 */
class OuterClass{
    public int data1 = 1;
    public static int data2 = 2;
    /**
     * 实例内部类-----看作一个普通的实例数据成员
     * 实例成员的初始化依赖于外部对象的引用
     * 1> 如何拿到一个实力内部类的对象？
     * 2> 实例内部类是否有 额外的开销？
     * 有，实例内部类包含外部类的this
     * ！：this是一个静态的引用
     * 3>实例内部类是否可以定义一个静态的数据成员?
     * 不可以；  但是可以做到，只要是编译时期确定的值
     * eg:  final可以做到
     * final定义常量，常量在编译过程中就初始化了
     */
    class InnerClass{
        public int data1 = 11;
        public final static int data2 = 5;
        public int data3 = 3;
        public void func(){
            System.out.println(data1);
            System.out.println(OuterClass.this.data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println("innerclass func");
        }
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();
    }

}
