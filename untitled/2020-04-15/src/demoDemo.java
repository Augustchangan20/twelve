import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.*;

//public class demoDemo {
//    public static int fac(int n){
//        int tmp = 1;
//       for (int i = 0;i <= n;i++){
//           tmp *= i;
//       }
//      return tmp;
//}
//    public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    int a = scan.nextInt();
//        int sum = 0;
//    for (int i = 1;i <= a;i++){
//
//        sum += fac(i);
//    }
//    System.out.println("sum=" + sum);
//    }
//}



//    public static void main(String[] args) {
//        int []arr={1,1,2,2,4,3,4,5,5};
//        int i=0;
//        int j=0;
//        int count;
//        for(i=0;i<9;i++){
//            count =0;
//            for(j=0;j<9;j++){
//                if(arr[i]==arr[j])
//                    count ++;
//
//            }if(count==1){
//                System.out.println(arr[i]);
//            }
//        }
//    }
//}



//斐波那契
//    public static int fibonacci(int n) {
//        if(n == 1 || n == 2) {
//            return 1;
//        }
//        return fibonacci(n-1)+fibonacci(n-2);
//    }
//
//    public static void main(String[] args) {
//        int ret = 0;
//        ret = fibonacci(8);
//                System.out.println("此项斐波那契数为：" + ret);
//    }
//}



//找出出现一次的数字
//    public static int findNumber(int[] num) {
//        int n = 0;
//        for(int i = 0;i<num.length;i++){
//            n ^= num[i];
//        }
//        return n;
//    }
//    public static void main(String[] args) {
//        int [] arr = {1,1,2,2,3,4,4,5,5};
//        int tmp = findNumber(arr);
//        System.out.print("这个数字为：" + tmp);
//    }
//}
//    public static int add(int a,int b){
//        int num = a + b;
//        return num;
//    }
//
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int ret = add(a,b);
//        System.out.println("ret = " + ret);
//    }
//}

