package com.bit.demo3;
//接口（interface):
//1>接口当中的方法，都是抽象方法
//2>其实可以有具体实现的方法。（JDK1.8加入的）
//3>接口当中定义的成员变量，默认是常量
//4>接口当中的成员变量默认是：public static final    成员方法是：public abstract
//5>接口时不可以被实例化的
//6>接口和类之间的关系 ： implements 实现的意思(不再是extends了）
//7>未来解决Java单继承的问题，可以实现多个接口
//8>只要这个类 实现了该接口，那么就可以进行向上转型了

interface Shape{
    void draw();
   /* public static final int a = 10;
    public abstract void draw();
    default  void func(){//方法需要被default修饰
        System.out.println("study");
    }*/
}
class Cycle implements Shape {
    @Override//注解 要重写的方法
    public void draw() {
        System.out.println("画一个圆");
    }
}
class React implements  Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
public class TestInterFace {
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();
        drawMap(shape1);
        drawMap(shape2);
    }
}
