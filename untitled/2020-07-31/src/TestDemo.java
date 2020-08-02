public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
//        myArrayList1.add(0,12);
//        myArrayList1.add(1,24);
//        myArrayList1.add(2,34);

        for (int i = 0; i <10 ; i++) {
            myArrayList1.add(i,i);
        }
        myArrayList1.display();//打印顺序表
        myArrayList1.add(10,112);
        myArrayList1.display();
        System.out.println("=======");
        System.out.println(myArrayList1.search(5));
        System.out.println(myArrayList1.contains(5));
        System.out.println(myArrayList1.getPos(4));
        myArrayList1.setPos(10,666);
        myArrayList1.display();
        myArrayList1.remove(6);
        myArrayList1.display();
        System.out.println("清除顺序表");
        myArrayList1.clear();
        myArrayList1.display();


    }
}
