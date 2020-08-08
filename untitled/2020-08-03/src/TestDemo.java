//单链表



public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.display();
        myLinkedList.addLast(10);
        myLinkedList.addLast(11);
        myLinkedList.addLast(12);
        myLinkedList.addLast(13);
        myLinkedList.display();
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
        myLinkedList.display();

    }
    
}
