class Node{
    public int data;
    public Node next;


    public Node(int data) {
        this.data = data;
    }
}
public class MyQueue {
    public int usedSize;
    public Node front;//头
    public Node rear;//尾巴
    public boolean offer (int val){
        Node node = new Node(val);
        if (rear == null){
            this.front = node;
            this.rear = node;
        }else {
            this.rear.next = node;
            this.rear = node;
        }
        this.usedSize++;
        return true;
    }
    public int poll(){//出队，并删除
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int data = this.front.data;
        this.front = this.front.next;//删除头节点
        usedSize--;
        return data;
    }
    public
    int peek(){//出队
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return this.front.data;

    }
    public boolean isEmpty() {
        return this.usedSize == 0;
    }
    public int size() {
        return usedSize;
    }

}

