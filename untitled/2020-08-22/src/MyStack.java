import java.util.Arrays;
import java.util.Objects;

public class MyStack<T>{
    public T[]elem;//数组
    public int top;//表示当前可以存放数据元素的下标

    public MyStack() {
        this.elem = (T[]) new Object[10];
    }

    public void push(T val){
        if (full()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.top++] = val;//val存入栈顶，然后top++
    }
    public T pop() {//出栈    删除栈顶元素
        if (empty()){
            throw new RuntimeException("栈为空！");
        }
        T data = this.elem[this.top-1];//让top指向栈顶
        this.top--;
        return data;
       // return this.elem[--this.top];


    }
    public T peek() {//拿到栈顶元素但是不删除
        if (empty()){
            throw new RuntimeException("栈为空！");
        }
        //让top指向栈顶
        return this.elem[this.top-1];

    }
    public boolean empty() {
        return this.top == 0;

    }
    public boolean full(){
        return this.top == this.elem.length;
    }
    public int size() {
        return this.top;
    }

}
