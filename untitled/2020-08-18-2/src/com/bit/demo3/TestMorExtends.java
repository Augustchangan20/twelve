package com.bit.demo3;

class Animal{
    protected String name;//属性

    public Animal(String name) {//构造方法
        this.name = name;
    }
}
interface IFlying{//（过去要求）接口名称以I开头，尽量是动词
    void fly();
}
interface IRunning{
    void run();
}
interface ISwimming{
    void swim();
}
//一个类可以继承一个普通类/抽象类，并且可以同时实现多个接口
//先 extends  后 implements（实现）
class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}
class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游泳");
    }
}
class Frog extends Animal implements IRunning, ISwimming {
    public Frog(String name) {//提供带有一个参数的构造方法
        super(name);//引用父类
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在往前跳");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在蹬腿游泳");
    }
}
public class TestMorExtends {
    public static void walk(IRunning iRunning){
        System.out.println("我要冰淇淋");
        iRunning.run();
    }
    public static void main(String[] args) {
        IRunning iRunning = new Frog(("哇哇"));
        walk(iRunning);
    }
}
