import com.sun.corba.se.impl.interceptors.SlotTableStack;

public class Practice4 {
    String str=new String("good");
    char []ch={'a','b','c'};

    public static void main(String[] args) {
        Practice4 ex =new Practice4();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+"and");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[]){
        str="test ok";
        ch[0]='g';
    }
}
//    public static void main(String[] sgf) {
//        StringBuffer a=new StringBuffer("A");
//        StringBuffer b=new StringBuffer("B");
//        operate(a,b);
//        System.out.println(a+"."+b);
//    }
//    static void  operate(StringBuffer x,StringBuffer y){
//        x.append(y);
//        y=x;
//    }
//}
//    public static void main(String[] args) {
//        int x,y;
//        x=5>>2;
//        y=x>>>2;
//        System.out.println(y);
//    }
//}
//
// public static int fac(int n){
//        System.out.println("n的阶乘为 n =" +n);
//        int result = 1;
//        int sum = 0;
//        for(int i = 1;i <= n;i++){
//            result *=i;
//            sum += result;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//
//            sum += fac(i);
//        }
//        System.out.println("sum =" + sum);
//    }
//}

