/**
 * 静态内部类
 * 是外部类的静态成员
 * 静态类当中不能访问外部类中的非静态成员,   若要访问，需要提供构造方法
 */
class OuterClass1 {
    public int data1 = 1;
    public static int data2 = 2;

    static class InnerClass1 {
        public int data1 = 11;
        public int data3 = 3;
        public OuterClass1 out;
        public InnerClass1(OuterClass1 out){
            this.out = out;
        }




        public void func() {
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(this.out.data1);

        }
    }
}

public  class TestDemo6 {


    public static void main(String[] args) {
        OuterClass1 outerClass1 = new OuterClass1();
        OuterClass1.InnerClass1 innerClass1 = new OuterClass1.InnerClass1(outerClass1);
        innerClass1.func();
    }
}
