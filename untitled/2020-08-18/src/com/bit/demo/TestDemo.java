package com.bit.demo;

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
        System.out.println(this.name+    "Animal::eat()");
    }
}
class Cat extends Animal{
    public Cat(String name){//先给父类构造
        super(name);//显示调用
        System.out.println("Cat(String)");
    }
      /*  public String name;
        public void eat(){
            System.out.println( "Cat::eat()");
        }*/
}
class ChineseGardenCat extends Cat{

    public ChineseGardenCat(String name) {
        super(name);
    }
}
class OrangrGardenCat extends Cat {//子类继承父类不要超过三层

    public OrangrGardenCat(String name) {
        super(name);//调用父类构造方法
    }
}
class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    /* public String name;
        public void eat(){
            System.out.println("Bird::eat()");
        }*/
    public void fly(){
        System.out.println(this.name + "Bird::fly()");
    }
}


public class TestDemo {
    public static void main(String[] args) {
        ChineseGardenCat chineseGardenCat =new ChineseGardenCat("maiomaio");
        chineseGardenCat.eat();
    }
    public static void main1(String[] args) {
        Cat cat = new Cat("mimi");
        cat.eat();
        Bird bird = new Bird("wangwang");
        bird.fly();
        bird.eat();
    }
}
