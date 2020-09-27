/**
 * 函数式接口定义：一个接口有且只有一个抽象方法
 */
//无返回值无参数
@FunctionalInterface
//注解---接口前面加上注解，说明这个接口是函数式接口，有且只有一个抽象方法
interface NoParameterNoReturn{
    void func();
    //default方法是一个例外-----jdk1.8的新特性，加了一个default方法在接口当中，default默认方法可以有具体的实现
   /* default void func2(){

    }*/
}

//无返回值一个参数
@FunctionalInterface
interface OneParameterNoReturn {
    void test(int a);
}
//无返回值多个参数
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a,int b);
}
//有返回值无参数
@FunctionalInterface
interface NoParameterReturn {
    int test();
}

//有返回值一个参数
@FunctionalInterface
interface OneParameterReturn {
    int test(int a);
}
//有返回值多参数
@FunctionalInterface
interface MoreParameterReturn {
    int test(int a,int b);
}

class Test{
    public void func(){
        System.out.println("func()");
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        final int a = 111;
        new Test(){
            @Override
            public void func() {
                System.out.println("重写function");
                System.out.println("我是捕获到变量 a == "+a
                        +" 我是一个常量，或者是一个没有改变过值的变量！");
            }
        };
    }
    public static void main2(String[] args) {
        NoParameterReturn noParameterReturn = ()->{
            return 10;
        };
        System.out.println(noParameterReturn.test());
        OneParameterReturn oneParameterReturn = (int a)->{
            return a;
        };
        System.out.println(oneParameterReturn.test(100));
        //优化精简
        OneParameterReturn oneParameterReturn2 = a -> a ;
        System.out.println(oneParameterReturn2.test(1000));
        MoreParameterReturn moreParameterReturn = (int a,int b)->{
            return a+b;
        };
        System.out.println(moreParameterReturn.test(10, 20));
    }
    public static void main1(String[] args) {
        NoParameterNoReturn noParameterNoReturn = () -> {
            System.out.println("无参数无返回值");
        };
        noParameterNoReturn.func();
        OneParameterNoReturn oneParameterNoReturn = ( a)->{
            return;
        };
        oneParameterNoReturn.test(10);
        MoreParameterNoReturn moreParameterNoReturn = (int  a,int b)->{
            System.out.println(a+" " +b);
        };
        moreParameterNoReturn.test(10,20);

    }
}
