import java.util.*;
public class Practice20 {
    //有一个神奇的口袋，总的容积是40，用这个口袋可以变出一些物品，这些物品的总体积必须是40。John现在有n个想要得到的物品，每个物品的体积分别是a1，a2……an。John可以从这些物品中选择一些，如果选出的物体的总体积是40，那么利用这个神奇的口袋，John就可以得到这些物品。现在的问题是，John有多少种不同的选择物品的方式。
    static int[] weight;
    static int N;
    static int count=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            N = input.nextInt();
            weight = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                weight[i] = input.nextInt();
            }
            count(40, N);
            System.out.println(count);
        }
    }
    public static void count(int s,int n) {
        if(s==0) {
            ++count;
            return ;
        }
        if(s<0||(s>0&&n<1))
            return ;
            count(s-weight[n],n-1);
            count(s,n-1);
    }
}


//public class Practice20 {
//    //百万富翁问题
//    public static void main(String[] args) {
//        int strange = 0;
//        int rich = 0 ;
//        strange = 10*30;
//        rich =(int)( Math.pow(2,30) - 1);
//        System.out.print(strange + " " + rich);
//    }
//}


//public class Practice20 {
//    public String str = "6";
//
//    public static void main(String[] args) {
//        Practice20 pr = new Practice20();
//        pr.change(pr.str);
//        System.out.println(pr.str);
//    }
//    public void change (String str){
//        str = "10";
//    }
//}



//public class Practice20 {
//    private static int x =100;
//
//    public static void main(String[] args) {
//        Practice20 hs1 = new Practice20();
//        hs1.x++;
//        Practice20 hs2 = new Practice20();
//        hs2.x++;
//        hs1 = new Practice20();
//        hs1.x++;
//        Practice20.x--;
//        System.out.println("x =" + x);
//    }
//}
