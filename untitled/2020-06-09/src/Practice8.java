import java.util.*;
public class Practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = n; i >= 5; i--) {
            int tmp = i;
            while (tmp % 5 == 0) {
                res++;
                tmp /= 5;
            }
        }
        System.out.println(res);
    }
}
//    public static void main(String[] args) {
//        int i = 0;
//        Integer j = new Integer(0);
//        System.out.println(i == j);
//        System.out.println(j.equals(i));
//    }
//}


//    public static void main(String[] args) {
//        String x = "fmn";
//        x.toUpperCase();
//        String y = x.replace('f','F');
//        y = y + "wxy";
//        System.out.println(y);
//    }
//}


//    private static void testMethod(){
//        System.out.println("testMethod");
//    }
//
//    public static void main(String[] args) {
//        ((Practice8)null).testMethod();
//    }
//}

//    String str = new String(("hello"));
//    char[] ch = {'a', 'b'};
//
//    public static void main(String[] args) {
//        Practice8 ex = new Practice8();
//        ex.change(ex.str, ex.ch);
//        System.out.print(ex.str + " and ");
//        System.out.print(ex.ch);
//    }
//
//    public void change(String str, char ch[]) {
//        str = "test ok";
//        ch[0] = 'c';
//    }
//}
