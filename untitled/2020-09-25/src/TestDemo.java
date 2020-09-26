import java.util.HashMap;

class HashBuck{
    static class Node{
        //静态内部类
        public int key;
        public int val;
        public Node next;
        public Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }
    public Node[] array = new Node[10];
    public int usedSize;
    public void put(int key,int val){
        int index = key % array.length;
        for (Node cur = array[index];cur != null;cur = cur.next){
            if (cur.key == key){
                //key相同，更新val
                cur.val = val;
                return;
            }
        }
        Node node = new Node(key,val);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;
        if (loadFactor() > 0.75){
            //负载因子大于0.75，进行扩容
            resize();
        }
    }
    public void resize(){
        Node[] newArray = new Node[2*this.array.length];
        for (int i = 0; i < array.length ; i++) {
            Node cur = array[i];
            while (cur != null){
                Node cueNext = cur.next;
                int index = cur.key % newArray.length;
                cur.next = newArray[index];
                newArray[index] = cur;
                cur = cueNext;
            }
        }
        array = newArray;
    }
    public double loadFactor(){
        return this.usedSize*1.0/this.array.length;
    }
    public int get(int key){
        int index = key % array.length;
        Node cur = array[index];
        while (cur != null){
            if (cur.key == key){
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        HashBuck hashBuck = new HashBuck();
        for (int i = 0; i < 8 ; i++) {
            hashBuck.put(i,i);
        }
        hashBuck.put(11,101);
        System.out.println(hashBuck.get(11));
    }
}
