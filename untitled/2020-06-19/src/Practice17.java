import java.util.*;
public class Practice17 {
    public static int lcm(int m, int n) {
        return (m * n) / gcd(m, n);
    }
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(lcm(a, b));
    }
}



//public class Practice17{
//    private int count;
//
//    public static void main(String[] args) {
//        Practice17 test = new Practice17(88);
//        System.out.println(test.count);
//    }
//    Practice17(int a){
//        count = a;
//    }
//}





//public class Practice17 {
//    public String name = "abc";
//
//    public static void main(String[] args) {
//        Practice17 test = new Practice17();
//        Practice17 testB = new Practice17();
//        System.out.println(test.equals(testB)+","+test.name.equals(testB.name));
//    }
//}
