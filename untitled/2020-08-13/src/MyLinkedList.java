import com.sun.jmx.snmp.SnmpOidDatabase;
import sun.applet.AppletResourceLoader;

import java.math.BigDecimal;

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
    private void checkIndex(int index){
        if (index < 0 || index > size()){
            throw new RuntimeException("index不合法");
        }
    }
    private Node searchIndex(int index){
        Node cur = this.head;
        while (index != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        checkIndex(index);//检查Index的合法性
        if (index == 0){
            addFirst(data);
            return;
    }
        if (index == size()){
            addLast(data);
            return;
    }
    Node cur = searchIndex(index);//往中间插入
    Node node = new Node(data);
    node.next = cur;
    node.prev = cur.prev;
    cur.prev.next = node;
    cur.prev = node;
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
    public int remove(int key){
        Node cur = this.head;//局部变量，函数结束就会消失
        while (cur != null){
            if (cur.data == key){
                int oldDate = cur.data;
                if (cur == this.head){//key为头节点
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null){
                        cur.next.prev = cur.prev;
                    }else {
                        //删除的是尾巴节点，只需要移动tail
                        this.tail = cur.prev;
                    }
                }
                return oldDate;
            }
            cur = cur.next;
        }
        return -1;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node cur = this.head;
        while (cur != null){
            if (cur.data == key){
                if (cur == this.head){
                    this.head = this.head.next;
                    if (cur.next != null){
                        cur.prev = null;
                    }
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null){
                        cur.next.prev = cur.prev;
                    }else {
                        this.tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
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
        while (this.head != null){
            Node cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.tail = null;
    }
}
