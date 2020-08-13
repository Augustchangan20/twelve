public class TeatDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(11);
        myLinkedList.addLast(12);
        myLinkedList.addLast(13);
        myLinkedList.addLast(14);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(12));
        System.out.println(myLinkedList.contains(15));
        System.out.println(myLinkedList.size());


    }

}
