import java.util.*;
public class Practice24{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res="";
        while(num!=0){
            int t1=num%10;
            int t2=num/10;
            res=res+String.valueOf(t1);
            num=t2;
        }
        System.out.println(res);
    }
}






//import java.util.*;
//public class Practice24 {
//    //牛客--到底买不买问题
//    public static void main(String[] args) {
//        Scanner sc=new Scanner (System.in);
//        String a=sc.nextLine();
//        String ar=sc.nextLine();
//        int c=0;
//        int cha=0;
//        StringBuffer ab=new StringBuffer(a);
//        StringBuffer arb=new StringBuffer(ar);
//        for(int i=0;i<arb.length();i++) {
//            int b=0;
//            for(int j=0;j<ab.length();j++) {
//                if(arb.charAt(i)==ab.charAt(j)) {
//                    c++;
//                    b++;
//                    ab.deleteCharAt(j);
//                    break;
//                }
//            }
//            if(b==0) {
//                cha++;
//            }
//        }
//        if(c==arb.length()) {
//            System.out.print("Yes"+" "+(a.length()-arb.length()));
//        }
//        else {
//            System.out.print("No"+" "+(cha));
//        }
//    }
//}

