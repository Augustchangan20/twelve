package com.bit.demo;

class Animal{
    public String name;
    public Animal(String name){//带有一个参数的构造方法
        this.name = name;
    }
    public void eat(){
        System.out.println(this.name + "正在吃" + "鱼");
    }
}
class Cat extends Animal{
    //Cat继承Aniaml 有name属性和eat方法了
    public String cute;
        //父类没有的，子类自己拥有的
        public void eat(){
            System.out.println(this.name + "正在吃" + "fish");
        }//子类中有方法和父类同名时，会发生运行时多态（动态绑定）
    public Cat(String name,String cute) {
        super(name);//调用父类的构造方法
        this.cute = cute;
    }
}


public class TestDemo {
    public static void main(String[] args) {
        //向上转型  父类引用 引用子类对象
        Animal animal = new Cat("xiaomao","可爱");
        animal.eat();
       /* Cat cat = new Cat();
        cat.eat();
*/
    }

}
