import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 比较器：
 */
class Person{
    public int age;
    public int score;
    public String name;

    public Person(int age, int score, String name) {
        this.age = age;
        this.score = score;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        AgeComparator ageComparator = new AgeComparator();
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(ageComparator);
        //优先级队列，底层默认是一个小根堆
        priorityQueue.offer(new Person(66,99,"ss"));
        priorityQueue.offer(new Person(77,88,"www"));
        System.out.println(priorityQueue);

    }
    public static void main2(String[] args) {
        Person person1 = new Person(55,66,"biy");
        Person person2 = new Person(66,99,"ss");
        Person person3 = new Person(77,88,"www");
        Person[] people = new Person[3];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        AgeComparator ageComparator = new AgeComparator();
        Arrays.sort(people,ageComparator);
        System.out.println(Arrays.toString(people));
    }
    public static void main1(String[] args) {
        Person person1 = new Person(55,66,"biy");
        Person person2 = new Person(66,99,"ss");
        AgeComparator ageComparator = new AgeComparator();
        System.out.println(ageComparator.compare(person1, person2));
        ScoreComparator scoreComparator = new ScoreComparator();
        System.out.println(scoreComparator.compare(person1, person2));

    }


}
