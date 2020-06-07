import java.util.*;
public class practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = min(a,b);
        int n = a*b / m;
        System.out.println(n);
    }
    public static int min(int a,int b){
        if (a < b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0){
            if (a == b){
                return a;
            }else {
                int k = a % b;
                a = b;
                b = k;
            }
        }
        return a;
    }
}
