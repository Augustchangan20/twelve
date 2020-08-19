package com.bit.demo4;

import java.util.Arrays;
//接口的使用实例：
//一般情况下： 自定义类型进行比较 需要是 可比较的
//Comparable     Compartor   两个都可以用来进行比较
class Student implements Comparable<Student>{//<>里面写要比较的是什么
    public String name;
    public int age;
    public int score;
    //alt+insert
    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
       if (this.score < o.score){//改成小于号会是从大到小排序
           return 1;
       }else if (this.score == o.score){
           return 0;
       }else {
           return -1;
       }
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student student1 = new Student("song",17,99);
        Student student2 = new Student("hao",18,88);
        Student student3 = new Student("liu",19,66);
     /*   if (student1.compareTo(student2) < 0){
            System.out.println("song比hao小");
        }
*/
        Student [] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        Arrays.sort(students);//Arrays.sort默认从小到大排序
        System.out.println(Arrays.toString(students));
    }

}
