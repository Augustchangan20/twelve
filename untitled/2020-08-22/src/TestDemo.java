import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestDemo {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else {
                if (stack.empty()){
                    System.out.println("右括号多！");
                    return false;
                }
                //拿到栈顶的括号
                char ch2 = stack.peek();
                if (ch2 == '('&&ch == ')' || ch2 == '['&&ch == ']' || ch2 == '{'&&ch == '}'){
                    stack.pop();
                }else {
                    System.out.println("左右括号不匹配！");
                    return false;
                }
            }
        }
        if (!stack.empty()){
            System.out.println("左括号多！");
            return false;
        }
        return true;

    }
    public static void main3(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        System.out.println(myQueue.size());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.size());
    }
    public static void main2(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);//offer添加元素
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.peek());//拿到对头元素，但不删除
        System.out.println(queue.poll());//出队列
        System.out.println(queue.peek());
    }
    public static void main1(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.size());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        System.out.println(myStack.peek());
    }
}
