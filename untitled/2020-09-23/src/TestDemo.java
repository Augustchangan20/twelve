/**
 * 泛型：
 * 实现一个通用栈----这个栈里面什么都可以放
 * 所有类的父类都是Object，所以int可换位Object
 * 这样栈就比较杂，而泛型则可以指定
 */
class MyStack{
    public Object[] elem;
    public int top;

    public MyStack(){
        this.elem = new Object[10];
    }
    public void push(Object val){
        this.elem[this.top] = val;
        this.top++;
    }
    public Object peek(){
        return this.elem[this.top-1];
    }

}

public class TestDemo {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push("hello");
        String ret = (String) myStack.peek();
        //强转字符串
        System.out.println(ret);
    }

}
