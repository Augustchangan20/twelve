import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {
    public static void main4(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[8];


//        System.out.println("请输入数组，并以回车结束：");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("数组a为:" + Arrays.toString(a));
    }
    public static void main3(String[] args) {
            int[] tmp = new int[8];
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数组:");
            for(int i = 0; i < tmp.length; i++) {
                tmp[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(tmp));
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      String str = scanner.nextLine();
        System.out.println("请输入数组，并以回车结束：");
        int[] tmp = new int[10];
        for (int i = 0; i <tmp.length; i++) {
           tmp[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(tmp));
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();

            StringBuffer sb = new StringBuffer();//用来拼接
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);//charAt拿到i的下标 'a'
                String tmp = sb.toString();//tmp转为String字符串
                if (!tmp.contains(ch + "")) {//"a"
                    sb.append(ch);
                }
            }
            System.out.println(sb);
        }
    }
}
