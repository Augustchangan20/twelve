//单链表



public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(10);
        myLinkedList.addLast(22);
        myLinkedList.addLast(88);
        myLinkedList.addLast(66);
        myLinkedList.addLast(13);
        myLinkedList.display();
        Node ret = myLinkedList.partition(50);
        myLinkedList.display2(ret);

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
