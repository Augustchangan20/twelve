import java.lang.reflect.Array;
import java.util.*;
public class Practice7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            String [] strs = str.split(" ");
            int len = strs.length;
            int[] arr = new int[len - 1];
            for (int i = 0;i< arr.length;i++){
                arr[i] = Integer.valueOf(strs[i]);
             }
            int k = Integer.valueOf(strs[len - 1]);
            Arrays.sort(arr);
            for (int i = 0;i<k;i++){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
//    static int cnt = 6;
//    static {
//        cnt += 9;
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println("cnt = " + cnt);
//    }
//    static {
//        cnt /=3;
//    }
//}
//    public static void main(String[] args) {
//        System.out.println(new B().getValue());
//    }
//    static class  A{
//        protected int value;
//        public A(int v){
//            setValue(v);
//        }
//        public void setValue(int value){
//            this.value = value;
//        }
//        public int getValue(){
//            try {
//                value++;
//                return value;
//            }catch (Exception e){
//                System.out.println(e.toString());
//            }finally {
//                this.setValue(value);
//                System.out.println(value);
//            }
//            return value;
//        }
//
//    }
//    static class B extends A{
//        public B(){
//            super(5);
//            setValue(getValue()-3);
//        }
//        public void setValue(int value){
//            super.setValue(2*value);
//        }
//    }
//}
