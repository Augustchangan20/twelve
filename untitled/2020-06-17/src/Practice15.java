import java.util.*;
public class Practice15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            int max = 0,count=0,end=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                    count++;
                    if(max<count){
                        max= count;
                        end = i;
                    }
                }
                else{
                    count = 0;
                }
            }
            System.out.println(str.substring(end-max+1,end+1));
        }
    }
}

//    private float f = 1.0f;
//    int m = 12;
//    static int n = 1;
//
//    public static void main(String[] args) {
//        Practice15 t = new Practice15();
//    }
//}



//    public static void main(String[] args) {
//        A classa = new A("he");
//        A classb = new A("he");
//        System.out.println(classa == classb);
//    }
//}
//class A{
//    public A(String str){
//
//    }
//}
