import java.util.*;
public class Practice13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y1, y2, y3, y4;
        float a, b, c;
        while (in.hasNextInt()) {
            y1 = in.nextInt();
            y2 = in.nextInt();
            y3 = in.nextInt();
            y4 = in.nextInt();
            a = (y1 + y3) / 2f;
            b = (y3 - y1) / 2f;
            c = (y4 - y2) / 2f;
            if ((a - ((y1 + y3) / 2)) != 0) {
                System.out.print("No");
                return;
            }
        if ((b - ((y3 - y1) / 2) != 0) || (b != ((y2 + y4) / 2))) {
            System.out.print("No");
            return;
        }
        if ((c - ((y4 - y2) / 2)) != 0) {
            System.out.print("No");
            return;
        }
        System.out.print((int) a + " " + (int) b + " " + (int) c);
        }
    }
}

// 	public static void main(String[] args) {
// 	    Scanner s = new Scanner(System.in);
// 	    int N= s.nextInt();
// 	    String C = s.next();
// 	    int column = (int) Math.round(N/2.0);
// 	    for (int i = 0; i < column; i++) {
// 	        for (int j = 0; j < N; j++) {
// 	            if (i == 0 || i == column-1) {
// 	                System.out.print(C);
// 	            }
// 	            else {
// 	                if (j == 0 || j == N-1) {
// 	                    System.out.print(C);
// 	                }
// 	                else {
// 	                    System.out.print(" ");
// 	                }
// 	            }
// 	        }
// 	        System.out.println();
// 	    }
// 	}
//}



//    public static void main(String[] args) {
//        Thread t = new Thread(){
//            public void run(){
//                dianping();
//            }
//        };
//        t.run();
//        System.out.print("dazhong");
//    }
//    static void dianping(){
//        System.out.print("dianping");
//    }
//}


//    static boolean out (char c){
//        System.out.println(c);
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int i = 0;
//        for (out('A');out('B')&&(i < 2);out('C')){
//            i++;
//            out('D');
//
//        }
//    }
//}

