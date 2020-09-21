/**
 * Comparable 下的compareTo方法缺点：
 * 每次业务不同，需要修改类本身
 * !!!:自定义类型 为什么要实现可以比较
 */
class Student implements Comparable<Student>{
    public int age;
    public int score;
    public String name;

    public Student( String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
//        return this.age - o.age;
        return this.score - o.score;
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Student student1 = new Student("bit",22,66);
        Student student2 = new Student("ss",18,99);
        if (student1.compareTo(student2) < 0){
            System.out.println("student1xiao于student2");
        }


    }
}
