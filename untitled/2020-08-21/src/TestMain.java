import sun.font.CreatedFontTracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    //遍历List集合，把学生的属性打印出来
    public String name;
    public String classroom;
    public double score;

    public Student(String name, String classroom, double score) {
        this.name = name;
        this.classroom = classroom;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", score=" + score +
                '}';
    }
}
public class TestMain {
    public static List<Character> func(String str, String str2){
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (!str2.contains(ch+"")){
                list.add(ch);
        }
    }
    return list;
}

    public static void main(String[] args) {
        String str = "welcome to bit ";
        String str2 = "come";
        List<Character> ret =  func(str,str2);
        for (char ch: ret) {
            System.out.print(ch);
        }
    }
    public static void main2(String[] args) {
        //有一个list当中存放的是整形的数据，要求使用Collections.sort对list进行排序
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);//对List进行排序
        System.out.println(list);
    }
    public static void main1(String[] args) {
        Student student = new Student("song","bit",88.8);
        Student student2  = new Student("hao","bit",66.6);
        List<Student> list = new ArrayList<>() ;
        list.add(student);
        list.add(student2);
        System.out.println(list);
    }
}
