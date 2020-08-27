import java.util.*;
public class QueueStack {
    //用两个队列实现栈
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    public QueueStack(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }


    /** Push element x onto stack. */
    public void push(int x) {
        if (!queue1.isEmpty()){
            queue1.offer(x);
    }else if (!queue2.isEmpty()){
            queue2.offer(x);
        }else{
            queue1.offer(x);
        }
    }


    /** Removes the element on top of the stack and returns that element. */
    public int pop() {//出栈
        if (empty()) {
            return -1;
        }
        int qSize1 = queue1.size();
        int qSize2 = queue2.size();//size一直变化，所以记录下来
        int data = 0;
        if (!queue1.isEmpty()){
            for (int i = 0; i < qSize1 - 1  ; i++) {
                queue2.offer(queue1.poll());
            }
            data = queue1.poll();
        }else {
            for (int i = 0; i < qSize2 - 1 ; i++) {
                queue1.offer(queue2.poll());
            }
            data = queue2.poll();
        }
        return data;

    }

    /** Get the top element. */
    public int top() {//拿到栈顶元素不删除
        if (empty()) {
            return -1;
        }
        int qSize1 = queue1.size();
        int qSize2 = queue2.size();//size一直变化，所以记录下来
        int data = 0;
        if (!queue1.isEmpty()){
            for (int i = 0; i < qSize1 ; i++) {
                data = queue1.poll();
                queue2.offer(data);
            }
        }else {
            for (int i = 0; i < qSize2  ; i++) {
                data = queue2.poll();
                queue1.offer(data);
            }
        }
        return data;

    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if (queue1.isEmpty() && queue2.isEmpty()){
            return true;
        }
        return false;
        }

    }

