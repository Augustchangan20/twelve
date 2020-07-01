import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class practice29 {
    //成绩排序
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int numPeople = scanner.nextInt();
            int option = scanner.nextInt();
            List<Student> stuList = new ArrayList<>();
            for (int i = 0; i < numPeople; i++) {
                stuList.add(new Student(scanner.next(), scanner.nextInt()));
            }
            if (option == 0) {
                stuList.sort((o1, o2) -> o2.score - o1.score);
            }
            else if (option == 1) {
                stuList.sort((o1, o2) -> o1.score - o2.score);
            }
            for (Student student : stuList) {
                System.out.println(student.name + " " + student.score);
            }
        }
    }
}
class Student {
    public String name;
    public int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}



//import java.util.*;
//public class practice29 {
//    //数字之和
//    public static void main( String[] args ){
//        Scanner sc = new Scanner( System.in);
//        while( sc.hasNext()){
//            int n = sc.nextInt();
//            if( n <= 0 || n >= 40000 ){
//                return;
//            }
//            int m = n*n;
//            int sum1 = 0;
//            int sum2 = 0;
//            while( n > 0 ){
//                sum1 += n%10;
//                n = n /10;
//            }
//            while ( m > 0){
//                sum2 += m % 10;
//                m = m /10;
//            }
//            System.out.println(sum1 +" "+ sum2);
//        }
//    }
//}

