package com.bit.demo;

import java.awt.font.ShapeGraphicAttribute;

class Shape{
    public  void draw(){

    }
}
class Cycle extends Shape {
    @Override//注解 要重写的方法
    public void draw() {
        System.out.println("画一个圆");
    }
}
class React extends Shape{
    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
class Flower extends Shape{
    @Override
    public void draw() {
        System.out.println("画一朵花");
    }
}
public class TestDemo2 {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();//向上转型
        Shape shape3 = new Flower();
      /*  shape1.draw();
        shape2.draw();*/
      drawMap(shape1);
      drawMap(shape2);
      drawMap(shape3);

    }
    public static void drawShapes1() {
// 创建了一个 Shape 对象的数组.  降低了圈复杂度
        Shape[] shapes = {new Cycle(), new React(), new Cycle(),
                new React(), new Flower()};
        for (Shape shape : shapes) {//foreach 遍历数组
            shape.draw();
        }
    }
}
