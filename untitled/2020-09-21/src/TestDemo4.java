/**
 * 匿名内部类
 */
class Animal{
    public void func(){
        //这是字符串  Animal 中的 func 方法
        System.out.println("Animal::func");

    }
}

public class TestDemo4 {
    public static void main(String[] args) {
        new Animal(){
            @Override
            public void func() {
                System.out.println("重写了func方法");
            }
        }.func();
    }

}
