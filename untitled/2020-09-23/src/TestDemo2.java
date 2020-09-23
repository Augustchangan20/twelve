import org.omg.CORBA.Object;

import java.util.function.ObjIntConsumer;

/**
 * 泛型：
 * 1、<T>  表示占位符   说明当前类是泛型类
 * 2、放数据的时候，可以进行数据类型的检查
 * 3、取数据的时候，可以进行数据类型的检查
 * 4、泛型是怎末编译的？
 *    ！！！  泛型是在编译时期的一种机制----擦除机制。
 *    编译的时候，eg: (interger,String)等是被擦除为Object进行编译的，不是替换成Object
 *5、泛型是有边界的
 *
 * 注意泛型的坑：
 * 1>不能new泛型类数组
 * 2>简单类型不能作为泛型类型的参数
 *   eg: Mystack<int> mystack = new Mystack<>();
 * 3>泛型类型的参数，不参与类型的组成
 *
 *
 */
class MyStack1<T>{
    public T[] elem;
    public int top;

    public MyStack1(){
        //this.elem = new T[10];    ---error不能new泛型类数组
        this.elem = (T[])new Object[10];
        //只能new一个Object数组，再进行强转
    }
    public void push(T val){
        this.elem[this.top] = val;
        this.top++;
    }
    public T peek(){
        return this.elem[this.top-1];
    }

}

public class TestDemo2 {
    public static void main(String[] args) {
        MyStack1<Integer> myStack1 = new MyStack1();
        //指定整形
        myStack1.push(10);
        myStack1.push(20);
        int ret =  myStack1.peek();
        System.out.println(ret);
        MyStack1<String> myStack2 = new MyStack1<>();
        //指定字符串
        myStack2.push("abcd");
        myStack2.push("efgh");
    }

}
