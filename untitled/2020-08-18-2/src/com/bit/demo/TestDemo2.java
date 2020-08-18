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
public class TestDemo2 {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();//向上转型
      /*  shape1.draw();
        shape2.draw();*/
      drawMap(shape1);
      drawMap(shape2);

    }
}
