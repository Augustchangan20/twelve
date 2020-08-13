import com.sun.jmx.snmp.SnmpOidDatabase;

class Node{
    public int data;//数据
    public Node prev;//前驱信息
    public Node next;//后继信息

    public Node(int data ){//构造方法
        this.data = data;
    }
}

public class MyLinkedList {
    public Node head;//标志双向链表的头
    public Node tail;//标志双向链表的尾巴

    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head == null ){
            this.head = node;
            this.tail = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }

    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            this.tail = node;
        }else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;

        }

    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        return false;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){

    }
    //删除所有值为key的节点
    public void removeAllKey(int key){

    }
    //得到单链表的长度
    public int size(){
        int count = 0;
        Node cur = this.head;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    //打印双向链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear(){

    }

}
