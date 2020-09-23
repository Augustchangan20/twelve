import java.util.*;


public class TestDemo5 {
    /**
     * list当中有10_0000个数据，统计重复数以及出现的次数
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10_0000 ; i++) {
            list.add(random.nextInt(6000));
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        //key---关键字重复的数
        //val---重复数出现的次数
        for (Integer key : list) {
            if (map.get(key) == null){
                map.put(key,1);
            }else {
                Integer val = map.get(key);
                map.put(key,val+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"这个数出现了" +entry.getValue()+"次！");
        }
    }

    /**
     * list当中有10_0000个数据，把重复的数全部去除
     * @param args
     */
    public static void main4(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10_0000 ; i++) {
            list.add(random.nextInt(6000));
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer val : list){
            set.add(val);
        }
        System.out.println(set);
    }
    /**
     * 找出10_0000个元素中，第一个重复的元素
     */
    public static void main3(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10_0000 ; i++) {
            //0-6000间的随机数
            list.add(random.nextInt(6000));
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer val: list) {
            if (set.contains(val)){
                System.out.println("找到了" +val);
                return;
            }else {
                set.add(val);
            }
        }
    }
    public static void main2(String[] args) {
        //set中不能存放重复的数据
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(9);
        System.out.println(set);
        //迭代器-----遍历并打印
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            //打印it的下一个，并向后走一步
        }
    }
    public static void main1(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("mengde","caocao");
        map.put("xiaozhang","zahngfei");
        map.put("xiaoguan","guanyu");
        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
