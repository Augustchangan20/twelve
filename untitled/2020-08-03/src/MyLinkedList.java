

class Node{//节点
    public int data;//成员属性，没有初始化，默认值为0
    public Node next;//默认值为null,类比Person per = new Person; 这里Per是Person类型的.所以Next是Node类型的

   //构造一个节点
    public Node(int data){//Node产生节点就需要给它提供构造方法(带有一个参数的构造方法)，构造方法用来实例化对象
        this.data= data;
        this.next = null;//也可以不写，因为成员属性中它未初始化，默认值为null
    }
}


public class MyLinkedList {//无头单向非循环链表实现
    public Node head;// 默认值为null,head保存单链表头节点的地址，它是整个链表的成员属性，head有可能发生改变,


    //头插法  
    //单链表在插入的时候，要先绑定后面的
    public void addFirst(int data){
        Node node = new Node(data);//调用Node,产生节点,node保存对象的引用
        if (this.head == null){//第一次插入节点
            this.head = node;
            return;
        }
        node.next = this.head;//将旧的头节点data的地址赋值給新的node的next；单链表在插入的时候，要先绑定后面的
        head = node;
    }


    //尾插法  
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){//第一次插入
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null){//cur.next == null 的时候，node为尾节点
            cur = cur.next;
        }
        cur.next = node;
    }


    //任意位置插入,第一个数据节点为0号下标  
     public void addIndex(int index,int data){
        if (index == 0){
            this.addFirst(data);
            return;
        }
        if (index == this.size()){
            this.addLast(data);
            return;
        }
        Node node = new Node(data);
        //先找到 index 前一个位置的节点地址
        Node cur = searchIndex(index);//进行插入
        node.next = cur.next;
        cur.next = node;
     }
     private Node searchIndex(int index){//判断index位置的合法性
        if (index < 0 ||index > this.size()){
            throw new RuntimeException("index位置不合法");//手动抛出异常
        }
        Node cur = this.head;
        while ( index -1 !=0){
            cur = cur.next;
            index--;
        }
        return cur;
    }



     //查找是否包含关键字key是否在单链表当中    
    public boolean contains(int key){
        Node cur = this.head;

        while (cur != null){
            if (cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //得到单链表的长度    
    public int size(){
        Node cur = this.head;
        int count = 0;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    //删除第一次出现关键字为key的节点  
    private Node searchPrev(int key){
        Node prev = this.head;
        while (prev.next != null){
            if (prev.next.data == key){
                return prev;
            }else {
                prev = prev.next;
            }
        }
        return null;
    }
    public void remove(int key){
        if (this.head == null){
            return;
        }
        if (this.head.data == key){//删除的是不是头节点，是head直接后移
            this.head = this.head.next;
            return;
        }
        //找到删除节点的前驱
        Node prev = searchPrev(key);
        if (prev == null){
            System.out.println("无此节点");
            return;
        }
        //开始删除
        Node del = prev.next;
        prev.next = del.next;
    }



    //删除所有值为key的节点    
    public void removeAllKey(int key){
        Node prev = this.head;
        Node cur = prev.next;
        while (cur != null){
            if (cur.data == key){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;

            }
        }
        if (this.head.data==key){
            this.head = this.head.next;
        }
    }


    //打印单链表
    public void display(){
        Node cur = this.head;
       while (cur!=null){
           System.out.print(cur.data+" ");
            cur = cur.next;
    }
        System.out.println();
    }
    //可解决内存泄漏
    public void clear(){//释放内存
        this.head = null;

    }


    //反转单链表
    public Node reverseList() {
        Node cur = head;
        Node prev = null;
//        Node newHead = null;
        while(cur != null){
            Node curNext = cur.next;
//             if(curNext == null){
//                 newHead = cur;
//             }
            cur.next = prev;
            prev = cur;
            cur =  curNext;
        }
//         return newHead;
        return prev;
    }
    public void display2(Node newHead){
        Node cur = newHead ;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //找中间节点
    public Node middleNode() {
        Node slow = this.head;
        Node fast = this.head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    //查找倒数第k个值
    public Node FindKthToTail(int k) {
        Node slow = this.head;
        Node fast = this.head;
        if (this.head == null){
            return null;
        }
        if (k <= 0){
            System.out.println("k位置不合法");
            return null;
        }
        while (k-1 > 0){
            if (fast.next != null){
                fast = fast.next;
                k--;
            }else {
                System.out.println("无此节点");
                return null;
            }
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //链表分割
    public Node partition(int x) {
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null){
            if (cur.data < x){
                if (bs == null){
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }

            }else {
                if (as == null){
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        //1>判断bs是否为空  如果bs == null 返回as
        if (bs == null){
            return as;
        }
        //2>如果bs不为空  进行拼接
        be.next = as;
        //3> 如果ae不为空   ae的next值需要置为空
        if (ae != null){
            ae.next = null;
        }
        return bs;
    }

    //删除重复的节点
    public Node deleteDuplication()
    {
        Node newHead = new Node(-1);
        Node cur = this.head;
        Node tmp = newHead;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;//cur需要多走一步
            } else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }



    //判断回文结构
    public boolean chkPalindrome() {
        //单链表为空 肯定不是回文结构
        if (this.head == null){
            return false;
        }
        //只有头节点自己 必然是回文结构
        if (head.next == null){
            return true;
        }
        //1> 找到链表的中间节点
       Node slow = this.head;
       Node fast = this.head;
       while (fast != null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
       }
       //2> 反转链表的后半部分 slow肯定在中间部分
        Node cur = slow.next;
       while (cur != null){
           Node curNext = cur.next;
           cur.next = slow;
           slow = cur;
           cur = curNext;
       }
       //slow是最后一个节点了
       //3>head从头走 slow从尾巴走
        while (slow != this.head){
        if (this.head.data != slow.data){
           return false;
        }
        //如果单链表是偶数的情况
        if (this.head.next == slow){
            return true;
        }
            this.head = this.head.next;
            slow = slow.next;
    }
        return true;
    }


    //判断链表是否有环
    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
//                return true;
                break;
            }
        }
//        return  false;
        if (fast == null || fast.next == null){
            return false;
        }
        return true;
    }

    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        if (fast == null || fast.next == null){
            return null;
        }
        slow = this.head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
