
    import java.util.Scanner;
    public class Practice5 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int y1, y2, y3, y4;
            float a, b, c;
            while (in.hasNextInt()) {
                y1 = in.nextInt();
                y2 = in.nextInt();
                y3 = in.nextInt();
                y4 = in.nextInt();
                a = (y1 + y3) / 2;
                b = (y3 - y1) / 2;
                c = (y4 - y2) / 2;
                if ((a - ((y1 + y3) / 2)) != 0) {
                    System.out.println("No");
                    return;
                }
                if ((b - ((y3 - y1) / 2) != 0) || (b != ((y2 + y4) / 2))) {
                    System.out.println("No");
                    return;
                }
                System.out.print((int) a + " " + (int) b + " " + (int) c);

            }
        }

    }
//    public static void main(String[] args) {
//        int num = 10;
//        System.out.println(test(num));
//    }
//    public static int test (int b){
//    try{
//        b += 10;
//        return b;
//    }
//    catch (RuntimeException e){
//
//    }
//    catch (Exception e2){
//    }
//    finally {
//        b+= 10;
//        return b;
//    }
//    }
//}

