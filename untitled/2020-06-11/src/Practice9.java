import sun.applet.AppletResourceLoader;

import java.time.temporal.Temporal;
 import java.util.*;
public class Practice9 {
        public static void main(String[]args){
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int f1=0;
            int f2=1;
            int f3=0;
            while (f2 < n){
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
            if(Math.abs(f2 - n) > Math.abs(f1 - n)){
                System.out.println(Math.abs(f1-n));
            } else{
                System.out.println(Math.abs(f2-n));
            }
        }
    }



//    public int add(int a,int b){
//        try {
//            return  a+b;
//        }
//        catch (Exception e){
//            System.out.println("catch语句块");
//        }
//        finally {
//            System.out.println("finally语句块");
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        Practice9 test = new Practice9();
//        System.out.println("和是：" +test.add(9,34));
//    }
//}




//    public static void main(String[] args) {
//        StringBuffer a = new StringBuffer("A");
//        StringBuffer b =new StringBuffer("B");
//        operator(a,b);
//        System.out.println(a + "," + b);
//    }
//    public static void operator(StringBuffer x,StringBuffer y){
//        x.append(y);
//        y = x;
//    }
//}


//    public static void main(String[] args) {
//        try {
//            int i =100/0;
//            System.out.print(i);
//        }catch (Exception e){
//            System.out.print(1);
//            throw  new RuntimeException();
//        }finally {
//            System.out.print(2);
//        }
//        System.out.print(3);
//    }
//}



//    public static void main(String[] args) {
//        Object o = new Object(){
//            public boolean equals (Object obj){
//                return true;
//            }
//        };
//        System.out.println(o.equals("Fred"));
//    }
//}
