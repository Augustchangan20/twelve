import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.*;
public class Practice10 {
    public int findKth(int[] a, int n, int K) {
        return findKth(a, 0, n-1, K);
    }
    public int findKth(int[] a, int low, int high, int k) {
        int part = partation(a, low, high);
        if(k == part - low + 1)
            return a[part];
        else if(k > part - low + 1)
            return findKth(a, part + 1, high, k - part + low -1);
        else
            return findKth(a, low, part -1, k);
    }
    public int partation(int[] a, int low, int high) {
        int key = a[low];
        while(low < high) {
            while(low < high && a[high] <= key)
                high--;
            a[low] = a[high];
            while(low < high && a[low] >= key)
                low++;
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }
}

//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            String str = scanner.nextLine();
//            int[] num = new int[20];
//            for (int i = 0; i < str.length(); ++i) {
//                num[str.charAt(i)-'0']++;
//            }
//            for (int i=0; i<10; ++i) {
//                if (num[i] != 0) {
//                    System.out.println(i + ":" + num[i]);
//                }
//            }
//        }
//    }


//    public static void main(String[] args) {
//        Thread t = new Thread(){
//            public void run(){
//                pong();
//            }
//        };
//        t.run();
//        System.out.print("ping");
//    }
//    static void pong(){
//        System.out.print("pong");
//    }
//
//}

//    String str = new String("good");
//    char [] ch = {'a','b','c'};
//
//    public static void main(String[] args) {
//        Practice10 pr = new Practice10();
//        pr.change(pr.str,pr.ch);
//        System.out.print(pr.str + "and");
//        System.out.print(pr.ch);
//    }
//    public static void change(String str,char ch[]){
//        str  = "test ok";
//        ch[0]='g';
//    }
//
//}


//    public static int getValue(int i){
//        int result = 0;
//        switch (i){
//            case 1:
//                result = result + i;
//            case 2:
//                    result = result + i*2;
//            case 3:
//                result = result + i*3;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int tmp = getValue(2);
//        System.out.println("tmp" + tmp);
//    }
//}
