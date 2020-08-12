//单链表


import org.omg.CORBA.NO_IMPLEMENT;

public class TestDemo {
    //将两个升序链表合并为一个新的 升序 链表并返回
    public static Node mergeTwoLists(Node headA,Node headB) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while (headA != null && headB != null){
        if (headA.data < headB.data){
            tmp.next = headA;
            tmp = tmp.next;
            headA = headA.next;
        }else {
            tmp.next = headB;
            tmp = tmp.next;
            headB = headB.next;
        }
        }
        if (headA == null){
            tmp.next = headB;
        }
        if(headB == null){
            tmp.next = headA;
        }


        return newHead.next;

    }
    public static void creatCut(Node headA,Node headB){
        //两个单链表相交
        headA.next = headB.next.next;
    }
    //找到两个单链表相交的起始节点。
    public  static Node getIntersectionNode(Node headA, Node headB) {
        int lenA = 0;
        int lenB = 0;
        Node pl = headA;
        Node ps = headB;
        while (pl != null){
            lenA++;
            pl = pl.next;
        }
        while (ps != null){
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA -lenB;
        if (len < 0){
            pl = headB;
            ps = headA;
            len = lenB -lenA;
        }
        //此时pl是最长的单链表，让它走差值len步
        for (int i = 0; i < len ; i++) {
            pl = pl.next;
        }
        //此时pl和ps在同一起跑线上
//        while (ps != pl && ps != null && pl != null){
        while (ps != pl ){
            ps = ps.next;
            pl = pl.next;
        }
//        if(ps == pl && ps != null){
        if( ps != null){
            return pl;
        }
        return null;

    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(10);
        myLinkedList.addLast(22);
        myLinkedList.addLast(33);
        myLinkedList.addLast(44);
        myLinkedList.addLast(55);
        myLinkedList.display();

        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addLast(66);
        myLinkedList2.addLast(77);
        myLinkedList2.addLast(88);
        myLinkedList2.addLast(99);
        myLinkedList2.addLast(100);
        myLinkedList2.display();
        Node ret = mergeTwoLists(myLinkedList.head,myLinkedList2.head);
        myLinkedList2.display2(ret);
       /* creatCut(myLinkedList.head,myLinkedList2.head);
        Node ret = getIntersectionNode(myLinkedList.head,myLinkedList2.head);
        System.out.println(ret.data);*/


     /*   myLinkedList.display();
        Node ret = myLinkedList.partition(50);
        myLinkedList.display2(ret);*/

       /* System.out.println(myLinkedList.FindKthToTail(2).data);
        System.out.println(myLinkedList.FindKthToTail(1).data);*/
//        System.out.println(myLinkedList.FindKthToTail(0).data);
      /*  System.out.println(myLinkedList.middleNode().data);
        Node ret = myLinkedList.reverseList();
        myLinkedList.display2(ret);*/

     /*   myLinkedList.addLast(10);
        myLinkedList.addLast(11);
        myLinkedList.addLast(12);
        myLinkedList.addLast(13);*/
 /*       myLinkedList.display();
        //打印contains的两种方法
        System.out.println(myLinkedList.contains(11));
        boolean flg = myLinkedList.contains(14);
        System.out.println(flg);
        System.out.println(myLinkedList.size());
        myLinkedList.remove(10);
        myLinkedList.display();
        myLinkedList.remove(10);
        myLinkedList.display();
        myLinkedList.removeAllKey(13);
        myLinkedList.display();*/
       /* myLinkedList.clear();
        System.out.println("hhhhhhhh");*/

    }
    
}
