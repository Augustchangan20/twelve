package com.bit.demo2;
//抽象类：
//抽象方法：一个方法被absstract修饰，就是抽象方法，抽象方法可以没有具体的实现
//包含抽象方法的类，抽象类
//!!!:1>抽象类不可以被实例化 ，不可以Shape shape = new Shape() {
  //2>  类内的成员数据，和普通类没有区别
  //3>  抽象类主要就是用来被继承的
  //4>  如果一个类继承了这个抽象类，那么这个类必须重写抽象类中的抽象方法
  //5>  当抽象类A继承抽象类B，那么A可以不重写B中的方法，但是A要是继续被继承，那么一定还要在重写这个抽象方法
  //6>  抽象类或者抽象方法，一定不能是被final修饰的

abstract class Shape{
    public abstract void draw();
}
class Cycle extends Shape {
    @Override//注解 要重写的方法
    public void draw() {
        System.out.println("画一个圆");
    }
}
/*abstract class Cycle extends Shape{
//不想重写可以把这个类也变成抽象类

}*/
class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("画一朵❀");
    }
}
public class TestDemo {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();
        Shape shape3 = new Flower();
        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);

    }
}
