import java.util.*;
public class Practice26 {
    //最高分数是多少
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int[] score = new int[n];
                String operation= null;
                int a = 0;
                int b = 0;
                for (int i = 0; i < n; i++) {
                    score[i] = sc.nextInt();
                }
                sc.nextLine();
                for (int j = 0; j < m; j++) {
                    String[] strs = sc.nextLine().split(" ");
                    operation = strs[0];
                    a = Integer.parseInt(strs[1])-1;
                    b = Integer.parseInt(strs[2])-1;
                    int max = 0;
                    if(operation.equals("Q")) {
                        for(int k = Math.min(a, b);k<=Math.max(a, b);k++) {
                            max = Math.max(max, score[k]);
                        }
                        System.out.println(max);
                    }
                    if(operation.equals("U")) {
                        score[a] =b+1;
                    }
                }
            }
        }
}
