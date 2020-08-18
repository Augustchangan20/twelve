package com.bit.demo2;
import sun.util.resources.cldr.ml.CalendarData_ml_IN;
class Animal {//类
    protected String name;//属性
    public Animal(String name){//构造方法
        this.name = name;
        System.out.println("Animal(String)");
    }

    public void sleep() {//方法
        System.out.println("Animal::sleep()");
    }

    public void  eat() {
        System.out.println(this.name+"    Animal::eat()");
    }
}
class Cat extends Animal {
    public int count = 99;
    public Cat(String name){//先给父类构造
        super(name);//显示调用
        System.out.println("Cat(String)");
    }
    public void  eat() {
        System.out.println(this.name+"    Animal::eat()");
    }
}
class ChineseGardenCat extends Cat {

    public ChineseGardenCat(String name) {
        super(name);
    }
}
class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    public void fly(){
        System.out.println(this.name + "Bird::fly()");
    }
}
public class TestMain {

    public  static Animal func(){
        //返回值
        return new Cat("maomao");
    }
    public static void main(String[] args) {
        Animal animal = func();
        animal.eat();
    }

    public static void func(Animal animal){
        //传参
        animal.eat();
    }
    public static void main3(String[] args) {
        Cat cat = new Cat("maommao");
        func(cat);
    }

    public static void main2(String[] args) {
        //向上转型  父类引用 引用子类对象
        Animal animal = new Cat("maomao");
        animal.eat();
        //animal.count;  error
        //向上转型之后，通过父类的引用  只能访问父类自己的方法或者属性
        //父类引用  只能访问自己特有的
    }
    public static void main1(String[] args) {
        Animal animal = new Animal("doudou");
        Cat cat = new Cat("maomao");
    }
}
