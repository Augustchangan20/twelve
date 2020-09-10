import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack(){
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    public void push(int x) {
        stack.push(x);
        if (minStack.empty()){
            //最小栈内没有元素
            minStack.push(x);
        }else {
            //最小栈内有元素，拿到栈顶元素，和x进行比较
            int top = minStack.peek();
            if (x < top){
                minStack.push(x);
            }
        }
    }

    public void pop() {
        if (!stack.empty()){
            int tmp = stack.pop();
            if (tmp == minStack.peek()){
                minStack.pop();
            }
        }
    }
    public int top() {
        if (stack.empty()){
            return -1;
        }
        return stack.peek();

    }
    public int getMin() {
        if (stack.empty()){
            return -1;
        }
        return minStack.peek();
    }
}

